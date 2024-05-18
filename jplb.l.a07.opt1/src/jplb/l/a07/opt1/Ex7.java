/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a07.opt1;

public class Ex7 {

	public static void main(String[] args) {
		 String str1="FPT Software company";    
         
	     str1 = str1.replaceAll("\\s+", "");    
	            
	     System.out.println("String after removing all the white: \"" + str1 + "\"");  
	     
	     String str2="Fresher Academy";    
         
	     str2 = str2.replaceAll("\\s+", "");    
	            
	     System.out.println("String after removing all the white: \"" + str2 + "\"");  
	}

}
