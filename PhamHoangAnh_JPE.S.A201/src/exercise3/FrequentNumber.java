/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package exercise3;

import java.util.Scanner;

public class FrequentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the length of the array: ");
	        int len = scanner.nextInt();
	        int[] intArray = new int[len];
	        
	        for (int i = 0; i < len; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            intArray[i] = scanner.nextInt();
	        }
	        
	        System.out.print("Enter the value to search for: ");
	        int value = scanner.nextInt();
	        
	        int frequency = 0;
	        System.out.print("Indexes: ");
	        for (int i = 0; i < len; i++) {
	            if (intArray[i] == value) {
	                frequency++;
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println("\nAmount of frequency: " + frequency);
	    
	}
}


