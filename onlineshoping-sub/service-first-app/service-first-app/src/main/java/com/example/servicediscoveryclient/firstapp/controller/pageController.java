package com.example.servicediscoveryclient.firstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("firstapp")
public class pageController {
	
	@GetMapping("/payment")
	public String payment() {
		return "payment";
	}
}
