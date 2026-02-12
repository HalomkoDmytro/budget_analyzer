package com.home.budget.model.mono;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Statement {

    @JsonProperty("id")
    private String id;

    @JsonProperty("time")
    private Long time;

    @JsonProperty("description")
    private String description;

    @JsonProperty("mcc")
    private Long mcc;

    @JsonProperty("originalMcc")
    private Long originalMcc;

    @JsonProperty("hold")
    private boolean hold;

    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("operationAmount")
    private Long operationAmount;

    @JsonProperty("currencyCode")
    private Long currencyCode; // ISO 4217

    @JsonProperty("commissionRate")
    private Long commissionRate;

    @JsonProperty("cashbackAmount")
    private Long cashbackAmount;

    @JsonProperty("balance")
    private Long balance;

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("receiptId")
    private String receiptId;

    @JsonProperty("invoiceId")
    private String invoiceId;

    @JsonProperty("counterEdrpou")
    private String counterEdrpou;

    @JsonProperty("counterIban")
    private String counterIban;

    @JsonProperty("counterName")
    private String counterName;

    @Override
    public String toString() {
        return "Statement{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", description='" + description + '\'' +
                ", mcc=" + mcc +
                ", originalMcc=" + originalMcc +
                ", hold=" + hold +
                ", amount=" + amount +
                ", operationAmount=" + operationAmount +
                ", currencyCode=" + currencyCode +
                ", commissionRate=" + commissionRate +
                ", cashbackAmount=" + cashbackAmount +
                ", balance=" + balance +
                ", comment='" + comment + '\'' +
                ", receiptId=" + receiptId +
                ", invoiceId='" + invoiceId + '\'' +
                ", counterEdrpou='" + counterEdrpou + '\'' +
                ", counterIban='" + counterIban + '\'' +
                ", counterName='" + counterName + '\'' +
                '}';
    }

}
