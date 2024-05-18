/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session6;

import java.util.Scanner;

public class AppendArray {

	public static void main(String[] args) {
		// Cho 1 array với các giá trị tăng dần. [1, 3, 6, 7, 8]
		// Nhập thêm 1 giá trị mới vào array mà vẫn giữ cho nó có tính chất tăng dần
		// Ví dụ: giá trị mới là 4 => [1, 3, 4, 6, 7, 8]
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
        
        // Cách 1: 
//        // Nhập vào giá trị mới
//        System.out.print("Nhap vao gia tri moi: ");
//        int newValue = input.nextInt();
//
//        // Tạo mảng mới với kích thước lớn hơn 1 và chèn giá trị mới vào đúng vị trí tăng dần
//        int[] newArray = new int[size + 1];
//        boolean hasInserted = false;
//        for (int i = 0, j = 0; i < size; i++, j++) {
//            if (!hasInserted && array[i] > newValue) {
//                newArray[j] = newValue;
//                hasInserted = true;
//                j++;
//            }
//            newArray[j] = array[i];
//        }
//        if (!hasInserted) {
//            newArray[size] = newValue;
//        }
//
//        // In ra mảng sau khi chèn
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println("Mang sau khi chen: " + newArray[i]);
//        }

        // Cách 2:
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

    



