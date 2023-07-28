//package com.fpt.controller;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
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
//public class SignupController {
//	@Autowired
//	HttpServletRequest request;
//	@Autowired
//	HttpSession session;
//	@Autowired
//	AccountDAO accountDAO;
//
//	@GetMapping("/signup")
//	public String signup(@ModelAttribute("user") Account userModel) {
//		if (session.getAttribute("isLogin") == "true") {
//			return "redirect:/home";
//		}
//		return "home-page/signup";
//	}
//
//	@PostMapping("/signup")
//	public String submit(@Valid @ModelAttribute("user") Account userModel, BindingResult result) {
//		if (!result.hasErrors()) {
//			Account account = accountDAO.findByUsername(userModel.getUsername());
//			if (account == null) {
//				accountDAO.save(userModel);
//				userModel.setUsername(null);
//				userModel.setFullname(null);
//				userModel.setEmail(null);
//				userModel.setPhone(null);
//				request.setAttribute("notificationSuccessRegis", "Successful account registration");
//			} else {
//				request.setAttribute("notificationUsernameExists", "Username already exists");
//			}
//		}
//		return "home-page/signup";
//	}
//
//
//	@ModelAttribute("genders")
//	public Map<Boolean, String> getGenders() {
//		Map<Boolean, String> gendersMap = new HashMap<>();
//		gendersMap.put(true, "Male");
//		gendersMap.put(false, "Female");
//		return gendersMap;
//	}
//
//}
