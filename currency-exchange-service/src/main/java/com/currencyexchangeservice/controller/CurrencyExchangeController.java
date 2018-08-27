package com.currencyexchangeservice.controller;

import com.currencyexchangeservice.client.CurrencyConversionClient;
import com.currencyexchangeservice.controller.dto.CurrencyConversionDto;
import com.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private CurrencyConversionClient currencyConversionClient;

    @GetMapping("/exchange/from/{from}/to/{to}/amount/{amount}")
    public CurrencyExchange getCurrencyExchange(@PathVariable String from,
                                                @PathVariable String to,
                                                @PathVariable BigDecimal amount) {


        CurrencyConversionDto currencyConversion = currencyConversionClient.getCurrencyConversion(from, to);

        return new CurrencyExchange(currencyConversion, amount);

    }
}
