package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot CI and CD and jenkins file using Jenkins!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello!!! CI/CD(added jenkins file) with health checking.";
    }
}