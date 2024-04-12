/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.utils;

public class Validator {
	
// » course code: is a string of 5 characters, started by “FW” and followed by 3 digits.
	public static boolean validateCourseCode(String code) {
        return code.matches("^FW\\d{3}$");
    }

// » status: only accept ‘active’ or ‘in-active’.
    public static boolean validateStatus(String status) {
        return status.equals("active") || status.equals("in-active");
    }

 // » flag: only accept ‘optional’, ‘mandatory’, ‘N/A’.
    public static boolean validateFlag(String flag) {
        return flag.equals("optional") || flag.equals("mandatory") || flag.equals("N/A");
    }
}

