package com.perscholas.cafe;

import java.util.*;

public class Coffee extends Product {

	private boolean sugar, milk;
	Scanner scan;
	
	public Coffee(String name, double price, String description, Scanner scan) {
		super(name, price, description);
		this.scan = scan;
	}
	
	public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
		super(name, price, description);
		this.sugar = sugar;
		this.milk = milk;
		this.extCost = 1.00;
	}

	@Override
	double calculateProductSubtotal() {
		if(sugar == true) {
			extCount++;
		}
		if(milk == true) {
			extCount++;
		}
		
		double subtotal = (this.price * this.quantity) + (this.extCount * this.extCost * this.quantity);
				
		return subtotal;
	}
		
	@Override
	void addOptions() {
		printOptions();
		
		System.out.println("Please enter a 1 for yes, or a 0 for no when prompted.");
		System.out.format("%s?", "Sugar");

		boolean a = isValid(1,0);
		
	
		setSugar(a);

		System.out.format("%s?", "Milk");
		
		a = isValid(1,0);
		setMilk(a);
	}

	@Override
	void printOptions() {
		System.out.format("Our options are: %s, %s \n", "Sugar", "Milk");

	}
	
	public String getOpt1() {
		
		if(sugar) {
			return "Yes";
		} else {
			return "No ";
		}				
	}
	
	public String getOpt2() {
		
		if(milk) {
			return "Yes";
		} else {
			return "No ";
		}				
	}
	
	public void printSale() {
		System.out.format("%-8s %-15s %s %.2f %7s %d %-8s %.2f %n %14s %s %25s %s %n",
				"Item:", this.name, "Price:", this.price, "Qty:", this.quantity, "Subtotal:", calculateProductSubtotal(), "Sugar:", getOpt1(), "Milk:", getOpt2());
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
	
	public boolean isSugar() {
		return sugar;
	}

	private void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	public boolean isMilk() {
		return milk;
	}

	private void setMilk(boolean milk) {
		this.milk = milk;
	}

	public void setQuantity(int quant) {
		this.quantity = quant;
	}

}
