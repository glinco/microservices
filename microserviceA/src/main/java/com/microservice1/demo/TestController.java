package com.microservice1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
 
    @GetMapping("/info")
    public String getInfo() {
        return "Hello from Service A!";
    }
}

