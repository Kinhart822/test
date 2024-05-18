/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihi;


public class Ex11 {
	
	public static void main(String[] args) {
	    int array[] = {1, 2, 3, 4, 5, 6, 7};
		rotate(array, 2, 7);
	}
	
	static void rotate(int array[], int d, int n) {
	    int[] temp = new int[d];
	 
	    for (int i = 0; i < d; i++)
	        temp[i] = array[i];
	 
	    for (int i = d; i < n; i++)
	        array[i - d] = array[i];
	 
	    for (int i = 0; i < d; i++)
	        array[i + n - d] = temp[i];
	}
}
