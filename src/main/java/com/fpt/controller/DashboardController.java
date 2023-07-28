//package com.fpt.controller;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.ecommerce.entities.Account;
//
//@Controller
//public class DashboardController {
//	@Autowired
//	HttpSession session;	
//	
//@GetMapping("/dashboard")
//public String index() {
//	boolean isLogin = Boolean.parseBoolean((String) session.getAttribute("isLogin"));
//	if (isLogin != true) return "redirect:/home";
//
//	Account account = (Account) session.getAttribute("accountSession");
//	if (account.getRole() != true) return "redirect:/home";
//	
//	return "manage/dashboard";
//}
//
//
//}
