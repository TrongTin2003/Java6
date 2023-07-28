//package com.fpt.controller;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.ecommerce.entities.Account;
//import com.ecommerce.repository.AccountDAO;
//import com.fpt.service.SessionService;
//
//@Controller
//public class ProfileController {
//	@Autowired
//	SessionService session;
//	@Autowired
//	AccountDAO accountDAO;
//
//	
//	@GetMapping("/profile")
//	public String profile(Model model) {
//		Account account = session.get("accountSession");
//		model.addAttribute("account", account);
//		return "home-page/profile";
//	}
//	
//	@PostMapping("/profile")
//	public String update(@ModelAttribute("account") Account account)
//	{
//		accountDAO.save(account);
//		session.set("accountSession", account);
//		return "home-page/profile";
//	}
//	
//	@ModelAttribute("genders")
//	public Map<Boolean, String> getGenders() {
//		Map<Boolean, String> gendersMap = new HashMap<>();
//		gendersMap.put(true, "Male");
//		gendersMap.put(false, "Female");
//		return gendersMap;
//	}
//}
