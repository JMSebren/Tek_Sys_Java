package com.perscholas.java_basics;

import java.util.Arrays;

public class Core_Java_Exercises_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
			/*Write a program that creates an array of integers with a length of 3. 
			   Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/

			int [] nums1 = {1,2,3};
			for(int n : nums1) {
				System.out.println(n);
			}
		
		// 2
			/*Write a program that returns the middle element in an array. 
			   Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7*/
			
			int [] nums2 = {13,5,7,68,2};
			int mid = nums2.length / 2;
			
			System.out.println(nums2[mid]);

		// 3
			/*Write a program that creates an array of String type and initializes it with the 
			   strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method. 
			   Use the Arrays.toString( ) method on the new array to verify that the original array was copied.*/
		
        		String [] strArr = {"Red", "Green", "Blue", "Yellow"}; 
        
        		System.out.println(strArr.length);
        		String [] newArr = strArr.clone();
        
        
        		System.out.println(Arrays.toString(newArr));
		
		// 4
			/*Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  
			   Print out the value at the first index and the last index using length - 1 as the index. 
			   Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. 
			   Now try to assign a value to the array index 5. You should get the same type of exception.*/
        		
        		int [] nums3 = {5,4,8,9,10};
        		
        		System.out.println(nums3[(nums3.length - 1)*0]);
        		System.out.println(nums3[nums3.length - 1]);
        		System.out.println(nums3[nums3.length]);
        		
        		nums3[5] = 6;
        		
        		

		// 5
			/*Write a program where you create an integer array with a length of 5. 
			   Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.*/

        		int [] nums4 = new int[5];
        		
        		for(int i = 0; i<nums4.length; i++) {
        			nums4[0] = i;
        		}
        		
		// 6
			/*Write a program where you create an integer array of 5 numbers. 
			   Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.*/
        		
        		int [] nums5 = new int[5];
        		
        		for(int i = 0; i<nums5.length; i++) {
        			nums5[0] = i*2;
        		}

		// 7
			/*Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, 
			   except for the middle (index 2) element.*/

    			int [] nums6 = {13,5,7,68,2};
    			int mid2 = nums6.length / 2;
    			
    			
    			for(int i = 0; i<nums6.length; i++) {
    				if(i != mid2) {
    					System.out.println(nums6[i]);
    				}    				
    			}
    			
        		
		// 8
			/*Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.*/

    			String [] words = {"habba","babba","nabba","tabba","yabba"};
    			int mid3 = words.length / 2;
    			
    			String val0 = words[0];
    			String valMid = words[mid3];
    			
    			words[0] = valMid;
    			words[mid] = val0;
    			   			
    			
		// 9
			/*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. 
			   Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
					Array in ascending order: 0, 1, 2, 4, 9, 13

					The smallest number is 0

					The biggest number is 13*/
		
    			int [] nums7 = {4,2,9,13,1,0};
    			
    			for(int i = 0; i<nums7.length;i++) {
    				int lowestVal = nums7[i];
    				int swap = 0;
    				int si = 0;
    				for(int j = 0; j<nums7.length; j++) {
    					if(nums7[j] < lowestVal && j >= i) {
    						lowestVal = nums7[j];
    						swap = nums7[i];
    						si = j;
    					}
    				}
    				nums7[i] = lowestVal;
    				nums7[si] = swap;
    			}
    			for(int n: nums7) {
    			    System.out.println(n);
    			}
    			
    			System.out.println("Smallest Val: " + nums7[0] + " Largest Val: " + nums7[nums7.length - 1]);
    			
		// 10
			/*Create an array that includes an integer, 3 strings, and 1 double. Print the array.*/
    			
    			Object[] obj = new Object[]{1,2,3,"Habba", "Babba", "Kievan Rus", 4.2};

    			for( int i = 0; i<obj.length; i++) {
    			    System.out.println(obj[i]);
    			}
	}

}
