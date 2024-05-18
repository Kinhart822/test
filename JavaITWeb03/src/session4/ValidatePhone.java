/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session4;

import java.util.Scanner;

public class ValidatePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean isValid = false;
		String phone;
		
		while(isValid == false) {
			System.out.print("Enter phone: ");
			phone = input.nextLine();
			
			if(!phone.startsWith("+84") || phone.startsWith("0") ) {
				int length = phone.length();
				int i ; 
				
				if(!phone.startsWith("+84")){
					i = 3;
				} else {
					i = 1;
				}
				
				int sum = 0; 
				for (; i < length; i++) {
					char c = phone.charAt(i);
					if(!Character.isDigit(c)) {
						System.out.println("Invalid phone");
						break;
					}
					sum++;
				}
				if(sum == 9) {
					isValid = true;
					System.out.println("Phone is valid");
				} else {
					System.out.println("Invalid phone");
				}
			} else {
				System.out.print("Phone is invalid");
			}
		}
	}

}
