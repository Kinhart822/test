/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session2;

import java.util.Arrays;

public class ArrayDemo {

	 public static void main(String[] args) {
	        int[] arrInt = {4,7,8,5,2};

	        arrInt = removeElement(arrInt, 4);
	        System.out.println(Arrays.toString(arrInt));
	    }

	    private static int[] removeElement(int[] oldArr, int position) {
	        //Step1: Tạo mảng mới =  length - 1
	        int[] newArr = new int[oldArr.length - 1];

	        //Step2:

	        for(int index = 0; index < oldArr.length; index++) {
	            if(index < position) {
	                newArr[index] = oldArr[index];
	            } else if(index > position) {
	                newArr[index - 1] = oldArr[index];
	            }
	        }
	        return newArr;
	    }

	}
