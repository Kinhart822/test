/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a02.opt1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int firstNumber;
		System.out.print("Number 01: ");
		firstNumber = input.nextInt();
		
		int secondNumber;
		System.out.print("Number 02: ");
		secondNumber = input.nextInt();
		
		System.out.println("--- Swap values ---");

		int temp = firstNumber;
		firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("Number 01: " + firstNumber);
        System.out.println("Number 02: " + secondNumber);
		
	}

}
