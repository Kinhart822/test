/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        int sum = 0;
        while (n > 0) {
            sum =  (sum + n % 10);
            n = n / 10;
        }

        System.out.println("Tổng các chữ số trong số đó là: " + sum);
    }

	}


