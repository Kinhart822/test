/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session5;

import java.util.Scanner;

public class DemoWhileLoop {

	public static void main(String[] args) {
		// Cho phép người dùng đăng nhập và 1 số kiểm tra xem
		// Số đó có nằm trong khoảng từ 1-100 hay ko?
		// Nếu không, thì bắt đầu nhập lại
		Scanner input = new Scanner(System.in);
		int theNumber = 0;
		
		while(theNumber < 1 || theNumber > 100) {
			System.out.print("Hay nhap vao 1 so trong khoang tu 1-100: ");
			theNumber = input.nextInt();
		}
		System.out.print("So ban vua nhap vao: " + theNumber);
		
		while(theNumber < 1 || theNumber >= 100) {
			System.out.print("Hay nhap vao 1 so trong khoang tu 1-100: ");
			theNumber = input.nextInt();
		}
		System.out.print("So ban vua nhap vao: " + theNumber);
	}

}
