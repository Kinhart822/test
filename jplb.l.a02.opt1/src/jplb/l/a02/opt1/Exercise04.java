/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a02.opt1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		float radius;
		System.out.printf("Radius of the circle: ");
		radius = input.nextFloat();
		
		double pi = 3.1415926535897932384626433;
		double perimeterResult = (radius * 2)*pi;
		double areaResult = Math.pow(radius, 2)*pi;
		
		System.out.printf("Perimeter is = %f\n", perimeterResult);
		System.out.printf("Area is = %f\n", areaResult);
		
		
	}

}
