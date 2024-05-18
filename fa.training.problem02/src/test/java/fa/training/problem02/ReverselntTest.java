/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.problem02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import fa.training.Reverselnt;

public class ReverselntTest {

	@Test
	@DisplayName("TC001")
	public void TC001_reverse_success() {
		// 1 Input
		int a = 12345;	
		
		// 2 Expected result
		int expectedResult = 54321;
		
		// 3 Actual result
		Reverselnt reverse = new Reverselnt();
		int actualResult = reverse.reverseInt(a);

		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}
    
	@Test
	@DisplayName("TC002")
	public void TC002_reverse_success() {
		// 1 Input
		int a = 123456;	
		
		// 2 Expected result
		int expectedResult = 654321;
		
		// 3 Actual result
		Reverselnt reverse = new Reverselnt();
		int actualResult = reverse.reverseInt(a);

		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}
	
	@Test
	@DisplayName("TC003")
	public void TC003_reverse_success() {
		// 1 Input
		int a = 1234567;	
		
		// 2 Expected result
		int expectedResult = 7654321;
		
		// 3 Actual result
		Reverselnt reverse = new Reverselnt();
		int actualResult = reverse.reverseInt(a);

		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}
	
	@Test
	@DisplayName("TC004")
	public void TC004_reverse_success() {
		// 1 Input
		int a = 123453;	
		
		// 2 Expected result
		int expectedResult = 354321;
		
		// 3 Actual result
		Reverselnt reverse = new Reverselnt();
		int actualResult = reverse.reverseInt(a);

		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}
	@Test
	@DisplayName("TC001")
	public void TC001_reverse_success111() {
		// 1 Input
		int a = 12345;	
		
		// 2 Expected result
		int expectedResult = 54321;
		
		// 3 Actual result
		Reverselnt reverse = new Reverselnt();
		int actualResult = reverse.reverseInt(a);

		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}
	
	@Test
	@DisplayName("TC005")
	public void TC005_reverse_success() {
		// 1 Input
		int a = 1234534;	
		
		// 2 Expected result
		int expectedResult = 4354321;
		
		// 3 Actual result
		Reverselnt reverse = new Reverselnt();
		int actualResult = reverse.reverseInt(a);

		// 4 Compare actual vs expected => (equals) success / failed
		Assertions.assertEquals(expectedResult, actualResult);;
	}
    
}
