//package com.fpt.controller;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//import javax.transaction.Transactional;
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
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.ecommerce.entities.Account;
//import com.ecommerce.entities.Category;
//import com.ecommerce.entities.Product;
//import com.ecommerce.repository.CategoryDAO;
//import com.ecommerce.repository.ProductDAO;
//
//@Controller
//public class ManageProductController {
//
//	@Autowired
//	ProductDAO productDAO;
//	@Autowired
//	CategoryDAO categoryDAO;
//	@Autowired
//	HttpSession session;
//
//	private static final String URL = "D:\\FPT\\Summer-2023\\java5ee\\ecommerceshopvs2\\src\\main\\webapp\\include-manage\\images\\";
//
//	@GetMapping("/manage-product")
//	public String view(Model model) {
//		boolean isLogin = Boolean.parseBoolean((String) session.getAttribute("isLogin"));
//		if (isLogin != true) return "redirect:/home";
//
//		Account account = (Account) session.getAttribute("accountSession");
//		if (account.getRole() != true) return "redirect:/home";
//		
//		List<Product> listProduct = productDAO.findAll();
//		model.addAttribute("listProduct", listProduct);
//		return "manage/manageProduct";
//	}
//
//	@GetMapping("/manage-product/create")
//	public String create(Model model) {
//		Product product = new Product();
//		model.addAttribute("product", product);
//		return "manage/formProduct";
//	}
//
//	@PostMapping("/manage-product/save")
//	public String save(@Valid @ModelAttribute("product") Product product, BindingResult result,
//			@RequestParam("image-file") MultipartFile multipartFile, Model model)
//			throws IllegalStateException, IOException {
//		if (!result.hasErrors()) {
//			if (!multipartFile.isEmpty()) {
//				String filename = multipartFile.getOriginalFilename();
//				File file = new File(URL + filename);
//				if (!file.getParentFile().exists())
//					file.getParentFile().mkdirs();
//				multipartFile.transferTo(file);
//				product.setImage(file.getName());
//			}
//			if (product.getImage() == null) {
//				String image = (String) session.getAttribute("image");
//				session.setAttribute("image", "");
//				product.setImage(image);
//			}
//
//			productDAO.save(product);
//			return "redirect:/manage-product";
//		}
//		return "manage/formProduct";
//	}
//
//	@GetMapping("/manage-product/delete/{id}")
//	public String delete(@PathVariable("id") int id) {
//		Product product = productDAO.getReferenceById(id);
//		productDAO.delete(product);
//		return "redirect:/manage-product";
//	}
//
//	@GetMapping("/manage-product/edit/{id}")
//	public String edit(@PathVariable("id") int id, Model model) {
//		Product product = productDAO.getReferenceById(id);
//		model.addAttribute("product", product);
//		String image = product.getImage();
//		session.setAttribute("image", image);
//		return "manage/formProduct";
//	}
//
//	@ModelAttribute("categories")
//	public List<Category> getCategories() {
//		List<Category> list = categoryDAO.findAll();
//		return list;
//	}
//}
