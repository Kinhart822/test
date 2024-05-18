/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a07.opt1;

public class Ex5 {

	public static void main(String[] args) {
		String str1 = "FPT Software ";    
	    String reversedStr1 = "";    
	            
	    for(int i = str1.length()-1; i >= 0; i--){    
	    	reversedStr1 = reversedStr1 + str1.charAt(i);    
	    }            
	        
	    System.out.println("Original str1: " + str1);   
	    System.out.println("Reverse of str2: " + reversedStr1); 
	    
	    String str2 = "Fresher Academy";    
	    String reversedStr2 = "";    
	            
	    for(int i = str2.length()-1; i >= 0; i--){    
	    	reversedStr2 = reversedStr2 + str2.charAt(i);    
	    }            
	        
	    System.out.println("Original str2: " + str2);   
	    System.out.println("Reverse of str2: " + reversedStr2); 
	    }    
}


