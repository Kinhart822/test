/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a02.opt1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a;
		System.out.print("Number 01: ");
		a = input.nextInt();
		if (a < 1 || a > 1000000) {
			System.out.println("Invalid input! Please enter a number in the range 1-1000000.");
			return;
		}
		
		int b;
		System.out.print("Number 02: ");
		b = input.nextInt();
		if (b < 1 || b > 1000000) {
			System.out.println("Invalid input! Please enter a number in the range 1-1000000.");
			return;
		}
		
		int divisionResult = a / b;
		System.out.printf("Quotient: %d\n", divisionResult);
		int modulusResult = a % b;
		System.out.printf("Remaider: %d\n", modulusResult);
	
	}

}
