/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// Nhập mảng
		Scanner input = new Scanner(System.in);

		int size = 0;
		do {
			System.out.print("Number of elemnets: ");
			size = input.nextInt();
		} while (size < 1 || size > 100);
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
				}
		// Tìm min max
		int min = array[0];
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		// Tìm số còn thiếu: sử dụng cách - kiểm tra trong mảng
		String result = "";
		for (int number = min + 1; number < max; number++) {
		// Kiểm tra xem number có nằm trong dãy hay không
		boolean isExist = false;
		for (int i = 0; i < size; i++) {
			if (number == array[i]) {
			// Có trong array
				isExist = true;
				break;
			}
		}

		// Duyệt hết mà vẫn không tìm thấy => đây là số còn thiếu
			if (!isExist) {
				result += number + ", ";
			}
		}
		if (result.isEmpty()) {
			System.out.print("No missing value!");
		} else {
			System.out.print("Missing value(s): " + result);
		}
	}
}

