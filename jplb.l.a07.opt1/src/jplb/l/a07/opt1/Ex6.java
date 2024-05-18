/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a07.opt1;

public class Ex6 {

	public static void main(String[] args) {
		String str1 ="abcdabc";
		String str2 ="hello";

        for(char i : str1.toCharArray()){
	        if ( str1.indexOf(i) == str1.lastIndexOf(i)) {
	            System.out.println("First non-repeating character of str1 is: " + i);
	            break;
	        }
        }
        for(char i : str2.toCharArray()){
	        if ( str2.indexOf(i) == str2.lastIndexOf(i)) {
	            System.out.println("First non-repeating character of str2 is: " + i);
	            break;
	        }
        }
	}

}
