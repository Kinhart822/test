/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CalculatorText {

	@Test
	@DisplayName("TC001 - add 2 numbers")
	public void TC001_add_success() {
		// 1 Input
		int a=0;
		int b=10;
		String action = "+";
		
		// 2 Expected result
		double expectedResult = 10;
		
		// 3 Actual result
		calculator calculator = new calculator();
		double actualResult = calculator.calculate(a, b, action);
		
		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}
	
	@Test
	@DisplayName("TC002 - subtract 2 numbers")
	public void TC002_subtract_success() {
		// 1 Input
		int a=10;
		int b=0;
		String action = "-";
		
		// 2 Expected result
		double expectedResult = 10;
		
		// 3 Actual result
		calculator calculator = new calculator();
		double actualResult = calculator.calculate(a, b, action);
		
		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}	
	@Test
	@DisplayName("TC003 - divide 2 numbers => Failed")
	public void TC003_divide_failed() {
		// 1 Input
		int a=10;
		int b=0;
		String action = "/";
		
		// 2 Expected result
		Class<ArithmeticException> classType = ArithmeticException.class;

		// 3 Actual result
		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertThrows(classType, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				calculator calculator = new calculator();
				double actualResult = calculator.calculate(a, b, action);				
			}
		});
	}	
	@Test
	@DisplayName("TC004 - divide 2 numbers => Success")
	public void TC004_divide_success() {
		// 1 Input
		int a=10;
		int b=2;
		String action = "/";
		
		// 2 Expected result
		double expectedResult = 5;
		
		// 3 Actual result
		calculator calculator = new calculator();
		double actualResult = calculator.calculate(a, b, action);
		
		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}	
	public void TC005_multiply_success() {
		// 1 Input
		int a=3;
		int b=4;
		String action = "*";
		
		// 2 Expected result
		double expectedResult = 12;
		
		// 3 Actual result
		calculator calculator = new calculator();
		double actualResult = calculator.calculate(a, b, action);
		
		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}	

}
