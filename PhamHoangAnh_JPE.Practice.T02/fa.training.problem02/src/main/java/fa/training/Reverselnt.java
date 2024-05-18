/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training;

public class Reverselnt {
	
	public int reverseInt(int input) {
		int rev_input = 0; 
		while (input > 0) { 
			rev_input = rev_input * 10 + input % 10; 
			input = input / 10; 
	    } 
	    return rev_input; 
	}
}
