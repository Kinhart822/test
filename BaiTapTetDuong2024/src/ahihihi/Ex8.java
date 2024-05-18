/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihi;

import java.util.Scanner;

public class Ex8 {

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

		// Tính tổng các phần tử cực đại
		int sum = 0;
		for (int i = 1; i < size - 1; i++) {
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				sum += array[i];
			}
		}
		
		System.out.println("Tong cac phan tu cuc dai: " + sum);
	}

}
