//package com.fpt.controller;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Map;
//
//import javax.validation.Valid;
//
//import org.apache.jasper.tagplugins.jstl.core.ForEach;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.ecommerce.entities.Account;
//import com.ecommerce.entities.Checkout;
//import com.ecommerce.entities.CheckoutDetail;
//import com.ecommerce.entities.Product;
//import com.ecommerce.repository.CheckoutDAO;
//import com.ecommerce.repository.CheckoutDetailDAO;
//import com.fpt.service.SessionService;
//import com.fpt.service.ShoppingCartService;
//
//@Controller
//public class CheckoutController {
//	@Autowired
//	ShoppingCartService cartService;
//	@Autowired
//	SessionService session;
//	@Autowired
//	CheckoutDAO checkoutDAO;
//	@Autowired
//	CheckoutDetailDAO checkoutDetailDAO;
//
//	@GetMapping("/checkout")
//	public String checkout(Model model, @ModelAttribute("checkout") Checkout checkout) {
//		model.addAttribute("cart", cartService.getProducts());
//		model.addAttribute("amount", cartService.getAmount());
//		return "home-page/checkout";
//	}
//
//	@PostMapping("/checkout")
//	public String checkout2(@Valid @ModelAttribute("checkout") Checkout checkout, BindingResult result, Model model) {
//		if (!result.hasErrors()) {
//			Account acc = session.get("accountSession");
//			Date date = new Date();
//			SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyHHmmSS");
//			String checkoutCode = "CC" + sdf.format(date);
//			checkout.setAccount(acc);
//			checkout.setCheckoutId(checkoutCode);
//			checkout.setDate(date);
//			checkout.setCheck(false);
//			checkout.setPrice(cartService.getAmount());
//			checkoutDAO.save(checkout);
//
//			Map<Integer, Product> products = cartService.getProducts();
//			for (Product product : products.values()) {
//				CheckoutDetail checkoutDetail = new CheckoutDetail(checkoutCode, product.getIdProduct(),
//						product.getQuantity(), product.getPrice());
//				checkoutDetailDAO.save(checkoutDetail);
//			}
//		}
//
//		return "home-page/checkout";
//	}
//}
