package com.capgemini.demowebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Controller to handle request localhost:8080
public class HomeController {
	@RequestMapping("home") // request mapping
//	@ResponseBody // it is used to send data 
	public String home() {
		System.out.println("hello");
		return "home"; //page name
	}

}
