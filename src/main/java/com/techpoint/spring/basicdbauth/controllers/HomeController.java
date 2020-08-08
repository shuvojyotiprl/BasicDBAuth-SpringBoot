package com.techpoint.spring.basicdbauth.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.techpoint.spring.basicdbauth.exception.CustomExeption;

@Controller
public class HomeController {
	
	
	@RequestMapping("")
	@ResponseBody
	public ModelAndView defaultPage() {
		ModelAndView mv = new ModelAndView("Home.jsp");
		return mv;
	}
	
	@RequestMapping("/home")
	@ResponseBody
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView("Home.jsp");
		return mv;
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public ModelAndView userPage() {
		ModelAndView mv = new ModelAndView("User.jsp");
		return mv;
	}
	
	@RequestMapping("/admin")
	@ResponseBody
	public ModelAndView adminPage() {
		ModelAndView mv = new ModelAndView("Admin.jsp");
		return mv;
	}
	
	@RequestMapping("/public")
	@ResponseBody
	public String publicPage() throws CustomExeption {
		//System.out.println("Logging error");
		throw new CustomExeption("Exception in Public page",new Date(),'X');
		//return "PublicPage.jsp";
	}
}
