/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session2;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int b = 1;
	        do {

	            for (int a = 1; a <= 10; a++) {
	                System.out.printf("%d x %d = %d \t",a, b, a * b);
	            }
	            System.out.printf("\n");
	            b++;
	        } while (b <= 10);
	}

}
