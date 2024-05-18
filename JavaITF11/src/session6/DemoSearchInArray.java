/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session6;

public class DemoSearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceArray = {11, 14, 15, 44, 56, 77, 55, 29};
		 System.out.println("Index of 11 is: " + findIndex(sourceArray, 11));
		 System.out.println("Index of 88 is: " + findIndex(sourceArray, 88));

	}
	public static int findIndex(int[] sourceArray, int targetNumber) {
		 if (sourceArray == null || sourceArray.length == 0) {
		 return -1;
		 }
		 for (int i = 0; i < sourceArray.length; i++) {
		 if (sourceArray[i] == targetNumber) {
		 return i;
		 }
		 }
		 return -1;
	}

}
