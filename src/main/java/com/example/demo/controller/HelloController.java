package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
    @RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        int a=2;
        int b=3;
        int c=a+b;
//        c=c/0;

        return "Hello, Spring Boot!";
    }
}
