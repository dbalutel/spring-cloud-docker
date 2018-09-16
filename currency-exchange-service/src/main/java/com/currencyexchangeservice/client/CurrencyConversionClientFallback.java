package com.currencyexchangeservice.client;

import com.currencyexchangeservice.controller.dto.CurrencyConversionDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CurrencyConversionClientFallback implements CurrencyConversionClient {
    @Override
    public CurrencyConversionDto getCurrencyConversion(String from, String to) {
        return new CurrencyConversionDto("null", "null", new BigDecimal("0"), 0);
    }
}
