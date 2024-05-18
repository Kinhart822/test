/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session5;

import java.util.Scanner;

public class DemoContinuosLoop {

	public static void main(String[] args) {
		// Demo break: nhập vào 1 số, nếu đó là số âm thì break
		Scanner input = new Scanner(System.in);
		int theNumber = 0;
		do {
			System.out.print("Nhap vao 1 so duong");
			theNumber = input.nextInt();
			if(theNumber < 0) {
				break;
			}
			
			//Thao tác trong vòng lặp
			System.out.print("Thao tac sao vong lap.........");
		}
		while(theNumber >= 0);
		
		// Vòng lặp đã kết thúc
		System.out.print("Thao tac sao vong lap.........");
		
		
		int theNumber1 = 0;
		do {
			System.out.print("Nhap vao 1 so duong");
			theNumber1 = input.nextInt();
			if(theNumber1 < 0) {
				continue;
			}
			
			//Thao tác trong vòng lặp
			System.out.print("Thao tac sao vong lap.........");
		}
		while(theNumber1 >= -10);
		
		// Vòng lặp đã kết thúc
		System.out.print("Thao tac sao vong lap.........");
		
		// Đa số trong mặt hực hành
	}

}
