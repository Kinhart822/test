/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session7;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 13;
		int b = 0;
		int c;
		
//		int c = a/b;	
//		System.out.println(c);
//		System.out.println("Done");
		
		try {
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Done");

		

	}

}
