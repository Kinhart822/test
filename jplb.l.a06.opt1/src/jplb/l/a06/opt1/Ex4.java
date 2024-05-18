/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a06.opt1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int size;
		do {
		    System.out.print("Number of elements:  ");
		    size = input.nextInt();
		    while (size <= 0 || size >= 100) {
		        System.out.print("Invalid number. Please enter a number between 1 and 999: ");
		        size = input.nextInt();
		    }
		} while (size <= 0);
	    
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
	    System.out.println("Maximum value = " + max);

	    int min = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] < min) {
	            min = array[i];
	        }
	    }
	    System.out.println("Minimum value = " + min);
	    
	    int[] temp = new int[max - min + 1];
	    for (int i = 0; i < size; i++) {
	        if (array[i] >= min && array[i] <= max) {
	            temp[array[i] - min] = 1;
	        }
	    }
	    
	    boolean foundMissing = false;
	    System.out.print("Missing elements: ");
	    for (int i = 0; i < temp.length; i++) {
	        if (temp[i] == 0) {
	            if (foundMissing) {
	                System.out.print(", ");
	            }
	            System.out.print(i + min);
	            foundMissing = true;
	        }
	    }
	    if (!foundMissing) {
	        System.out.println("No missing elements.");
	    } else {
	        System.out.println();
	    }
	}
	}




