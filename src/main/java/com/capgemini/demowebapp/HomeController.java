package com.capgemini.demowebapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Controller to handle request localhost:8080
public class HomeController {
	@RequestMapping("home") // request mapping
//	@ResponseBody // it is used to send data
	public String home(HttpServletRequest req) {
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		System.out.println("hello "+name);
		session.setAttribute("name", name);
		return "home"; //page name
	}

}
