//package com.fpt.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort.Direction;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.fpt.entity.Product;
//import com.fpt.repository.ProductDAO;
//import com.fpt.service.SessionService;
//import com.fpt.service.ShoppingCartService;
//
//@Controller
//public class SortController {
//	@Autowired
//	ProductDAO productDAO;
//	@Autowired
//	SessionService session;
////	@Autowired
////	ShoppingCartService cartService;
////
////	@GetMapping("/products/page/{pageNo}")
////	public String index2(@PathVariable("pageNo") Optional<Integer> pageNo, Model model,
////			@RequestParam("field") Optional<String> field, @RequestParam("min_price") Optional<Double> min,
////			@RequestParam("max_price") Optional<Double> max, @RequestParam("keywords") Optional<String> keywords) {
////		model.addAttribute("cart", cartService.getProducts());
////		String sorting = field.orElse("");
////		double minPrice = min.orElse(0.0);
////		double maxPrice = max.orElse(10000000.0); 
////		String kws = keywords.orElse("");
////		session.set("field", sorting);
////		session.set("min_price", minPrice);
////		session.set("max_price", maxPrice);
////		session.set("keywords", kws);
////		Page<Product> page = null;
////		Pageable pageable = null;
////
////		if (sorting == "" && kws == "") {
////			pageable = PageRequest.of(pageNo.orElse(0), 3);
////			page = productDAO.findByPriceBetween(minPrice, maxPrice, pageable);
////		}
////		if (sorting.equals("priceasc")) {
////			Sort sort = Sort.by(Direction.ASC, "price");
////			pageable = PageRequest.of(pageNo.orElse(0), 3, sort);
////			page = productDAO.findAll(pageable);
////		
////		} else if (sorting.equals("pricedesc")) {
////			Sort sort = Sort.by(Direction.DESC, "price");
////			pageable = PageRequest.of(pageNo.orElse(0), 3, sort);
////			page = productDAO.findAll(pageable);
////		}
////		if(!kws.equals(""))
////		{
////			pageable = PageRequest.of(pageNo.orElse(0), 3);
////			page = productDAO.findByNameProductLike("%" + kws + "%", pageable);
////		}
////		
////		model.addAttribute("products", page);
////		return "home-page/products";
////	}
////
////	@GetMapping("/products/reset")
////	public String index( Model model) {
////		session.remove("field");
////		session.remove("min_price");
////		session.remove("max_price");
////		session.remove("keywords");
////		Pageable pageable = PageRequest.of(0, 3);
////		Page<Product> page = productDAO.findAll(pageable);
////		model.addAttribute("products", page);
////		return "redirect:/products/page/0";
////	}
//
////	starcode
//
//	@GetMapping("/shop")
//	public String shop(Model model,@PathVariable("pageNo") Optional<Integer> pageNo) {
//		Pageable pageable = PageRequest.of(pageNo.orElse(0), 6);
//		Page<Product> products = productDAO.findAll(pageable);
//		model.addAttribute("products", products);
//		return "client/shop";
//	}
//
//}
