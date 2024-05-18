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
		Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử trong mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // Hoán đổi array[j+1] và array[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Nhập giá trị cần tìm:");
        int key = scanner.nextInt();

        int result = binarySearch(array, key);

        if (result == -1) {
            System.out.println("Phần tử không có trong mảng");
        } else {
            System.out.println("Phần tử được tìm thấy tại vị trí " + (result + 1));
        }

    }

	public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}


