package com.example.vaccination.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {
    @GetMapping(value = "/")
    public String home(){
        return "hi";
    }
}