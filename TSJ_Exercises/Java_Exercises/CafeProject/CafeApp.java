package com.perscholas.cafe;

import java.util.*;

public class CafeApp {

	
	public static void main(String[] args) {
		
		// setup a scanner to use between all classes/methods.
		Scanner scan = new Scanner(System.in);
		
		// instantiate a store object, and pass in the scanner.
		Store manhattans = new Store(scan);

		// get an order going
		manhattans.orderItems();

	}

}
