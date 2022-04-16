package com.perscholas.java_basics;

import java.text.DecimalFormat;

public class Core_Java_Exercises_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  1.
		/*Write a program that declares 2 integer variables, 
		 assigns an integer to each, and adds them together. 
		 Assign the sum to a variable. Print out the result.*/
		int a = 3;
		int b= 4;
		int result = a + b;
		System.out.println(result);
		
		//  2.
		/*Write a program that declares 2 double variables, 
		  assigns a number to each, and adds them together. 
		  Assign the sum to a variable. Print out the result.*/
		double c = 3.1;
		double d= 4.2;
		double resultOfDouble = c + d;
		System.out.println(resultOfDouble);
		
		//  3.
		/*Write a program that declares an integer variable and a double variable, 
		  assigns numbers to each, and adds them together. 
		  Assign the sum to a variable. Print out the result. What variable type must the sum be?*/
		int e = 3;
		double f = 4.1;
		double resultEF = e + f;
		System.out.println(resultEF);  
		// variable type needed depends on results desired. I want to preserve the decimal, so a double is needed.
		
		//  4.
		/*Write a program that declares 2 integer variables, assigns an integer to each, 
		  and divides the larger number by the smaller number. Assign the result to a variable. 
		  Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?*/
		int largeNum = 6;
		int smallNum = 4;
		double divResult = largeNum / smallNum;
		System.out.println(divResult);
		
		double largeNumD = 6.5;
		divResult = largeNumD / smallNum;
		/*The results here depend upon the numbers being used, and the data type chosen for the divResult variable. 
		   If the result variable is using a whole number data type, then any inputs that result in a decimal number will be type cast to a whole number, 
		   discarding the decimal portion. To preserve decimal values the divResult variable will need to be a decimal data type. That will allow the
		   system to automatically convert any non-decimal values to a decimal, perform the operation, and save the result w/ decimal values prserved.*/

		//  5.
		/*Write a program that declares 2 double variables, assigns a number to each, 
		  and divides the larger by the smaller. Assign the result to a variable. 
		  Print out the result. Now, cast the result to an integer. Print out the result again.*/
		double largerNum2 = 7;
		double smallerNum2 = 4;
		double res = largerNum2 / smallerNum2;
		System.out.println(res);
		
		res = (int)res;
		System.out.println(res);
		
		//  6.
		/*Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. 
		  Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.*/		
		int x = 5;
		int y = 6;
		double q = y / x;
		System.out.println(q);
		
		q = (double)y;
		System.out.println(q);
		
		//  7.
		/*Write a program that declares a named constant and uses it in a calculation. Print the result.*/
		final int NUMBER = 12;
		System.out.println(NUMBER * 3);
		
		
		//  8.
		/*Write a program where you create 3 variables that represent products at a cafe. 
		  The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. 
		  Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 
		  4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal. 
		  Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
		  Be sure to format the results to 2 decimal places.*/
		
		DecimalFormat df = new DecimalFormat("0.##");	//used "0.##" format to ensure any values of the format "0.00" will have the leading '0'
		double coffeePrice = 15.30;
		double teaPrice = 4.75;
		double mochaPrice = 22.19;
		
		double subTotal; 
		String totalSale;
				
		final double SALES_TAX = 0.0435;		//sales tax as a percent
		
		subTotal = (3 * coffeePrice) + (4 * teaPrice) + (2 * mochaPrice);
		totalSale = df.format(subTotal + (subTotal * SALES_TAX));	//actual tax calculated as percent of subTotal, and then added to subTotal to get totalSale
		
		System.out.println(totalSale);
	}

}

