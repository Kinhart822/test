/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a04.opt1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		System.out.println("Hay nhap so: ");
		int number = input.nextInt();
		
		if (number >= 1 && number <= 9) {
			System.out.println("It’s a one digit number ");
		} else if (number >= 10 && number <= 99) {
			System.out.println("It’s a two digit number ");
		} else if (number >= 100 && number <= 999) {
			System.out.println("It’s a three digit number ");
		} else if (number >= 1000 && number <= 9999) {
			System.out.println("It’s a four digit number ");
		} else if (number >= 10000 && number <= 99999) {
			System.out.println("It’s a five digit number ");
		} else {
			System.out.println("Number is not between 1 & 99999");
		}
	}

}
