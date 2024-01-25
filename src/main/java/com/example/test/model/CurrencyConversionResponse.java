package com.example.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
/**
 * This is the CurrencyConversionResponse mode class
 */
public class CurrencyConversionResponse {
    private String sourceCurrency;
    private String targetCurrency;
    private double sourceAmount;
    private double targetAmount;
}
