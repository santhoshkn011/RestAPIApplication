package com.example.restapis.controller;

import com.example.restapis.model.Entity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestAPI {
    @RequestMapping(value = {"","/","/home"}, method = RequestMethod.GET)
    public String welcome(){
        return "<h1>Hello From BridgeLabz!!</h1>";
    }

    //Use GET Request Method and pass name as query parameter
    @GetMapping("/query")
    public String getUsers(@RequestParam(value = "name", defaultValue = "Santhosh") String name) {
        return "<h1><font color=blue>Hello! " + name + " From BridgeLabz!!</font></h1>" +
                "</br> <font color=green>Passing name as a parameter.</font>";
    }
    //Use GET Request Method and pass name as path variable
    @RequestMapping(value = {"/query/{name}"}, method = RequestMethod.GET)
    public String greet(@PathVariable String name) {
        return "<h1><font color=orange>Hello! " + name + " From BridgeLabz!!</font></h1>" +
                "</br> <font color=yellow>Passing name as a path variable.</font>";
    }
    //Use POST Request Method and pass first name and last name in the Body
    @PostMapping("/post")
    public String post(@RequestBody Entity entity) {
        return "Hello " + entity.getFirstName() + " "+  entity.getLastName() + "!";
    }
    /*Use PUT Request Method and pass first name as
    Path Variable and last name as Query Parameter*/
    @PutMapping("/put/{firstName}")
    public String put(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
