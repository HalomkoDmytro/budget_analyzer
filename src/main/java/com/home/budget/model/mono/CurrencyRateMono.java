package com.home.budget.model.mono;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CurrencyRateMono {

    @JsonProperty("currencyCodeA")
    private Integer currencyCodeA;

    @JsonProperty("currencyCodeB")
    private Integer currencyCodeB;

    @JsonProperty("date")
    private Long date;

    @JsonProperty("rateSell")
    private Double rateSell;

    @JsonProperty("rateBuy")
    private Double rateBuy;

    @JsonProperty("rateCross")
    private Double rateCross;

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "currencyCodeA=" + currencyCodeA +
                ", currencyCodeB=" + currencyCodeB +
                ", date=" + date +
                ", rateSell=" + rateSell +
                ", rateBuy=" + rateBuy +
                ", rateCross=" + rateCross +
                '}';
    }
}
