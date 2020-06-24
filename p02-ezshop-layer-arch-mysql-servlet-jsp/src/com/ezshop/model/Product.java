package com.ezshop.model;

public class Product {
	private String productID;

	private String productName;
	private float price;
	private int quantity;

	// writing accessors and mutators
	public float getPrice() {
		return price;
	}

	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
}
