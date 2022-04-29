package com.perscholas.cafe;


public abstract class Product {
	protected String name;
	protected double price;
	protected String description;
	protected int quantity;
	protected double extCost;
	protected double extCount = 0;
	
	public Product() {

	}

	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	abstract double calculateProductSubtotal();
	
	abstract void addOptions();
	
	abstract void printOptions();
	
	abstract void printSale();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
