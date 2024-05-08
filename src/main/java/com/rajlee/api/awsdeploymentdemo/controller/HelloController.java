package com.rajlee.api.awsdeploymentdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/java")
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "hello brother";
    }

    @GetMapping()
    public String home(){
        return "Hii i am on home page";
    }
}
