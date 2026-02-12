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
public class Account {

    @JsonProperty("id")
    private String id;

    @JsonProperty("sendId")
    private String sendId;

    @JsonProperty("balance")
    private Long balance;

    @JsonProperty("creditLimit")
    private Long creditLimit;

    @JsonProperty("type")
    private String type;

    @JsonProperty("currencyCode")
    private Long currencyCode;

    @JsonProperty("cashbackType")
    private String cashbackType;

    @JsonProperty("maskedPan")
    private List<String> maskedPan;

    @JsonProperty("iban")
    private String iban;

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", sendId='" + sendId + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", type='" + type + '\'' +
                ", currencyCode=" + currencyCode +
                ", cashbackType='" + cashbackType + '\'' +
                ", maskedPan=" + maskedPan +
                ", iban='" + iban + '\'' +
                '}';
    }
}
