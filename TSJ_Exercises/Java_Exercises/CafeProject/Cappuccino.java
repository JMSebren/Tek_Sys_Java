package com.perscholas.cafe;

import java.util.*;

public class Cappuccino extends Product {

	Scanner scan;
	private boolean peppermint,whippedCream;
	
	public Cappuccino(String name, double price, String description, Scanner scan) {
		super(name, price, description);
		this.scan = scan;
	}
	
	public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
		this.extCost = 2.00;
	}

	@Override
	double calculateProductSubtotal() {
		if(peppermint == true) {
			extCount++;
		}
		if(whippedCream == true) {
			extCount++;
		}
		
		double subtotal = (this.price * this.quantity) + (this.extCount * this.extCost * this.quantity);
		return subtotal;
	}

	@Override
	void addOptions() {
		printOptions();
		
		System.out.println("Please enter a 1 for yes, or a 0 for no when prompted.");
		System.out.format("%s?", "Peppermint");
		
		boolean a = isValid(1,0);
		setPeppermint(a);
		
		System.out.format("%s?", "Whipped Cream");

		a = isValid(1,0);
		setWhippedCream(a);	
	}

	@Override
	void printOptions() {
		System.out.format("Our options are: %s, %s \n", "Peppermint", "Whipped Cream");
	}
	
	public String getOpt1() {
		
		if(peppermint) {
			return "Yes";
		} else {
			return "No ";
		}				
	}
	
	public String getOpt2() {
		
		if(whippedCream) {
			return "Yes";
		} else {
			return "No ";
		}				
	}
	
	public void printSale() {
		System.out.format("%-8s %-15s %s %.2f %7s %d %-8s %.2f %n %22s %s %23s %s %n",
				"Item:", this.name, "Price:", this.price, "Qty:", this.quantity, "Subtotal:", calculateProductSubtotal(), "Whipped Cream:", getOpt2(), "Peppermint:", getOpt1());
	}
	
	// takes two ints as args, gets choice of user, validates input(looping as necessary), and returns the result
	private boolean isValid(int a, int b) {
		boolean valid = false;
		boolean choice = false;
		
		int option = scan.nextInt();
		scan.nextLine();
		
		do {			
			if (option == a || option == b) {
				valid = true;
			} else {
				valid = false;
				System.out.println("Please enter a valid option.");
				option = scan.nextInt();
				scan.nextLine();
			}

		} while(!valid);
		
		if (option == a) {
			choice = true;
		} else if (option == b) {
			choice = false;
		}

		return choice;
	}
	
	public boolean isPeppermint() {
		return peppermint;
	}

	private void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public boolean isWhippedCream() {
		return whippedCream;
	}

	private void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
	
	public void setQuantity(int quant) {
		this.quantity = quant;
	}
	


}
