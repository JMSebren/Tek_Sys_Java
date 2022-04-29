package com.perscholas.cafe;

import java.util.*;

public class Espresso extends Product {

	Scanner scan;
	private boolean extraShot, macchiato;
	
	public Espresso(String name, double price, String description, Scanner scan) {
		super(name, price, description);
		this.scan = scan;
	}
	
	public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
		this.extCost = 1.00;
	}

	@Override
	double calculateProductSubtotal() {
		if(extraShot == true) {
			extCount++;
		}
		if(macchiato == true) {
			extCount++;
		}
		
		double subtotal = (this.price * this.quantity) + (this.extCount * this.extCost * this.quantity);
		
		return subtotal;
	}

	@Override
	void addOptions() {
		printOptions();
		
		System.out.println("Please enter a 1 for yes, or a 0 for no when prompted.");
		System.out.format("%s?", "Extra Shot");

		boolean a = isValid(1,0);	
		setExtraShot(a);

		System.out.format("%s?", "Macchiato");

		a = isValid(1,0);
		setMacchiato(a);	
	}

	@Override
	void printOptions() {
		System.out.format("Our options are: %s, %s \n", "Extra Shot", "Macchiato");
	}
	
	public String getOpt1() {
		
		if(extraShot) {
			return "Yes";
		} else {
			return "No ";
		}				
	}
	
	public String getOpt2() {
		
		if(macchiato) {
			return "Yes";
		} else {
			return "No ";
		}				
	}

	public void printSale() {
		System.out.format("%-8s %-15s %s %.2f %7s %d %-8s %.2f %n %19s %s %25s %s %n",
				"Item:", this.name, "Price:", this.price, "Qty:", this.quantity, "Subtotal:", calculateProductSubtotal(), "Extra Shot:", getOpt1(), "Macchiato:", getOpt2());
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
	
	public boolean isExtraShot() {
		return extraShot;
	}

	private void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	private void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}
	
	public void setQuantity(int quant) {
		this.quantity = quant;
	}
	
}
