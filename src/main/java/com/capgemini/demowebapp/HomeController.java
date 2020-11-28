package com.capgemini.demowebapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller // Controller to handle request localhost:8080
public class HomeController {
	@RequestMapping("home") // request mapping
//	@ResponseBody // it is used to send data
	public ModelAndView home(Employee emp) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",emp);
		mv.setViewName("home");
		return mv; //page name
	}

}
