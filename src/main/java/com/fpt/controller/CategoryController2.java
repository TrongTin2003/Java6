package com.fpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fpt.entity.Category;
import com.fpt.entity.CategoryMap;
import com.fpt.repository.CategoryDAO;

@Controller
public class CategoryController2 {
	@Autowired
	CategoryDAO categoryDAO;
	
	
	@GetMapping("/category")
	public String view(Model model,@ModelAttribute("category") Category category ) {
		CategoryMap cate=categoryDAO.findAll();
		model.addAttribute("listcate",cate);
		return "Cate/category";
	}
	@GetMapping("/category/{key}")
	public String view2(Model model,@ModelAttribute("category") Category category,@PathVariable("key") String key ) {
		CategoryMap cate=categoryDAO.findAll();
		model.addAttribute("listcate",cate);
		return "Cate/category";
	}
	
	
	@PostMapping("/createCategory")
	public String create(Model model,@ModelAttribute Category category) {
		categoryDAO.create(category);
		return "redirect:/category";
		
	}
		
	
}
