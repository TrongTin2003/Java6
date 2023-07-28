//package com.fpt.controller;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import com.ecommerce.entities.Account;
//import com.ecommerce.entities.Checkout;
//import com.ecommerce.entities.CheckoutDetail;
//import com.ecommerce.entities.Product;
//import com.ecommerce.repository.CheckoutDAO;
//import com.ecommerce.repository.CheckoutDetailDAO;
//import com.ecommerce.repository.ProductDAO;
//import com.fpt.service.SessionService;
//
//@Controller
//public class OrderController {
//	@Autowired
//	CheckoutDAO checkoutDAO;
//	@Autowired
//	CheckoutDetailDAO checkoutDetailDAO;
//	@Autowired
//	ProductDAO productDAO;
//	@Autowired
//	SessionService session;
//
//	@GetMapping("/order")
//	public String order(Model model) {
//		Account acc = session.get("accountSession");
//		List<Checkout> checkouts = checkoutDAO.getCheckoutByAccount(acc.getIdUser());
//		model.addAttribute("checkouts", checkouts);
//
//		return "home-page/order";
//	}
//
//	@GetMapping("/order/detail/{code}")
//	public String detail(@PathVariable("code") String code, Model model) {
//		Checkout checkout = checkoutDAO.getReferenceById(code);
//		model.addAttribute("checkout", checkout);
//		List<CheckoutDetail> details = checkoutDetailDAO.getCheckoutDetailByCheckoutId(code);
//		List<Product> detailProductCheckout = new ArrayList<>();
//		for (CheckoutDetail checkoutDetail : details) {
//			Product product = productDAO.getReferenceById(checkoutDetail.getIdProduct());
//			product.setQuantity(checkoutDetail.getQuantity());
//			product.setPrice(checkoutDetail.getPrice());
//			detailProductCheckout.add(product);
//		}
//		model.addAttribute("detailProductCheckout", detailProductCheckout);
//
//		return "home-page/orderDetail";
//	}
//}
