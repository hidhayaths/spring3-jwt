package com.hid.spring3jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String hello(Principal principal){
        return "hello "+principal.getName();
    }
}
