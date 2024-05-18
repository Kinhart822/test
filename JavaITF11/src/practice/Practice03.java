/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        if (n < 2) {
            System.out.println("Đây không phải là 1 số nguyên tố");
        } else if (n == 2) {
            System.out.println("Đây là 1 số nguyên tố");
        } else if (n % 2 == 0) {
            System.out.println("Đây không phải là 1 số nguyên tố");
        } else {
            boolean isPrime = true;
            for(int i = 3; i*i <= n; i += 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println("Đây là 1 số nguyên tố");
            } else {
                System.out.println("Đây không phải là 1 số nguyên tố");
            }
        }
	}
}

