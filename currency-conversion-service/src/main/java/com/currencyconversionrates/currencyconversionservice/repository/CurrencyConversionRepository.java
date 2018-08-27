package com.currencyconversionrates.currencyconversionservice.repository;

import com.currencyconversionrates.currencyconversionservice.model.CurrencyConversion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyConversionRepository extends JpaRepository<CurrencyConversion, Long> {
    CurrencyConversion findByFromAndTo(String from, String to);
}
