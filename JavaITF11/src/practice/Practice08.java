/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

public class Practice08 {

	public static void main(String[] args) {
		// Cho 1 array với các giá trị tăng dần. [1, 3, 6, 7, 8]
		// Nhập thêm 1 giá trị mới vào array mà vẫn giữ cho nó có tính chất tăng dần
		// Ví dụ: giá trị mới là 4 -> [1, 3, 4, 6, 7, 8]
				int[] array = { 1, 3, 6, 7, 8 };
				for(int value: array) {
					System.out.print(value + " ");
				}
				System.out.println();
				int newValue = 4;
				int[] newArray = new int[array.length + 1];
				// your code here
				boolean isAdded = false;
				for (int i = 0; i < array.length; i++) {
					if (array[i] < newValue) {
						newArray[i] = array[i];
					} else {
						if (!isAdded) {
							newArray[i] = newValue;
							isAdded = true;
						}
						newArray[i + 1] = array[i];
					}
				}
				
				for(int value: newArray) {
					System.out.print(value + " ");
				}

	}

}
