package com.bakeecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BakeryController {

	public BakeryController() {
		// super();
		// TODO Auto-generated constructor stub
		System.out.println("inside bakery controller");
	}

	@RequestMapping("/")
	public String homePage() {
		return "front";
	}
	@RequestMapping("/aboutus")
	public String gotoindex() {
		return "aboutus";
	}
	@RequestMapping("/home1")
	public String gotohome1() {
		return "home1";
	}
	@RequestMapping("/login2")
	public String gotologin() {
		return "login2";
	}
	@RequestMapping("/regis2")
	public String gotoregis() {
		return "regis2";
	}
	
	
}
