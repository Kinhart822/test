/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a05.opt1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        while(n < 1 || n > 1000) {
            System.out.println("Only accept number between 1 - 1000");
            n = input.nextInt();
        }

        System.out.printf("Bang nhan %d:\n", n);
		for(int j = 1; j<= 10; j++) {
			System.out.printf("%d x %d = %d\n", n, j, n*j);
		}
	}
	

}

