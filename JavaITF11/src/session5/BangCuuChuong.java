/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session5;

public class BangCuuChuong {

	public static void main(String[] args) {
		System.out.println("------------------ ");
		// Dùng vòng lặp lồng nhau để in ra bảng cửu chương
		for(int i = 1; i <= 10; i++){
			System.out.printf("Bang nhan %d:\n", i);
			for(int j = 1; j<= 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println("------------------ ");
		}

	}

}
