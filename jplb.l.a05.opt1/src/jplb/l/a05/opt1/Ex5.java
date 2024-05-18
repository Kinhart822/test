/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a05.opt1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
        int x = input.nextInt();
        System.out.print("Enter the second number: ");
        int y = input.nextInt();

        while(x < 0 || x > 1000) {
            System.out.println("Error");
            x = input.nextInt();
        }
        while(y < 0 || y > 1000) {
            System.out.println("Error");
            y = input.nextInt();
        }
        while(x==y) {
            System.out.println("Error");
        }
        
        if(x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        for(int i = x; i <= y; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
	}

}
