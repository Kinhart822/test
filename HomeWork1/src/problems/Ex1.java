/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package problems;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        bubbleSort(array);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.print("Array after step " + (i+1) + ": ");
            for (int m : array) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
