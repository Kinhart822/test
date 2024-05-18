/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session6;

public class DemoMultidimensionalArray {

	public static void main(String[] args) {
		int[][] a = {
				 {1, 2, 3},
				 {4, 5, 6, 9},
				 {7},
				};
				for (int i = 0; i < a.length; ++i) {
					for(int j = 0; j < a[i].length; ++j) {
					System.out.print(a[i][j] + " ");
					}
					System.out.println("");
				}


	}

}
