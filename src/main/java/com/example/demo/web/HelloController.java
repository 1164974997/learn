package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello123")
    public String hello123() {
        return "Hello123!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}

