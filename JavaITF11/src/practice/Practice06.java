/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

import java.util.Scanner;

public class Practice06 {

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
		
		int sum = 0;
		for (int i =0 ;i < size; i +=2 ) {
			sum += array[i];
		}
		System.out.println("Tong cac phan tu o vi tri chan: " + sum);
		
		System.out.println("Cac so nguyen to trong mang la: ");
        for (int i = 0; i < size; i++) {
            if (isPrime(array[i])) {
                System.out.println(array[i]);
            }
        }
        
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i ] = temp;   
        }
        
//        for (int i = 0, j = size - 1; i < j; i++, j--) {
//            int temp = array[i];
//            array[i] = array[j];
//            array[j] = temp;   
//        }
        
        System.out.print("Reversed Array: [");
        for (int i = 0; i < size; i++) {
        	if (i != size - 1) {
                System.out.print(array[i] + ",");
        	} else {
                System.out.print(array[i] + "]");
        	}
        }
	}
		
	public static boolean isPrime(int n) {
		if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for(int i = 3; i*i <= n; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
	
	}
}



