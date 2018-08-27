package com.currencyexchangeservice.client;

import com.currencyexchangeservice.controller.dto.CurrencyConversionDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-conversion-service")
@RibbonClient(name = "currency-conversion-service")
public interface CurrencyConversionClient {
    @GetMapping("/conversion-rate/from/{from}/to/{to}")
    CurrencyConversionDto getCurrencyConversion(@PathVariable("from") String from, @PathVariable("to") String to);
}
