package com.zxw.springbooterror.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        int i=3/0;
        return "Hello Spring Boot";
    }


}
