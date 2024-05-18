/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a03.opt1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Nhap nam vao: ");
		x = input.nextInt();
		
		if(isLeapYear(x)) {
			System.out.println("True ");
		}else {
			System.out.println("False");
		}
	}
	
	static boolean isLeapYear(int year) {
		 return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
	
	
	
	