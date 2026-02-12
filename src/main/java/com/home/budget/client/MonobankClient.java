package com.home.budget.client;

import com.home.budget.model.mono.ClientInfo;
import com.home.budget.model.mono.CurrencyRateMono;
import com.home.budget.model.mono.Statement;
import com.home.budget.model.mono.SyncMono;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonobankClient {

    @Value("${monobank.token}")
    private String TOKEN;

    private final RestClient restClient;

    public List<CurrencyRateMono> getCurrency() {
        List<CurrencyRateMono> rates = restClient.get()
                .uri("https://api.monobank.ua/bank/currency")
                .retrieve()
                .body(new ParameterizedTypeReference<List<CurrencyRateMono>>() {
                });

        System.out.println("Response from Monobank API: ");
        for (CurrencyRateMono currencyRate : rates) {
            System.out.println(currencyRate);
        }
        return rates;
    }

    public SyncMono bankSync() {
        SyncMono syncMono = restClient.get()
                .uri("https://api.monobank.ua/bank/sync")
                .retrieve()
                .body(SyncMono.class);

        System.out.println(syncMono);
        return syncMono;
    }

    public ClientInfo getClientInfo() {
        ClientInfo cliInfo = restClient.get()
                .uri("https://api.monobank.ua/personal/client-info")
                .header("X-Token", TOKEN)
                .retrieve()
                .body(ClientInfo.class);

        return cliInfo;
    }

    // limitation 1 per 60 second
    public List<Statement> getStatement(String account, Long from, Long to) {

        List<Statement> statements = restClient.get()
                .uri(String.format("https://api.monobank.ua/personal/statement/%s/%d/%d", account, from, to))
                .header("X-Token", TOKEN)
                .retrieve()
                .body(new ParameterizedTypeReference<List<Statement>>() {
                });

        return statements;
    }
//
//    @PostConstruct
//    public void init() {
//        ClientInfo clientInfo = personalInfo();
//        clientInfo.getAccounts().forEach(account -> {
//            String accountId = account.getId();
//            String iban = account.getIban();
//            if(iban.contains("480176")) {
//                long now = System.currentTimeMillis();
//                getStatement(accountId, TimeUtilService.getDayBefore(now), now);
//            }
//        });
//    }

}
