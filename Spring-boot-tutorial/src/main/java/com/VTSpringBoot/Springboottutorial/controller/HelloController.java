package com.VTSpringBoot.Springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class HelloController {

  @GetMapping("/")
    public String helloWorld(){
        return "Welcome to SpringBoot VT!!!";
    }

}
