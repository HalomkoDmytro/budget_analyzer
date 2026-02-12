package com.home.budget.model.mono;

import com.home.budget.model.MerchantCategoryCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MonoStatementDto {

    private MerchantCategoryCode mcc;
    private Long amount;
//    private String currency;

}
