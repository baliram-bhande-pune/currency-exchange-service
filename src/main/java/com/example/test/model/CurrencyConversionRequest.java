package com.example.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
/**
 * This is the CurrencyConversionRequest mode class
 */
public class CurrencyConversionRequest {
    private String sourceCurrency;
    private String targetCurrency;
    private double amount;
}
