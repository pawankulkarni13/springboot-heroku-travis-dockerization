package com.stark.springbootherokutravisdockerization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello to World from Pawan !";
    }
}
