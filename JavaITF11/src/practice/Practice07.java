/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size1;
		do {
		System.out.print("Nhap vao kich thuoc array1:  ");
		size1 = input.nextInt();
		} while (size1 <= 0);
		
		int size2;
		do {
		System.out.print("Nhap vao kich thuoc array2:  ");
		size2 = input.nextInt();
		} while (size2 <= 0);
		
		// Tạo array
		int[] array1 = new int[size1];
		int[] array2 = new int[size2];

		
		// Lần lượt nhập các giá trị vào cho array
		for (int i = 0; i < size1; i++) {
			System.out.printf("Nhap vao gia tri thu %d cua array1:  ", i);
			array1[i] = input.nextInt();
		}
		for (int j = 0; j < size2; j++) {
			System.out.printf("Nhap vao gia tri thu %d cua array2:  ", j);
			array2[j] = input.nextInt();
		}
		
		// In ra array mà người dùng vừa nhập vào
		System.out.print("Original Array: [");
        for (int i = 0; i < size1; i++) {
            if (i != size1 - 1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.println(array1[i] + "]");
            }
        }
        System.out.print("Original Array: [");
        for (int j = 0; j < size2; j++) {
            if (j != size2 - 1) {
                System.out.print(array2[j] + ", ");
            } else {
                System.out.println(array2[j] + "]");
            }
        }
        
        System.out.println("Cac so chung trong hai mang la:");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);  
                    break;
                }
            }
            
        }
        
        boolean foundMissing = false;
        System.out.print("Missing elements in array2: ");
        for (int i = 0; i < array1.length; i++) {
            boolean found = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                if (foundMissing) {
                    System.out.print(", ");
                }
                System.out.print(array1[i]);
                foundMissing = true;
            }
        }
        if (!foundMissing) {
            System.out.println("No missing elements.");
        } else {
            System.out.println();
        }

        // Cách 1:
//        foundMissing = false;
//        System.out.print("Missing elements in array1: ");
//        for (int i = 0; i < array2.length; i++) {
//            boolean found = false;
//            for (int j = 0; j < array1.length; j++) {
//                if (array2[i] == array1[j]) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                if (foundMissing) {
//                    System.out.print(", ");
//                }
//                System.out.print(array2[i]);
//                foundMissing = true;
//            }
//        }
//        if (!foundMissing) {
//            System.out.println("No missing elements.");
//        } else {
//            System.out.println();
//        }
        
        // Cách 2:
        for(int value1 : array1) {
        	boolean isFound = false;			
			for(int value2: array2) {
				if(value1 == value2) {
					isFound = true;
					break;
				}
			}
			
			// Sau khi duyệt hết rồi, mà isFound vẫn bằng false
			if(!isFound ) {
				System.out.print(value1 + " ");
			}
        }

	}

}
