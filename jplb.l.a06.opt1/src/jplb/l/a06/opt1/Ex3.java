/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a06.opt1;

import java.util.Scanner;

public class Ex3 {
	   
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int size;
		do {
		    System.out.print("Number of elements:  ");
		    size = input.nextInt();
		    while (size <= 0 || size >= 1000) {
		        System.out.print("Invalid number. Please enter a number between 1 and 999: ");
		        size = input.nextInt();
		    }
		} while (size <= 0);
	    float[] array = new float[size];

	    for (int i = 0; i < size; i++) {
	    	array[i] = input.nextFloat();
	    }

	    System.out.print("Original Array: [");
	    	for (int i = 0; i < size; i++) {
	            if (i != size - 1) {
	                System.out.print(array[i] + ", ");
	            } else {
	                System.out.println(array[i] + "]");
	            }
	        }

	    boolean haveDuplicate = false;
	    for (int i = 0; i < array.length; i++) {
	    	for (int j = i + 1; j < array.length; j++) {
	    		if (array[i] == array[j]) {
	    			if (!haveDuplicate) {
	    				System.out.print("Duplicate values: " + array[i]);
	    				haveDuplicate = true;
	                } else {
	                	System.out.print(", " + array[i]);
	                    	}
	                }	
	            }
	        }
	        if (!haveDuplicate) {
	            System.out.println("Have no duplicate value.");
	        } else {
	            System.out.println();
	        }
	    }
	}