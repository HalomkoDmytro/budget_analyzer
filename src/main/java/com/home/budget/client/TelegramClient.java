package com.home.budget.client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@RequiredArgsConstructor
public class TelegramClient {

    @Value("${telegram.botId}")
    private String botId;

    @Value("${telegram.chatId}")
    private String chatId;

    private final RestClient restClient;

    public void sendMessage(String text) {
        restClient.post()
                .uri("https://api.telegram.org/bot" + botId + "/sendMessage")
                .contentType(APPLICATION_JSON)
                .body(new MessageDto(text, chatId))
                .retrieve()
                .toBodilessEntity();
    }

    private record MessageDto(String text, String chat_id) {
    }
}
