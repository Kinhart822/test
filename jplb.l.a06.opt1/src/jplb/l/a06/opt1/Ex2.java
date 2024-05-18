/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a06.opt1;

import java.util.Scanner;

public class Ex2 {

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
		
		float[] javaFinalMark = new float[size];
		
		for (int i = 0; i < size; i++) {
			javaFinalMark[i] = input.nextFloat();
		}
		
		System.out.print("Original Array: [");
		for (int i = 0; i < size; i++) {
		    if (i != size - 1) {
		        System.out.print(javaFinalMark[i] + ", ");
		    } else {
		        System.out.println(javaFinalMark[i] + "]");
		    }
		}

				
		float max = javaFinalMark[0];
	    for (int i = 1; i < javaFinalMark.length; i++) {
	        if (javaFinalMark[i] > max) {
	            max = javaFinalMark[i];
	        }
	    }
	    System.out.println("Maximum value = " + max);
	
	    float min = javaFinalMark[0];
	    for (int i = 1; i < javaFinalMark.length; i++) {
	        if (javaFinalMark[i] < min) {
	            min = javaFinalMark[i];
	        }
	    }
	    System.out.println("Minimum value = " + min);
	  
	}

}
