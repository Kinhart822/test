/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihi;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.println("Nhập kích thước của mảng:");
	    int size = input.nextInt();
	    int[] array = new int[size];
	    System.out.println("Nhập các phần tử của mảng:");
	    for (int i = 0; i < size; i++) {
	    	array[i] = input.nextInt();
	    }

	    int[] count = new int[100];
	    for (int num : array) {
	    	count[num]++;
	    }
	    
	    System.out.println("Kết quả:");
	    for (int i = 0; i < count.length; i++) {
	    	if (count[i] > 0) {
	    		System.out.println("Số " + i + ": " + count[i]);
	        }
	    }
	}
}


