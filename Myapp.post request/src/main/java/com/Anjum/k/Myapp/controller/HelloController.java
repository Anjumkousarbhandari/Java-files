package com.Anjum.k.Myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Anjum.k.Myapp.controller.dto.Details;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String hello (Details details) {
		System.out.println(details);
		
		return "index.jsp";
	}
}
