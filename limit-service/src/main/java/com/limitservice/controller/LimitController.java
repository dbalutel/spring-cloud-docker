package com.limitservice.controller;

import com.limitservice.config.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private LimitConfiguration limitConfiguration;

    @GetMapping("/limit")
    public LimitConfiguration getLimits() {
        return limitConfiguration;
    }
}
