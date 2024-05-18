/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a02.opt1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		
		int sumResult = a + b;
		int differenceResult = a - b;
		int productResult = a * b;
		double averageResult = (a + b) / 2;
		int distantResult = Math.abs(a - b);
		
		System.out.printf("Sum of two integers: %d\n", sumResult);
		System.out.printf("Difference of two integers: %d\n", differenceResult);
		System.out.printf("Product of two integers: %d\n", productResult);
		System.out.printf("Average of two integers: %.2f\n", averageResult);
		System.out.printf("Distance of two integers: %d\n", distantResult);
		System.out.println("Two integers is equals: " + (a == b ? "YES" : "NO"));
	}
}
