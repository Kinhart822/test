/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session01;

import java.util.Scanner;

public class DemoInputOutput {

	public static void main(String[] args) {
							// Hành động in giá trị màn hình console
// Ví dụ 1: in ra chữ - dùng dấu ngoặc kép ("")
		System.out.print("Hello World");

// Ví dụ 2: in xong rồi xuống dòng luôn
		System.out.println("Line 1");
		System.out.println("Line 2");
		System.out.println("Line 3");

// Ví dụ 3: muốn in giá trị số - viết số như bt ko có ngoặc kép
		System.out.println(13);
		
// Ví dụ 4: muốn in theo định dạng
		System.out.printf("My name is %s. I am %d years old.", "Pham Hoang Anh", 20);
			// %s trượng trưng cho chuỗi ,chữ
			// %d trượng trưng cho số
		
//	Muốn nhập vào thì chúng ta dùng Scanner
		Scanner input = new Scanner(System.in);

		//	Muốn nhập số
		// Câu dẫn:  hướng dẫn người dùng
		System.out.print("Hay nhap vao 1 so");
		int number = input.nextInt();
		System.out.printf("So bạn vua nhap vao la: %d", number);
	
		
		input.close();

	}

}
