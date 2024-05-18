/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a02.opt1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		
		double perimeterResult = 2 * (a + b);
		double areaResult = a * b;
		double diagonalResult = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.printf("Perimeter of the rectangle is: %.2f\n", perimeterResult);
		System.out.printf("Area of the rectangle is: %.2f\n", areaResult);
		System.out.printf("Diagonal of the rectangle is: %f\n", diagonalResult);
	}
}
