package com.ezshop.service;

import java.util.ArrayList;

import com.ezshop.model.Product;
import com.ezshop.repository.ProductRepository;

public class ProductService {
	public Product getFirstProduct() {
		Product product = null;
		ProductRepository productRepository = new ProductRepository();
		product = productRepository.getProducts();

		product.setPrice(product.getPrice() / 2);
		return product;
	}

	public ArrayList<Product> getAllProducts() {

		ProductRepository productRepository = new ProductRepository();
		return productRepository.getAllProducts();
	}
}
