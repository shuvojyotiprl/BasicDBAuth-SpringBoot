package com.techpoint.spring.basicdbauth.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.techpoint.spring.basicdbauth.exception.CustomExeption;

@ControllerAdvice
public class DefaultExceptionHandler {
	
	@ExceptionHandler
	public ModelAndView handleCustomException(CustomExeption e) {
		System.out.println(e);
		ModelAndView mv = new ModelAndView("ErrorPage.jsp");
		mv.addObject("errorobj",e);
		return mv;
	}
}


