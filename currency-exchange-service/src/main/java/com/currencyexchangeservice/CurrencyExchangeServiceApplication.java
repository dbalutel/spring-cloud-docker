package com.currencyexchangeservice;

import com.currencyexchangeservice.client.CurrencyConversionClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = CurrencyConversionClient.class)
@EnableEurekaClient
public class CurrencyExchangeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
    }
}
