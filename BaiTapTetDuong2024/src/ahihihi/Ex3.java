/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihi;

import java.util.Scanner;

public class Ex3 {

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
		
		int[] newArray = new int[array.length + 1];
		System.out.println("Mang sau khi chen: ");
		boolean isAdded = false;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < newValue || isAdded) {
				newArray[i + (isAdded ? 1 : 0)] = array[i];
			} else {
				newArray[i] = newValue;
				isAdded = true;
				newArray[i + 1] = array[i];
			}
		}
		
		if (!isAdded) {
			newArray[newArray.length - 1] = newValue;
		}
		
		for(int value: newArray) {
			System.out.print(value + " ");
		}
	}
	
}
