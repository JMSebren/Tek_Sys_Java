package com.perscholas.java_basics;

import java.util.ArrayList;

public class Core_Java_Exercises_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
			/*Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.*/
		
			for(int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		
		// 2
			/*Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.*/
			
			int count = 0;
			while(count <= 100) {
				System.out.println(count);
				count += 10;
			}
			
		// 3
			/*Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.*/
		
			int count1 = 1;
			
			do {
				System.out.println(count1);
				count1++;
			} while(count1 <= 10);
		// 4
			/*Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5, 
			   but do not print out any numbers between 25 and 75. Use the “continue” statement to accomplish this.*/
			
			for(int i = 0; i <= 100; i+=5) {
				if((i >= 25 && i <= 75) || i==0) {
					continue;
				}
				else if(i % 5 == 0) {
					System.out.println(i);
				}
			}
		
		// 5
			/*Write a program that uses a for-loop to loop through the numbers 1-100. 
			   Print out each number if is a multiple of 5, but do not print out any numbers greater than 50. Use the “break” keyword to accomplish this.*/
			
			for(int i = 0; i <= 100; i+=5) {
				
				if(i > 50) {
					break;
				}
				else if(i == 0) {
					continue;
				}
				else if(i % 5 == 0) {
					System.out.println(i);
				}
			}
		
		// 6
			/*Write a program that uses nested for-loops to output the following:
				Week 1:
					Day 1					
					Day 2					
					Day 3					
					Day 4					
					Day 5
				Week 2:				
					Day 1					
					Day 2					
					Day 3					
					Day 4					
					Day 5
					
 */
			String [] weeks = {"Week 1:", "Week 2:"};
			String [] days = {"Day 1","Day 2","Day 3","Day 4","Day 5"};
			
			for(String week : weeks) {
				System.out.println(week);
				
				for(String day : days) {
					System.out.println(day);
				}
			}
		
		// 7
			/*Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:
			   11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,*/
		
			ArrayList<String> pals = new ArrayList<>();
			
			for(int i = 10; i <= 200; i++) {
				int toReverse = i;
				int reversed = 0;
				
				while(toReverse != 0) {
					reversed = reversed * 10 + toReverse % 10;
					toReverse = toReverse / 10;
				}
				
				if(i == reversed) {
					pals.add(Integer.toString(i));
				}				
			}
			System.out.println(pals);
			
		// 8
			/*Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,*/
		
			int prev = 0;
			int next = 1;
			while(next < 50) {
				System.out.println(next);
				int curr = prev;
				
				prev = next;
				next = curr + next;
			}
			
		// 9
			/*Write a program that nests a for-loop inside another. Print out the inner and outer variable (e.g., i or j) in the inner 
			  loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).*/
			
			for(int i = 0;i < 10; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.println("I: " + i + " | J: " + j);
				}
			}
	}

}
