package com.assignment1.demo.webcontent;

import java.net.InetAddress;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
@RequestMapping("/hello")
public String hello(Model model) {
	model.addAttribute("name", InetAddress.getLoopbackAddress().getHostName());
	return "hello";
}

}
