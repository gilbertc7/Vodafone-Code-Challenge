package com.example.mobileSub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SerController {
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}

}
