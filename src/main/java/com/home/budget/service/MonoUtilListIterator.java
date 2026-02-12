package com.home.budget.service;

import com.home.budget.client.MonobankClient;
import com.home.budget.client.TelegramClient;
import com.home.budget.model.Currency;
import com.home.budget.model.MerchantCategoryCode;
import com.home.budget.model.mono.Account;
import com.home.budget.model.mono.ClientInfo;
import com.home.budget.model.mono.MonoStatementDto;
import com.home.budget.model.mono.Statement;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class MonoUtilListIterator {

    private final MonobankClient monobankClient;
    private final TaskScheduler taskScheduler;
    private final TelegramClient telegramClient;

    private ScheduledFuture<?> scheduledTask;

    public void processWithInterval() {
        stopProcessing();

        long to = System.currentTimeMillis();
        Long from = TimeUtilService.getDayBefore(to);

        ClientInfo clientInfo = monobankClient.getClientInfo();
        List<Account> accounts = clientInfo.getAccounts();

        if (accounts == null || accounts.isEmpty()) {
            return;
        }

        AtomicInteger atomicInteger = new AtomicInteger(0);

        scheduledTask = taskScheduler.scheduleWithFixedDelay(
                () -> processNextOrder(accounts, atomicInteger, from, to),
                Duration.ofSeconds(60)
        );
    }

    private void processNextOrder(List<Account> statements, AtomicInteger currentIndex, Long from, Long to) {
        int index = currentIndex.getAndUpdate(i -> (i + 1) % statements.size());
        Account account = statements.get(index);

        System.out.println("Processing: " + account.getMaskedPan());
        List<Statement> statement = monobankClient.getStatement(account.getId(), from, to);
        if (statement != null && !statement.isEmpty()) {
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
        }

        if (index == statements.size() - 1) {
            stopProcessing();
        }
    }

    private void stopProcessing() {
        if (scheduledTask != null && !scheduledTask.isCancelled()) {
            scheduledTask.cancel(false);
            scheduledTask = null;
            System.out.println("Stopped processing");
        }
    }

    @PostConstruct
    public void init() {
        processWithInterval();
    }

}
