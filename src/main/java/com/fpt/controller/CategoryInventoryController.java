//package com.fpt.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.ecommerce.entities.Account;
//import com.ecommerce.entities.ReportInventoryByCategory;
//import com.ecommerce.repository.CategoryDAO;
//
//@Controller
//public class CategoryInventoryController {
//
//	@Autowired
//	CategoryDAO categoryDAO;
//	@Autowired
//	HttpSession session;
//
//	@GetMapping("/inventory-by-category")
//	public String index(Model model) {
//		boolean isLogin = Boolean.parseBoolean((String) session.getAttribute("isLogin"));
//		if (isLogin != true) return "redirect:/home";
//
//		Account account = (Account) session.getAttribute("accountSession");
//		if (account.getRole() != true) return "redirect:/home";
//			
//		List<ReportInventoryByCategory> report = categoryDAO.getInventoryByCategory();
//		model.addAttribute("report", report);
//		return "/manage/inventoryByCategory";
//	}
//
//}
