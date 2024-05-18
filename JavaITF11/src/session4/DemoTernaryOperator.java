/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session4;

import java.util.Scanner;

public class DemoTernaryOperator {

	public static void main(String[] args) {
		// Nhập vào 2 số và in ra số lớn hơn
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Nhap so thu hai: ");
		int secondNumber = input.nextInt();
		
		System.out.print("Nhap so thu ba: ");
		int thirdNumber = input.nextInt();
		
//		int max;
//		if (firstNumber > secondNumber){
//			max = firstNumber;
//		}else{
//			max = secondNumber;
//		}
		
		int max = firstNumber > secondNumber 
				? (firstNumber > thirdNumber ? firstNumber: secondNumber)
				: (secondNumber > thirdNumber ? secondNumber: thirdNumber);
		System.out.printf("So lon hon la: %d\n", max);
		
				
		

	}

}
