/*
 * (C) Copyright 2021 Fresher Academy. All Rights Reserved.
 *
 * @author: Phạm Hoàng Anh
 * @date: Dec 8, 2023
 */

package homeWork;

import java.util.Scanner;

public class Ex5 {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
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

        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
