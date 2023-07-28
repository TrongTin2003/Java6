package com.fpt.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.fpt.repository.CategoryDAO;
import com.fpt.service.ShoppingCartService;

@WebFilter(urlPatterns = "/*")
public class CartFilter extends HttpFilter{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
//	ShoppingCartService cart;
	CategoryDAO categoryDAO;

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setAttribute("categories", categoryDAO.findAll());
//		request.setAttribute("cartAmount", cart.getAmount());
//		request.setAttribute("cartQuantity", cart.getCount());
		chain.doFilter(request, response);
	}

}
