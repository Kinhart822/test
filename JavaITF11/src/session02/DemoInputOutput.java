/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session02;

import java.util.Scanner;

public class DemoInputOutput {

	public static void main(String[] args) {
		// Nhập vào 2 số, in ra tổng 2 số đó
		// Dùng Scanner
		Scanner input = new Scanner(System.in);
				
		// Nhắc người dùng nhập số thứ nhất
		int firstNumber;
		System.out.print("Hay nhap so thu nhat");
		firstNumber = input.nextInt();
		
		// Nhắc người dùng nhập số thứ hai
		int secondNumber;
		System.out.print("Hay nhap so thu hai");
		secondNumber = input.nextInt();
		
		// Thực hiện phép tính
		int sum = firstNumber + secondNumber;
		// In kết quả
		System.out.printf("Tong cua %d va %d la %d\n", firstNumber, secondNumber, sum);
	
		if (secondNumber == 0) {
			System.out.printf("Khong the thuc hien phep chia");
		}else {
			int division = firstNumber/secondNumber;
			System.out.printf("Thuong cua %d va %d la %d\n", firstNumber, secondNumber, division);
		}
		
// Chú ý:		
		//		Specifier					Explanation
		//		
		//		%c							Format characters
		//
		//		%d							Format decimal (integer) numbers (base 10)
		//
		//		%e							Format exponential floating-point numbers
		//						
		//		%f							Format floating-point numbers
		//
		//		%i							Format integers (base 10)
		//
		//		%c							Format octal numbers (base 8)
		//
		//		%s							Format string of characters
		//
		//		%u							Format unsigned decimal (integer) numbers
		//
		//		%x							Format numbers in hexadecimal (base 16)
		//
		//		%n							add a new line character	
	
	}

}
