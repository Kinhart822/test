/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a07.opt1;

public class Ex1 {
	
	public static void main(String[] args) {
		
		String str1 = " \" Fresher Academy \" ";
		System.out.println(str1);
		
		String str2 = " \" FRESHER ACADEMY \" ";
		System.out.println(str2);
	
		if (str1.equalsIgnoreCase(str2)){
			System.out.print(str1 + "is equal to" + str2 );
		}else {
			System.out.print(str1 + "is not equal to" + str2 );
		}

	}

}
