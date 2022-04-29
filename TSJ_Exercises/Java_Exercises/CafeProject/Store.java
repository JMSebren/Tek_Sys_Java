package com.perscholas.cafe;

import java.util.*;

// Store takes orders from the users, stores them in the cart, and then gets the receipt from the items in the cart when it's time to checkout.
public class Store {

	Scanner scan;
	// has products w/ options
	// products to be purchased go in a shopping cart
	// takes input and builds the cart
	
	// on shopping end prints receipt w/ product info and sales totals
	
	ShoppingCart cart;	
	
	public Store(Scanner scan) {
		this.cart = new ShoppingCart(0.03);
		this.scan = scan;
	}
	
	public void menu() {		
		System.out.println("Please Select from the following menu: \n 1: Coffee \n 2: Cappuccino \n 3: Espresso \n 4: Check Out \n");
		System.out.println("Please enter the menu number of your choice");
					
	}
	
	// order loop. prompts the user to input an order, and continues until they decide to checkout.
	// on loop exit, gets the receipt from the cart.
	public void orderItems() {
		int choice;

		do {
			menu();
			
			
			choice = scan.nextInt();
			scan.nextLine();
			
			if(choice > 4 || choice < 1) {
				System.out.println("Please enter a valid option.");
			} else {
				switch(choice) {
				case 1: 
					Coffee cuppa = new Coffee("Coffee", 12.50, "Beans in water", scan);
					addToOrder(cuppa);
					cart.addItem(cuppa);
					break;
				case 2: 
					Cappuccino sweetNPower = new Cappuccino("Cappuccino", 14.75, "Cream me", scan);
					addToOrder(sweetNPower);
					cart.addItem(sweetNPower);
					break;		
				case 3: 
					Espresso powerOverwhelming = new Espresso("Espresso", 3.25, "It's in my veins!", scan);
					addToOrder(powerOverwhelming);
					cart.addItem(powerOverwhelming);
					break;
				case 4: 
					System.out.println("Enter 4 again to confirm, or enter 0 to choose an item.");
					choice = scan.nextInt();
					if (choice == 4) {
						System.out.println("Let's get you checked out.");
						scan.nextLine();
						break;
					} else if (choice == 0) {
						scan.nextLine();
						break;
					} else {
						boolean valid = false;
						do {
							System.out.println("Please enter a valid choice.");
							choice = scan.nextInt();
							scan.nextLine();
							if (choice == 4 || choice == 0) valid = true;
						} while(!valid);
						break;
					}
				}				
			}

		} while(choice != 4);
		
		cart.getReceipt();
	}
	
	// calls the product's addOptions method to advise the user of options and get their input. 
	// also gets quantity of items from the user.
	public void addToOrder(Product item) {
		item.addOptions();
		
		System.out.println("How many would you like?");
		int quantity = scan.nextInt();
		scan.nextLine();
		item.setQuantity(quantity);		
				
	}
	
}
