/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/
package jplb.l.a03.opt1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Radius of the circle:  ");
		double radius = input.nextDouble();
		printCircleInfo(radius);
	}
	
	static void printCircleInfo(double radius) {
		double pi = 3.1415926535897932384626433;
		double perimeter = (radius * 2)*pi;
		double area = Math.pow(radius, 2)*pi;
		System.out.printf("Perimeter is = %f\n", perimeter);
		System.out.printf("Area is = %f\n", area);
	}
}

