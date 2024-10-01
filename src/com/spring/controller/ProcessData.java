package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/process")
public class ProcessData {

	@RequestMapping("/signin")
	// http://localhost:9090/spring-mvc/process/signin
	public String myLogin() {
		return "login";
	}
}
