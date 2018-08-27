package com.currencyconversionrates.currencyconversionservice.controller;

import com.currencyconversionrates.currencyconversionservice.model.CurrencyConversion;
import com.currencyconversionrates.currencyconversionservice.repository.CurrencyConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyConversionRepository currencyConversionRepository;

    @Autowired
    private Environment environment;

    @GetMapping("/conversion-rate/from/{from}/to/{to}")
    public CurrencyConversion getCurrencyConversion(@PathVariable String from, @PathVariable String to) {
        CurrencyConversion currencyConversion = currencyConversionRepository.findByFromAndTo(from, to);
        currencyConversion.setPort(Integer.valueOf(Objects.requireNonNull(environment.getProperty("local.server.port"))));
        return currencyConversion;
    }

}
