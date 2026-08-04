package com.Bhargavi.SpringMVCBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Bhargavi.SpringMVCBoot.repository.AlienRepo;

@Controller
public class AlienController{
   
	AlienRepo repo;
	
	@RequestMapping("/")
	 public String home()
	 {
		return "home.jsp";
	 }
	/*public ModelAndView home(Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}*/
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAliens() {
		return repo.findAll().toString();
	}
}
