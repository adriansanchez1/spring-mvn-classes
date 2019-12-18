package com.softtek.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.softtek.academia.model.User;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	
	@RequestMapping("")
	public ModelAndView login() {
		
		User usr = new User();
		
		return new ModelAndView("login", "user", usr);
	}
	
	@RequestMapping(value ="/dopost", method =  RequestMethod.POST)
	public String getLogin(@ModelAttribute("user") User user) {
		if(user != null){
			
			if(user.getUsername().equals("adrian") && user.getPassword().equals("academia")) {
				return "logged";
			}else {
				return "restricted";
			}
			
		} else {
			return "restricted"; 
		}
	}
}
