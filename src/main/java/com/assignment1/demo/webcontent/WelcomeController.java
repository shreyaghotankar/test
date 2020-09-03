package com.assignment1.demo.webcontent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController {

    @Value("${servername}")
    private String serverName;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", serverName);
        return "hello";
    }
}