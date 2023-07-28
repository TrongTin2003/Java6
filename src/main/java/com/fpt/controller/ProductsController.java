//package com.fpt.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import com.fpt.entity.Product;
//import com.fpt.repository.ProductDAO;
//
//@Controller
//public class ProductsController {
//	@Autowired
//	ProductDAO productDAO;
//	
//	@GetMapping("/shop/detail/{id}")
//	public String detail(@PathVariable("id") int id, Model model) {
//		Product product = productDAO.getReferenceById(id);
//		model.addAttribute("product", product);
//		
////		Pageable pageable = PageRequest.of(0, 10);
////		Page<Product> page = productDAO.findTop10ProductByCategory(product.getCategory().getIdCategory(), pageable);
////		for (Product product2 : page) {
////			System.out.println(product2.getNameProduct());
////		}
////		model.addAttribute("top10ProductByCategory", page);
//		
//		return "client/detail";
//	}
//}
