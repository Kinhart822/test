/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size;
		do {
		    System.out.print("Number of elements:  ");
		    size = input.nextInt();
		    while (size <= 0 || size >= 100) {
		        System.out.print("Invalid number");
		        size = input.nextInt();
		    }
		} while (size <= 0);

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
		    array[i] = input.nextInt();
		}

		System.out.print("Original Array: [");
		for (int i = 0; i < size; i++) {
		    if (i != size - 1) {
		        System.out.print(array[i] + ", ");
		    } else {
		        System.out.println(array[i] + "]");
		    }
		}

		if (size % 2 == 0) {
			int[] sum = new int[size / 2];
			for (int i = 0; i < size; i += 2) {
				sum[i/2] = array[i] + array[i + 1];    	 
			}
			System.out.print("[");
			for (int i = 0; i < sum.length; i++) {
			    if (i != sum.length - 1) {
			        System.out.print(sum[i] + ", ");
			    } else {
			        System.out.println(sum[i] + "]");
			    }
			}
		} else {
			int[] sum = new int[size / 2 + 1];
		    for (int i = 0; i < size - 1; i += 2) {
		        sum[i / 2] = array[i] + array[i + 1];    	 
		    }
		    sum[sum.length - 1] = array[size - 1] * 2;
		    System.out.print("[");
			for (int i = 0; i < sum.length; i++) {
			    if (i != sum.length - 1) {
			        System.out.print(sum[i] + ", ");
			    } else {
			        System.out.println(sum[i] + "]");
			    }
			}
		}
				
//		 // Nhập mảng
//				Scanner input = new Scanner(System.in);
//
//				int size = 0;
//				do {
//					System.out.print("Number of elemnets: ");
//					size = input.nextInt();
//				} while (size < 1 || size > 100);
//				int[] array = new int[size];
//				for (int i = 0; i < size; i++) {
//					array[i] = input.nextInt();
//				}
//				// Xác định độ dài mảng thứ 2
//				int size2 = size / 2 + size % 2;
//
//				// Khai báo mảng thứ 2 với kích thước phù hợp
//				int[] array2 = new int[size2];
//
//				for (int i = 0; i < size2; i += 1) {
//					if (i * 2 + 1 == size) {
//						array2[i] = array[i * 2] * 2;
//					} else {
//						array2[i] = array[i * 2] + array[i * 2 + 1];
//					}
//				}
//
//				for (int value : array2) {
//					System.out.print(value + ", ");
//				}
//			}
//		}
		
	}

}
