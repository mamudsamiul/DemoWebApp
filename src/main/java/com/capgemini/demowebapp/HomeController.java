package com.capgemini.demowebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Controller to handle request localhost:8080
public class HomeController {
	@RequestMapping("home") // request mapping
	public String home() {
		System.out.println("hello");
		return "home.jsp"; //page name
	}

}
