package com.example.restapis.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestAPI {
    @RequestMapping(value = {"","/","/home"}, method = RequestMethod.GET)
    public String welcome(){
        return "<h1>Hello From BridgeLabz!!</h1>";
    }
    @RequestMapping(value = {"/greet/{name}"}, method = RequestMethod.GET)
    public String greet(@PathVariable String name) {
        return "Hello, " + name + " from BridgeLabz!!";
    }
}
