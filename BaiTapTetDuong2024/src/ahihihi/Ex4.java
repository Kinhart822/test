/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihi;

import java.util.Scanner;

public class Ex4 {

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
		        
		// Chèn X vào dãy sao cho dãy vẫn có thứ tự tăng dần       
		System.out.print("Nhap vao gia tri moi: ");
		int newValue = input.nextInt();
		
		// Tính số lượng phần tử chẵn trong mảng
		int evenCount = 0;
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				evenCount++;
			}
		}
		
		int[] newArray = new int[size + evenCount];
		System.out.println("Mang sau khi chen: ");
		
		int j = 0;
		for(int i = 0; i < size; i++) {
			newArray[j++] = array[i];
			if(array[i] % 2 == 0) {
				newArray[j++] = newValue;
			}
		}
		
		for(int value: newArray) {
			System.out.print(value + " ");
		}
	}

}


