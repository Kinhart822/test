/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a05.opt1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int n = input.nextInt();

        while(n < 1 || n > 100) {
            System.out.println("Only accept number between 1 - 100");
            n = input.nextInt();
        }
        
		int sum = 0;
        for(int i = 1; i <= n; i++) {
        	sum += i;
        }
        System.out.printf("Sum of natural numbers 1-%d: %d\n", n, sum);
		
	}
		
}
