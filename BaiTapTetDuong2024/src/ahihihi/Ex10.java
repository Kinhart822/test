/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihi;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size;
		do {
			System.out.print("Nhap vao kich thuoc array:  ");
			size = input.nextInt();
		} while (size <= 0);
		
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.printf("Nhap vao gia tri thu %d:  ", i);
			array[i] = input.nextInt();
		}
		
		System.out.print("Original Array: [");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] + "]");
            }
        }

		// Tìm phần tử đầu tiên có chữ số đầu là lẻ
		int firstOddDigit = -1;
		for (int i = 0; i < size; i++) {
			int number = array[i];
			while (number >= 10) {
				number /= 10;
			}
			if (number % 2 != 0) {
				firstOddDigit = array[i];
				break;
			}
		}
		
		if (firstOddDigit != -1) {
			System.out.println("Phan tu dau tien co chu so dau la le: " + firstOddDigit);
		} else {
			System.out.println("Khong co phan tu nao co chu so dau la le trong mang.");
		}
	}

}
