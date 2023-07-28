package com.fpt.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "/client/index";
	}

	@GetMapping("/home")
	public String home(Model model) {
		return "/client/index";
	}
	
	
//
//	@GetMapping("/logout")
//	public String logout(HttpServletRequest request, HttpSession session) {
//		session = request.getSession();
//		session.setAttribute("isLogin", "false");
//		session.setAttribute("accountSession", null);
//		return "redirect:/home";
//	}
//
//	@GetMapping("/test")
//	public String test() {
//		return "index";
//	}
}
