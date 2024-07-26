package com.kh.qrs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${msg}")
    private String msg;

    @GetMapping
    public String getEnvConfig() {
        return msg;
    }

}
