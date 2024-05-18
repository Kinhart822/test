/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.utils;

import java.util.regex.*;

public class Validation_Rules {

	public static boolean isValidISBN(String isbn) {
		if (isbn.length() < 10 || isbn.length() > 17) {
            return false;
		} 	
		String regex = "^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";
	        	
		Pattern pattern = Pattern.compile(regex);
	        
	    Matcher matcher = pattern.matcher(isbn);
	        
	    return matcher.matches();
	}
}


