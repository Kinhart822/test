/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihi;

import java.util.Scanner;

public class Ex7 {

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

		// Sắp xếp các phần tử chẵn theo thứ tự giảm dần
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] % 2 == 0 && array[j] % 2 == 0 && array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("Mang sau khi sap xep cac phan tu chan giam dan: ");
		for(int value: array) {
			System.out.print(value + " ");
		}

	}

}
