package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot CI and CD using Jenkins!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello! Jenkins successfully built my Spring Boot....make.... application.";
    }
}