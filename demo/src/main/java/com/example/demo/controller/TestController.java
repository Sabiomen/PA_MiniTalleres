package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye, World!";
    }

    @GetMapping("/status")
    public String status() {
        return "Status: OK";
    }

    @GetMapping("/time")
    public String time() {
        return "Server time: " + System.currentTimeMillis();
    }

    @GetMapping("/random")
    public String random() {
        return "Random number: " + Math.random();
    }
}