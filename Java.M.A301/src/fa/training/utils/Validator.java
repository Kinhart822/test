/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Validator {
	
// 	» email: correct email format.
	 public static boolean validateEmail(String email) {
		 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                 "[a-zA-Z0-9_+&*-]+)*@" + 
                 "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                 "A-Z]{2,7}$"; 
                   
		 Pattern pat = Pattern.compile(emailRegex); 
		 if (email == null) 
			 return false; 
		 return pat.matcher(email).matches(); 
	 }

// 	» birthDate: correct date format (dd/MM/yyyy).
	 public static boolean validateDate(String birthDate) {
		 Date date = new Date();
	     SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	     try{
	         dateFormat.parse(birthDate);
	         System.out.println(date);
	         return true;
	     } catch (ParseException e) {
	    	 return false;
	     }
	 }

//	» theory, pactice: in the range from 0 to 10.
	 public static boolean validateTheory(double theory) {
		 if (theory <0 && theory > 10) {
			 return false;
		 } else {
			 return true;
		 }
	 }
	 
	 public static boolean validatePractice(double practice) {
		 if (practice < 0 && practice > 10 ) {
			 return false;
		 } else {
			 return true;
		 }
	 }
}
