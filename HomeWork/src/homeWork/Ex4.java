/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package homeWork;

import java.util.Scanner;

public class Ex4 {
	
	public static int fib(int n) {
        if (n <= 1) {
        	return n;
        }else{
        	return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.println("Nhập vào số n (n > 2): ");
            n = input.nextInt();
            if (n <= 2) {
                System.out.print("Invalid number. Please enter a number greater than 2: ");
                n = input.nextInt();
            }
        } while (n <= 2);

        System.out.println("Dãy Fibonacci của " + n + " số là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
