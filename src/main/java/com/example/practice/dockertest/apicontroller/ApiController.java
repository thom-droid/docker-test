package com.example.practice.dockertest.apicontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }
}
