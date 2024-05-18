/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package exercise2;

import java.util.Arrays;

public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = {43, 32, 53, 23, 12, 34, 3, 12, 43, 32};
        
        System.out.println("Original Array: " + Arrays.toString(myIntArray));
        
        for (int i = 0; i < myIntArray.length /2; i++) {
            int temp = myIntArray[i];
            myIntArray[i] = myIntArray[myIntArray.length - 1 - i];
            myIntArray[myIntArray.length - 1 - i] = temp;
        }
        
        System.out.println("Reversed Array: " + Arrays.toString(myIntArray));
	}

}
