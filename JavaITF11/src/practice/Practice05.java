/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số nguyên dương thứ nhất: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Nhập số nguyên dương thứ hai: ");
	        int num2 = scanner.nextInt();
	        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + gcd(num1, num2));
	    }

	    public static int gcd(int num1, int num2) {
	    	while (num1 != num2) {
	            if (num1 > num2) {
	                num1 = num1 - num2;
	            } else {
	                num2 = num2 - num1;
	            }
	        }
	    	return num1;

	   
	    }
	
	}

