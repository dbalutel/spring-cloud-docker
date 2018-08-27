package com.currencyexchangeservice.controller.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyConversionDto {
    private String from;
    private String to;
    private BigDecimal conversionRate;
    private Integer port;
}
