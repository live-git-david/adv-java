package com.ezshop.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezshop.model.Product;
import com.ezshop.service.ProductService;

@WebServlet("/DisplayProducts")
public class DisplayProducts extends HttpServlet {
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
//			printWriter.println("<h4>user" + product.getProductID() + "</h4>");
//			printWriter.println("</body>");
//			printWriter.println("</html>");
//		}
		{ // access the repository to fetch the products

			System.out.println("Now USING SERIVCE LAYER");
			// ProductRepository productRepository = new ProductRepository();
			ProductService productService = new ProductService();

			ArrayList<Product> products = productService.getAllProducts();

			PrintWriter printWriter = resp.getWriter();
			printWriter.println("<!DOCTYPE html>");
			printWriter.println("<html>");
			printWriter.println("<head>");
			printWriter.println("<title>Display All Product</title>");
			printWriter.println("</head>");
			printWriter.println("<body>");
			printWriter.println("<h1> First Product :</h1>");

			for (Product product : products) {
				printWriter.println("<h4>" + product.getProductID() + "</h4>");
				printWriter.println("<h4>" + product.getProductName() + "</h4>");
				printWriter.println("<h4>" + product.getPrice() + "</h4>");
				printWriter.println("<h4>" + product.getQuantity() + "</h4>");
			}

			printWriter.println("</body>");
			printWriter.println("</html>");
		}
	}
}
