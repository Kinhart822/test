/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package finalExam;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int size;
		do {
		    System.out.print("Number of elements:  ");
		    size = input.nextInt();
		    while (size < 5 || size > 100) {
		        System.out.print("Invalid number.");
		        size = input.nextInt();
		    }
		} while (size < 5);
	    
	    int[] array = new int[size];

	    for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt();
	    }

	    System.out.print("Original Array: [");
	    for (int i = 0; i < size; i++) {
	        if (i != size - 1) {
	            System.out.print(array[i] + ", ");
	        } else {
	            System.out.println(array[i] + "]");
	        }
	    }

	    int max = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > max) {
	            max = array[i];
	        }
	    }

	    int min = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] < min) {
	            min = array[i];
	        }
	    }
	    
		boolean haveDuplicate = false;
	    for (int i = 0; i < array.length; i++) {
	    	for (int j = i + 1; j < array.length; j++) {
	    		if (array[i] == array[j]) {
	    			if (!haveDuplicate) {
	    				System.out.print("The array has duplicate value(s). Please enter the array again! ");
	    				haveDuplicate = true;
	    				break;
	                } 
	            }
	        }
	    }
	    
	    int sum = max + min;
	    System.out.printf("The total of the largest and smallest values is: (%d + %d) = %d", max, min, sum);
	}
}
