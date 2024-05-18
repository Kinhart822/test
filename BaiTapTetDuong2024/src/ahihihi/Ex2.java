/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihi;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int size;
		do {
		System.out.print("Nhap vao kich thuoc array:  ");
		size = input.nextInt();
		} while (size <= 0);
		
		// Tạo array
		int[] array = new int[size];
		
		// Lần lượt nhập các giá trị vào cho array
		for (int i = 0; i < size; i++) {
			System.out.printf("Nhap vao gia tri thu %d:  ", i);
			array[i] = input.nextInt();
		}
		
		// In ra array mà người dùng vừa nhập vào
		System.out.print("Original Array: [");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] + "]");
            }
        }

        // Đảo ngược dãy số
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i ] = temp;   
        }
             
        System.out.print("Reversed Array: [");
        for (int i = 0; i < size; i++) {
        	if (i != size - 1) {
                System.out.print(array[i] + ",");
        	} else {
                System.out.print(array[i] + "]");
        	}
        }
	}

}


