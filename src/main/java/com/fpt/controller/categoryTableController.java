//package com.fpt.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.ecommerce.entities.Account;
//import com.ecommerce.entities.Category;
//import com.ecommerce.repository.CategoryDAO;
//import com.fpt.service.SessionService;
//
//@Controller
//public class categoryTableController {
//	@Autowired
//	CategoryDAO categoryDAO;
//	@Autowired
//	SessionService session;
//	
//	@GetMapping("/category-table")
//	public String view(Model model) {
//		boolean isLogin = Boolean.parseBoolean((String) session.get("isLogin"));
//		if (isLogin != true) return "redirect:/home";
//		Account account = (Account) session.get("accountSession");
//		if (account.getRole() != true) return "redirect:/home";
//		
//		List<Category> categories = categoryDAO.findAll();
//		model.addAttribute("categories", categories);
//		return "manage/categoryTable";
//	}
//	
//	@GetMapping("category-table/create")
//	public String create(Model model)
//	{
//		Category category = new Category();
//		model.addAttribute("category", category);
//		return "manage/formCategory";
//	}
//	
//	@PostMapping("/category-table/save")
//	public String save(@Valid @ModelAttribute("category") Category category, BindingResult result)
//	{
//		if(!result.hasErrors())
//		{
//			categoryDAO.save(category);
//			return "redirect:/category-table";
//		}
//		return "manage/formCategory";
//	}
//	
//	@GetMapping("/category-table/delete/{id}")
//	public String delete(@PathVariable("id") int id)
//	{
//		Category category = categoryDAO.getReferenceById(id);
//		categoryDAO.delete(category);
//		return "redirect:/category-table";
//	}
//	
//	@GetMapping("/category-table/edit/{id}")
//	public String edit(@Valid @PathVariable("id") int id, Model model)
//	{
//		Category category = categoryDAO.getReferenceById(id);
//		model.addAttribute("category", category);
//		return "manage/formCategory";
//	}
//}
