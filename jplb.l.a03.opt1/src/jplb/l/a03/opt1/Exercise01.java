/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a03.opt1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int x;
		int y;
		int z;
		
		System.out.println("Nhap vao so thu nhat: ");
		x = input.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		y = input.nextInt();
		System.out.println("Nhap vao so thu ba: ");
		z = input.nextInt();
		
		if (smallestNumber(x, y, z)) {
			System.out.println("The smallest value is: " + x);
		} else if (smallestNumber(y, x, z)) {
			System.out.println("The smallest value is: " + y);
		} else {
			System.out.println("The smallest value is: " + z);
		}
	}
	
	static boolean smallestNumber(int num01, int num02, int num03) {
		return num01 < num02 && num01 < num03;
	}

}

