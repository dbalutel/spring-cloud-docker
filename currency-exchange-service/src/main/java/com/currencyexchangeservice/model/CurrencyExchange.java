package com.currencyexchangeservice.model;

import com.currencyexchangeservice.controller.dto.CurrencyConversionDto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyExchange {

    private BigDecimal exchangeResult;
    private Integer port;

    public CurrencyExchange(CurrencyConversionDto currencyConversion, BigDecimal amount) {
        this.exchangeResult = amount.multiply(currencyConversion.getConversionRate());
        this.port = currencyConversion.getPort();
    }
}
