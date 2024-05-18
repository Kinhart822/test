/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session4;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startCode = System.currentTimeMillis();
		
		StringBuilder text = new StringBuilder("");
		for(int i = 0; i < 100000; i++) {
			text = text.append("Hello World");
		}
		
		long endCode = System.currentTimeMillis();
		System.out.print(endCode - startCode);
	}

}
