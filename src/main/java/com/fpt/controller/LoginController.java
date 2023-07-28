//package com.fpt.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
////import com.ecommerce.dao.UserDAO;
//import com.ecommerce.entities.Account;
//import com.ecommerce.repository.AccountDAO;
//
//@Controller
//public class LoginController {
//	@Autowired
//	HttpServletRequest request;
//	@Autowired
//	HttpSession session;
//	@Autowired
//	AccountDAO accountDAO;
//
//	@GetMapping("/login")
//	public String index(@ModelAttribute("user") Account userModel) {
//		if (session.getAttribute("isLogin") == "true") {
//			return "redirect:/home";
//		}
//		return "home-page/login";
//	}
//
//	@PostMapping("/login")
//	public String submit(@Valid @ModelAttribute("user") Account userModel, BindingResult result) {
//		if (result.hasErrors()) {
//			return "home-page/login";
//		}
//		String username = userModel.getUsername();
//		String password = userModel.getPassword();
//		boolean bool = false;
//		Account account = accountDAO.findByUsername(username);
//		if (account != null) {
//			if (account.getUsername().equals(username)) {
//				if (account.getPassword().equals(password)) {
//					session = request.getSession();
//					session.setAttribute("isLogin", "true");
//					session.setAttribute("accountSession", account);
//					bool = true;
//				}
//			}
//		}
//
//		if (bool != true) {
//			request.setAttribute("notificationError", "Login failed");
//			return "home-page/login";
//		}
//		return "redirect:/home";
//	}
//}
