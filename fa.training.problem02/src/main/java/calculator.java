/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

import javax.management.RuntimeErrorException;

public class calculator {

	public double calculate(int a, int b, String action){
		switch(action) {
		case "+":{
			return a+b;
		}
		case "-":{
			return a-b;
		}
		case "*":{
			return a*b;
		}
		case "/":{
			return (double) (a/b);
		}
		default:
			throw new RuntimeException("Unknown action: "+ action);
		}
	}
}
