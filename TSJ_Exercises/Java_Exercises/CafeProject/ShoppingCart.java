package com.perscholas.cafe;

import java.util.*;

// ShoppingCart holds all items being purchased. When it's time to checkout, it uses info from the items to create the receipt.
public class ShoppingCart {

	// holds items until they are purchased
	ArrayList<Product> cart = new ArrayList<Product>();
	private double tax;
	private double subTotal;
	private double total;	
	private double salesTax;
	
	public ShoppingCart(double tax) {
		this.tax = tax;
	}
	
	void addItem(Product item) {
		cart.add(item);
	}
	
	void removeItem(Product item) {
		cart.remove(item);
	}
	
	public ArrayList<Product> getCart(){
		return cart;
	}
	
	public double getSubTotal() {
		subTotal = 0;
		for(Product item : cart) {
			subTotal += item.calculateProductSubtotal();
		}
		
		return subTotal;
	}
	
	public double getSalesTax() {
		salesTax = 0;
		for(Product item : cart) {
			salesTax += (item.calculateProductSubtotal()) * tax;
		}
		return salesTax;
	}
	
	public double getTotal() {
		total = getSubTotal() + getSalesTax();
		
		return total;
	}
	
	public void getReceipt() {
		for(Product item : cart) {
			item.printSale();
		}
		System.out.format("Purchase Subtotal: %.2f %nSales Tax: %.2f %nPurchase Total: %.2f", getSubTotal(), getSalesTax(), getTotal() );
	}
	
	
	@Override
	public String toString() {
		return "Purchase Subtotal: " + getSubTotal() + " Sales Tax: " + getSalesTax() + " Purchase Total: " + getTotal();
	}
	
}
