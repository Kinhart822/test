/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session03;

public class DemoPassByValue {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		incrementValue(x, y);		// Đổi 2 giá trị với nhau 
		System.out.print("The value of x is: " + x);
		System.out.print("The value of y is: " + y);

	}

	static void incrementValue(int x, int y) {
		int temp = x;
		x = y;
		y = temp;	
	}
		
}
