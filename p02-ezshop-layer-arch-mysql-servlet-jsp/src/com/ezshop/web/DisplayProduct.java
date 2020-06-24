package com.ezshop.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezshop.model.Product;
import com.ezshop.service.ProductService;

@WebServlet("/DisplayProduct")
public class DisplayProduct extends HttpServlet {
	@Override
	// The service method accept request from the browser
	// process the request
	// send a response
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		{ // access the repository to fetch the products
//			ProductRepository productRepository = new ProductRepository();
//
//			Product product = productRepository.getProducts();
//
//			PrintWriter printWriter = resp.getWriter();
//			printWriter.println("<!DOCTYPE html>");
//			printWriter.println("<html>");
//			printWriter.println("<head>");
//			printWriter.println("<title>Display First Product</title>");
//			printWriter.println("</head>");
//			printWriter.println("<body>");
//			printWriter.println("<h1>user First Product..</h1>");
//			printWriter.println("<h3>user" + product.getProductID() + "</h3>");
//			printWriter.println("</body>");
//			printWriter.println("</html>");
//		}
		{ // access the repository to fetch the products

			System.out.println("Now USING SERIVCE LAYER");
			// ProductRepository productRepository = new ProductRepository();
			ProductService productService = new ProductService();

			Product product = productService.getFirstProduct();

			PrintWriter printWriter = resp.getWriter();
			printWriter.println("<!DOCTYPE html>");
			printWriter.println("<html>");
			printWriter.println("<head>");
			printWriter.println("<title>Display First Product</title>");
			printWriter.println("</head>");
			printWriter.println("<body>");
			printWriter.println("<h1> First Product..</h1>");
			printWriter.println("<h3>" + product.getProductID() + "</h3>");

			printWriter.println("<h3>" + product.getProductName() + "</h3>");
			printWriter.println("<h3>" + product.getPrice() + "</h3>");
			printWriter.println("<h3>" + product.getQuantity() + "</h3>");
			printWriter.println("</body>");
			printWriter.println("</html>");
		}
	}
}
