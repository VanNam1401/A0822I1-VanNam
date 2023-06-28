package com.example.prac_ss12_phone_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showIndex() {
        return "/index";
    }
}
