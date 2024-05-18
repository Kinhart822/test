/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemoInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
//		System.out.println("Enter length: ");
//		int length = input.nextInt();
		
		int[] arrInt = new int[4];
		
		System.out.println("Enter element with index = 0");
		arrInt[0] = input.nextInt();
		System.out.println("Enter element with index = 1");
		arrInt[1] = input.nextInt();
		System.out.println("Enter element with index = 2");
		arrInt[2] = input.nextInt();
		System.out.println("Enter element with index = 3");
		arrInt[3] = input.nextInt();
		
		System.out.println(Arrays.toString(arrInt));
	

	
	
//	 chú ý
	// System.out.println("Số max là "+label+": " + max)
	
	for (int b = 1; b <= 10; b++) {
		for (int a = 1; a <= 10; a++) {
			System.out.printf("%d x %d = %d \t", a,b, a*b);
		}
		System.out.printf("\n");

	}
	}
}
