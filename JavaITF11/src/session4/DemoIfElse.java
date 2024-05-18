/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session4;

import java.util.Scanner;

public class DemoIfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

				// Bước 1: Nhập điểm số
		
		float mark;
		
		System.out.println("Hay nhap diem cua ban: ");
		mark = input.nextFloat();
		
				// Bước 2: Kiểm tra điểm >= 6
				// Bước 3: In ra kết quả
		
		if (mark <= 6 && mark >= 0) {
			System.out.println(" You have failed the java exam and must take the retake exam ");
		} else if (mark > 6 && mark <= 10) {
			System.out.println("You have passed the java exam");
		} else {
			System.out.println("You died");
		}
		
//		if (mark <= 10 && mark >= 0) {
//			if (mark <= 6) {
//				System.out.println(" You have failed the java exam and must take the retake exam ");
//			} else {
//				System.out.println("You have passed the java exam");
//			} 
//		} else {
//			System.out.println("You died");
//		}
	}
}

