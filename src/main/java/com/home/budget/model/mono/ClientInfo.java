package com.home.budget.model.mono;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientInfo {

    @JsonProperty("clientId")
    private String clientId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("webHookUrl")
    private String webHookUrl;

    @JsonProperty("permissions")
    private String permissions;

    @JsonProperty("accounts")
    private List<Account> accounts;

    // TODO: add jars

    // TODO: add managed clients

    @Override
    public String toString() {
        return "ClientInfo{" +
                "clientId='" + clientId + '\'' +
                ", name='" + name + '\'' +
                ", webHookUrl='" + webHookUrl + '\'' +
                ", permissions='" + permissions + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
