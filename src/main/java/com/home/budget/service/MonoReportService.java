package com.home.budget.service;

import com.home.budget.client.MonobankClient;
import com.home.budget.client.TelegramClient;
import com.home.budget.model.MerchantCategoryCode;
import com.home.budget.model.mono.Account;
import com.home.budget.model.mono.ClientInfo;
import com.home.budget.model.mono.MonoStatementDto;
import com.home.budget.model.mono.Statement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonoReportService {

    private final MonobankClient monobankClient;
    private final TelegramClient telegramClient;

    public void processWithInterval() {
        long to = System.currentTimeMillis();
        Long from = TimeUtilService.getDayBefore(to);

        ClientInfo clientInfo = monobankClient.getClientInfo();
        List<Account> accounts = clientInfo.getAccounts();

        accounts.forEach(account -> {
            try {
                Thread.sleep(TimeUtilService.MINUTE);
                List<Statement> statement = monobankClient.getStatement(account.getId(), from, to);
                Long sum = statement.stream().map(Statement::getAmount).reduce(0L, Long::sum);
                List<MonoStatementDto> list = statement.stream().map(st ->
                                        new MonoStatementDto(
                                                MerchantCategoryCode.fromCode(st.getMcc().toString()),
                                                st.getAmount()
//                                Currency.fromNumericCode(st.getCurrencyCode()).getName()
                                        )
                        )
                        .toList();

                telegramClient.sendMessage(list.toString());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
