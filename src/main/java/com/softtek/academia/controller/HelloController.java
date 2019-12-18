package com.softtek.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("name", "Adrian S.");

		return "welcome";
	}
	
	
	@RequestMapping("/hi")
	public ModelAndView getHi() {
		
		return new ModelAndView("hi");
				
	}
	
}
