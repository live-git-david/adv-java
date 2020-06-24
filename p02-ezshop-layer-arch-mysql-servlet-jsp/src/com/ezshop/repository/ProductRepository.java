package com.ezshop.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ezshop.model.Product;

public class ProductRepository {
	public Product getProducts() {

		try {

			Product product = new Product();
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/ezshopdb?serverTimezone=UTC", "root", "sylmar123");
			System.out.println("Connection Established!");

			// create the statement
			Statement statement = connection.createStatement();
			System.out.println("Statement created!");
			// Fetch the results by executing the query
			ResultSet resultSet = statement.executeQuery("select * from product");
			// Iterate the resultSet
			while (resultSet.next()) {
				product.setProductID(resultSet.getString("product_id"));
				product.setProductName(resultSet.getString("product_name"));
				product.setPrice(resultSet.getFloat("price"));

				product.setQuantity(resultSet.getInt("quantity"));

			}

			resultSet.close();
			statement.close();
			connection.close();
			return product;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
		return null;
	}

	public ArrayList<Product>

			getAllProducts() {

		try {

			ArrayList<Product> productList = new ArrayList<Product>();
			Product product = new Product();
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/ezshopdb?serverTimezone=UTC", "root", "sylmar123");
			System.out.println("Connection Established!");

			// create the statement
			Statement statement = connection.createStatement();
			System.out.println("Statement created!");
			// Fetch the results by executing the query
			ResultSet resultSet = statement.executeQuery("select * from product");
			// Iterate the resultSet
			while (resultSet.next()) {
				product.setProductID(resultSet.getString("product_id"));
				product.setProductName(resultSet.getString("product_name"));
				product.setPrice(resultSet.getFloat("price"));

				product.setQuantity(resultSet.getInt("quantity"));

				productList.add(product);
			}

			resultSet.close();
			statement.close();
			connection.close();
			return productList;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
		return null;
	}
}
