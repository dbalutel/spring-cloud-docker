package com.currencyexchangeservice.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversionDto {
    private String from;
    private String to;
    private BigDecimal conversionRate;
    private Integer port;
}
