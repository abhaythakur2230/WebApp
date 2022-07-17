package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/wel")
	public ModelAndView welcomeMsg() {
		
		String msgTxt ="Welcome to AshokIT";
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg",msgTxt);
		mv.setViewName("WelcomeView");
		return mv;
	}
}
