/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a04.opt1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập số thứ nhất: ");
		int firstNumber = input.nextInt();
		System.out.print("Nhập số thứ hai: ");
		int secondNumber = input.nextInt();

		input.nextLine();
		System.out.print("Nhập phép toán: ");
		char operator = input.nextLine().charAt(0);
		switch (operator) {
        case '+':
            System.out.printf("Kết quả: %d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
            break;
        case '-':
            System.out.printf("Kết quả: %d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
            break;
        case '*':
            System.out.printf("Kết quả: %d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
            break;
        case '/':
            if (secondNumber != 0) {
                System.out.printf("Kết quả: %d / %d = %.2f", firstNumber, secondNumber, (double) firstNumber / secondNumber);
            } else {
                System.out.println("Lỗi");
            }
            break;
        case '%':
            if (secondNumber != 0) {
                System.out.printf("Kết quả: %d %% %d = %d", firstNumber, secondNumber, firstNumber % secondNumber);
            } else {
                System.out.println("Lỗi");
            }
            break;
        default:
            System.out.println("Phép toán không hợp lệ");
    }
}

}
