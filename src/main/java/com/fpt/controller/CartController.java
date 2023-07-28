//package com.fpt.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.fpt.service.ParamService;
//import com.fpt.service.SessionService;
//import com.fpt.service.ShoppingCartService;
//
//@Controller
//@RequestMapping("/cart")
//public class CartController {
//	@Autowired
//	ShoppingCartService cartService;
//	@Autowired
//	ParamService paramService;
//	@Autowired
//	SessionService sessionService;
//	
//	
//	@GetMapping("/view")
//	public String view(Model model) {
//		model.addAttribute("cart", cartService.getProducts());
//		model.addAttribute("amount", cartService.getAmount());
//		return "/home-page/cart";
//	}
//	
//	@GetMapping("/add/{id}")
//	public String addToCart(@PathVariable("id") int id, Model model)
//	{
//		cartService.addProduct(id);
//		sessionService.set("cartQuantity", cartService.getCount());
//		model.addAttribute("message", "Add success!");
//		return "redirect:/products/page/0";
//	}
//	
//	@PostMapping("/update/{id}")
//	public String updateCart(@PathVariable("id") int id, Model model)
//	{
//		cartService.updateProduct(id, paramService.getInt("quantity", 0));
//		model.addAttribute("message", "Update success!");
//		return "redirect:/cart/view";
//	}
//	
//	@GetMapping("/remove/{id}")
//	public String removeFromCart(@PathVariable("id") int id, Model model)
//	{
//		cartService.removeProduct(id);
//		model.addAttribute("message", "Remove success!");
//		return "redirect:/cart/view";
//	}
//	
//	@GetMapping("/clear")
//	public String clearCart(Model model)
//	{
//		cartService.clear();
//		model.addAttribute("message", "Clear success!");
//		return "redirect:/cart/view";
//	}
//
//}
