/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session02;

public class DemoOperators {

	public static void main(String[] args) {
		
// Chú ý:
	//	▪ print() - It prints string inside the quotes.
	//	▪ println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
	//	▪ printf() - It provides string formatting

// Arithmetic operators
		int a = 25;
		int b = 10;
		int additionResult = a + b;
		int subtractionResult = a - b;
		int multiplicationResult = a * b;
		int divisionResult = a / b;
		int modulusResult = a % b;
		System.out.printf("Ket quả la: %d\n", additionResult);	// Cách khác: System.out.printf("Tong cua %d va %d la: %d\n", a, b, additionResult);
		System.out.printf("Ket quả la: %d\n", subtractionResult);
		System.out.printf("Ket quả la: %d\n", multiplicationResult);
		System.out.printf("Ket quả la: %d\n", divisionResult);
		System.out.printf("Ket quả la: %d\n", modulusResult);
			// Chú ý ko dùng lệnh println để thực hiện việc xuống dòng
			// ctrl + shift + f: căn chỉnh dòng lại hộ mình

		int counter = 0;
		System.out.println(counter);
		System.out.println(++counter); // tăng rồi mới in
		System.out.println(counter);
		System.out.println(counter -- );	// in xong rồi mới trừ
		System.out.println(counter);
		
		int x = 10;
		long y = 20l;
		long z = x + y; // ko thể dùng int đc 
		
		int c = 10;
		float d = 20.5f;
		float e = c * d;
		
		short f = 20;
		short g = 10;
		int h = f - g;
		
		short t = 20;
		float u = 10.05f;
		double i = 30.1;
		double o = t*u/i;

//	Assignment operators		
			//		a = b
			//		a += b
			//			Same as: a = a + b
			//		a -= b
			//			Same as: a = a - b
			//		a *= b
			//			Same as: a = a * b
			//		a /= b
			//			Same as: a = a / b
			//		a %= b
			//			Same as: a = a % b
		
		int number = 10;
		System.out.println("number: " + number);
		number += 5;
		System.out.println("result += is: " + number);
		number -= 3;
		System.out.println("result -= is: " + number);
		number *= 2;
		System.out.println("result *= is: " + number);
		number /= 3;
		System.out.println("result /= is: " + number);
		number %= 5;
		System.out.println("result %= is: " + number);
		
// Comparison operators
		int j = 10;
		int k = 20;
		int l = 10;
		System.out.println(j == l);
		System.out.println(j != l);
		System.out.println(j < k);
		System.out.println(j <= k);
		System.out.println(j > k);
		System.out.println(j >= l);
	
// Logical operators
		//	&&		Returns true if both statements are true						a < 5 && b < 10
		//	||		Returns true if one of the statements is true					a < 5 || b < 4
		//	!		Reverse the result, returns false if the result is true			!(a < 5 && b < 10)

		int num = 10;
		boolean s = num > 5; // true
		boolean v = num > 10; // false

		System.out.println(s && v);
		System.out.println(s && true);
		System.out.println(s || v);
		System.out.println(s || false);
		System.out.println(v || false);
		System.out.println(!(s && v));

// Operator Precedence (Thứ tự ưu tiên) - Thường mình sẽ ko nhớ đống này nhg có thể để mọi thứ trong ngoặc tính theo quy tắc thường thấy trong tính toán
		
			//		Operator											Precedence
			//		
			//		postfix increment and decrement						++, --
			//
			//		prefix increment and decrement, and unary			++, -- , +, -, ~, !
			//
			//		multiplicative										*, /, %									
			//
			//		additive											+, -
			//
			//		shift												<< , >>, >>>
			
					
			//		Operator											Precedence
			//
			//		relational											<> <= >= instanceof
			//
			//		equality											== !=
			//
			//		bitwise AND											&
			//
			//		bitwise exclusive OR								^
			//
			//		bitwise inclusive OR								|
			//
			//		logical AND											&&
			//
			//		logical OR											||
			//
			//		ternary												?:
			//
			//		assignment											=, +=, -= , *= , /=, %=, &=, ^=, != , <<= , >>=, >>>=
			
					
			
					
			
					

		

		

		

		
		

		

		

		

		

		
		
	}
}
