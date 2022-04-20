package com.perscholas.java_basics;

import java.util.Scanner;

public class Core_Java_Exercises_ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
			/*Write a program that declares 1 integer variable x, and then assigns 7 to it. 
			   Write an if statement to print out “Less than 10” if x is less than 10. 
			   Change x to equal 15 and notice the result (console should not display anything).*/
			
			int x1 = 7;
			
			if(x1 < 10) {
				System.out.println("Less than 10");
				x1 = 15;
			}
		
		
		// 2
			/*Write a program that declares 1 integer variable x, and then assigns 7 to it. 
			   Write an if-else statement that prints out “Less than 10” if x is less than 10 and “Greater than 10” 
			   if x is greater than 10. Change x to 15 and notice the result.*/
			
			int x2 = 7;
			
			if(x2 < 10) {
				System.out.println("Less than 10");
				x2 = 15;
			}
			else {
				System.out.println("Greater than 10");
			}
		
		// 3
			/*Write a program that declares 1 integer variable x, and then assigns 15 to it. 
			   Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10, 
			   “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20” 
			   if x is greater than or equal to 20. Change x to 50 and notice the result.*/
		
			int x3 = 15;
			
			if(x3 < 10) {
				System.out.println("Less than 10");
			}
			else if(x3 > 10 && x3 < 20) {
				System.out.println("Between 10 and 20");
				x3 = 50;
			}
			else if (x3 >= 20){
				System.out.println("Greater than or equal to 20");
			}
		// 4
			/*Write a program that declares 1 integer variable x, and then assigns 15 to it.
			   Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and 
			   prints “In range” if between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.*/
			
			int x4 = 15;
			
			if(x4 < 10 || x4 > 20 ) {
				System.out.println("Out of range");
				x4 = 5;
			}
			else {
				System.out.println("In range");
			}
			
		
		// 5
			/*Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
				A: 90-100
				B: 80-89
				C: 70-79
				D: 60-69
				F: <60

			   Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range.” 
			   if the score is less than 0 or greater than 100.*/
			
			Scanner score = new Scanner(System.in);
			
			System.out.println("Please enter a score between 0-100");
			int grade = score.nextInt();
			
			if(grade > 100 || grade <0) {
				System.out.println("Score out of range");
			}
			else if(grade <= 100 || grade >= 90) {
				System.out.println("A");
			}
			else if(grade >= 80 && grade <= 89) {
				System.out.println("B");
			}
			else if(grade >= 70 && grade <= 79) {
				System.out.println("C");
			}
			else if(grade >= 60 && grade <= 69) {
				System.out.println("D");
			}
			else if(grade <= 60) {
				System.out.println("F");
			}

			score.close();
		// 6
			/*Write a program that accepts an integer between 1 and 7 from the user. 
			  Use a switch statement to print out the corresponding weekday. Print “Out of range” if the number is less 
			  than 1 or greater than 7. Don’t forget to include “break” statements in each of your cases.*/
			
			Scanner dayIn = new Scanner(System.in);
			
			System.out.println("PLease enter a number between 1-7");
			int day = dayIn.nextInt();
									
			switch(day) {
				case 1:
					System.out.println("Sunday");
					break;
				case 2:
					System.out.println("Monday");
					break;
				case 3:
					System.out.println("Tuesday");
					break;
				case 4:
					System.out.println("Wednesday");
					break;
				case 5:
					System.out.println("Thursday");
					break;
				case 6:
					System.out.println("Friday");
					break;
				case 7:
					System.out.println("Saturday");
					break;
				default:
					System.out.println("Out of range");
			}
			
			dayIn.close();
			
	}
	

}
