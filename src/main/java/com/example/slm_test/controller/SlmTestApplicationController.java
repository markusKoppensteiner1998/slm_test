package com.example.slm_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlmTestApplicationController {

    @RequestMapping("/api/get")
    public String getMesage(){
        return "ok";
    }
}
