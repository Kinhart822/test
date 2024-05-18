/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihihihi;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
	
	// Main task
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        input(arr);
		
        System.out.print("Enter the sum to find pairs: ");

        int sum = scanner.nextInt();
        
        pair(arr, sum);
        
        scanner.close();
	}

	// Task 1:	A function that allows the user to enter an integer array. After each enter an array element, the program
	//			will ask "Do you want to continue?". If the user selects 'Y' or 'y', input continues, otherwise the
	//			program will stop the input.
	static void input(int[] arr) {
		Scanner input = new Scanner(System.in);
		char isContinue = 0;

		for (int i = 0; i < arr.length; i++) {
            System.out.printf("Hãy nhập giá trị của array[%d]: ", i);
			arr[i] = input.nextInt();
            System.out.println("Do you want to continue? (Y/N)");
            char choice = input.next().charAt(0);
            if (choice != 'Y' && choice != 'y') {
                break;
            }
        }

		System.out.print("Original Array: [");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.println(arr[i] + "]");
			}
		}
	}

	// Task 2: 	A function that allows the user to enter a sum and print out all pairs of numbers in the array that its 
	//			total equals with the given sum.
	static void pair(int[] arr, int sum) {
        System.out.println("Pairs found:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
