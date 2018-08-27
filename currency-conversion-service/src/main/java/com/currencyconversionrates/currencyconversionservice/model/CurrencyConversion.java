package com.currencyconversionrates.currencyconversionservice.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "t_currency_conversion")
public class CurrencyConversion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "currency_from", columnDefinition = "varchar2(3)")
    private String from;

    @Column(name = "currency_to", columnDefinition = "varchar2(3)")
    private String to;

    @Column(name = "conversion_rate")
    private BigDecimal conversionRate;

    @Transient
    private Integer port;
}
