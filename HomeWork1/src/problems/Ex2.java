/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package problems;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        int[] array = new int[n];
        int size = 0;
        char choice;

        do {
            System.out.println("Nhập các giá trị cho mảng:");
            array[size] = input.nextInt();
            size++;
            if (size == n) {
                break;
            }
            System.out.println("Tiếp tục nhập? Y/N");
            choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        
        while (size != n) {
        	if (size != n) {
        		System.out.println("Vui lòng nhập các phần tử còn lại");
        		array[size] = input.nextInt();
                size++;
            }
        }

        selectionSort(array, size);
	}
	
	 public static void selectionSort(int[] array, int size) {
		 for (int i = 0; i < size - 1; i++) {
			 int minIndex = i;
	         for (int j = i + 1; j < size; j++) {
	        	 if (array[j] < array[minIndex]) {
	        		 minIndex = j;
	        	 }
	         }

	         int temp = array[minIndex];
	         array[minIndex] = array[i];
	         array[i] = temp;

	         printArray(array, size);
		 }
	 }

	 public static void printArray(int[] array, int size) {
		 for (int i = 0; i < size; i++) {
			 System.out.print("Array after step " + (i+1) + ": ");
	         for (int m : array) {
	        	 System.out.print(m + " ");
	         }
	         System.out.println();
		 }
	}
}
