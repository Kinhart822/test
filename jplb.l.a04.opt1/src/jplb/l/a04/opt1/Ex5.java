/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a04.opt1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Nhap so thu nhat: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Nhap so thu hai: ");
		int secondNumber = input.nextInt();
		
		System.out.print("Nhap so thu ba: ");
		int thirdNumber = input.nextInt();
		
		int max = firstNumber > secondNumber 
				? (firstNumber > thirdNumber ? firstNumber: secondNumber)
				: (secondNumber > thirdNumber ? secondNumber: thirdNumber);
		System.out.printf("So lon nhat la: %d\n", max);
	}

}
