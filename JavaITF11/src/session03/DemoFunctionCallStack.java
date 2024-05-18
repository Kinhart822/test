/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session03;

public class DemoFunctionCallStack {

	// main chính là 1 hàm, đặc biệt, nó là hàm được gọi khi chương trình bắt đầu chạy 
	public static void main(String[] args) {
		System.out.println("1. Bat dau fuction main");
		System.out.println("2. Goi function 1");
		function1();
		System.out.println("11. Ket thuc function main");
	}
	
	static void function1() {
		// The body of function 1 
		System.out.println("3. Bat dau fuction 1");
		System.out.println("4. Goi function 2");
		function2();
		System.out.println("10. Ket thuc function 1");
	}
	
	static void function2() {
		// The body of function 2 
		System.out.println("5. Bat dau fuction 2");
		System.out.println("6. Goi function 3");
		function3();
		System.out.println("9. Ket thuc function 2");
	}

	static void function3() {
		// The body of function 3 
		System.out.println("7. The body of function 3");
		System.out.println("8. Ket thuc function 3");
	}
}
