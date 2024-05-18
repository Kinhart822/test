/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session4;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {

	public static void main(String[] args) {
		// Nhập hệ số a và b
		Scanner input = new Scanner(System.in);
		System.out.printf("Hay nhap he so a: ");
		float a = input.nextFloat();
		System.out.printf("Hay nhap he so b: ");
		float b = input.nextFloat();
		System.out.printf("Phuong trinh vua nhap vao la: %.2fx + %.2f = 0 => ", a, b);
		
		// Kiểm tra a != 0 ?
		if (a != 0) {
			float x = -b/a;
			System.out.print("Phuong trinh có 1 nghiem: " + x);
		}
		else {
			// Kiểm tra b != 0
			if (b != 0) {
				System.out.print("Phuong trinh vo nghiem!");
			} else {	// a=0 và b=0
				System.out.print("Phuong trinh co vo so nghiem!");
			}
		}

		
	}

}
