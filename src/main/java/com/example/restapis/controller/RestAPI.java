package com.example.restapis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {
    @RequestMapping("/api")
    public String Hello (){
        return "<h1>Hello From BridgeLabz!!</h1>";
    }
}
