/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a05.opt1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int n = input.nextInt();

        while(n < 1) {
            System.out.println("Error");
            n = input.nextInt();
        }
		
		int t1 = 0;
		int t2 = 1;
		System.out.printf("Fibonacci Series: %d %d" ,t1, t2);
		for (int i = 3 ; i <= n; i++) {
			int nextTerm = t1 + t2;
			System.out.printf(" %d", nextTerm);
			t1 = t2;
			t2 = nextTerm;
		}

		}
		
	}


