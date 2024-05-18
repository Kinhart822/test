/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session03;

import java.util.Scanner;

public class DemoFunction {

	public static void main(String[] args) {
		// Lời gọi hàm là 1 câu lệnh
		// Dùng tên hàm, truyền tham số, nhận kết quả
		int sum = getSumOfTwoNumber(1,2);
		int sum2;
		sum2 = getSumOfTwoNumber(6,10);
		
		// Thừa
		System.out.println("Sum2= " + getSumOfTwoNumber(6,10));
		
		// Thừa
		getSumOfTwoNumber(3,4);
		int sum3 = getSumOfTwoNumber(3,4);
				
		// Chúng ta cũng có thể truyền biến vào cho hàm
		int x;
		int y;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat: ");
		x = input.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		y = input.nextInt();
		int sum4 = getSumOfTwoNumber(x,y);
		System.out.printf("Tong cua %d va %d duoc tich boi ham la %d", x, y, sum4);

		
		System.out.println(getRandom());
		
		int myMoney;
		System.out.println("Nhap vao: ");
		myMoney = input.nextInt();
		float total = getInterest(myMoney);
        System.out.println("So tien sau khi tinh lai: " + total);
        float total2 = getInterest2(myMoney);
        System.out.println("So tien sau khi tinh lai: " + total2);
	

        float myMoney1 = 10000.0f;
        printNumber(myMoney1);

  	}
	
// Cấu trúc khi viết một hàm:
	//			static returnType functionName(parameters) {
	//				// function body
	//			}
// Ý nghĩa:
	//		static:        Use the static keyword, it can be accessed without creating objects.
	//		returnType:    It specifies what type of value a function returns. If the function does not return a value, its return type is void.
	//		functionName:  It is an identifier that is used to refer to the particular function in a program.
	//		parameters:    These are values passed to a function. We can pass any number of arguments to a function.
	//		function body: It includes the programming statements that are used to perform some tasks. The function body is enclosed inside the curly braces { }.


	
	
	
	
	// Hàm tính tổng 2 số
	static int getSumOfTwoNumber(int a, int b) {
		//Tính tổng 2 số
		int sum = a + b;
		// Trả lại kết quả
		return sum;
	}	
	
	// Trường hợp không có tham số
	static int getRandom() {
		return 5;
	}
	
	// Trường hợp có 1 tham số
	static float getInterest(float myMoney) {
		float interest = myMoney * 0.05f;
		return myMoney + interest;
	}
	
	// Nếu có 2 hoặc nhiều hơn các tham số
	// Các tham số cách nhau bởi dấu ","
	
	// Nếu giá trị trả về là kiểu dữ liệu thông thường 
	//	-> dùng kiểu dữ liệu
	//	-> dùng từ khóa return để trả về dữ liệu
	
	// Cách viết sai: 
			//	static float getSomething() {
			//		return true;
			//	}
	
	// Trường hợp có nhiều khả năng trả về
	// -> có thể dùng nhiều từ khóa return
	
	static float getInterest2(float myMoney) {
		if(myMoney < 1_000_000) {
			float interest = myMoney *0.05f;
			return myMoney + interest;
		}
		if(myMoney < 10_000_000) {
			float interest = myMoney *0.07f;
			return myMoney + interest;
		}
		if(myMoney < 100_000_000) {
			float interest = myMoney *0.1f;
			return myMoney + interest;
		}
		if(myMoney < 1_000_000_000) {
			float interest = myMoney *0.12f;
			return myMoney + interest;
		}
		float interest = myMoney *0.12f;
		return myMoney + interest;
		
	}
	
	// Nếu muốn trả về nhiều giá trị -> Học các bài sau
	// Nếu ko muốn trả về giá trị thì sử dụng từ khóa void cho returnType
	static void printNumber(float myMoney1) {
		System.out.print("My money is: " + myMoney1);
		float interest = myMoney1 * 0.07f;
		System.out.print("My money is: " + interest);
		
		// Không bắt buộc phải có từ khóa return
		// Vẫn có thể có, nếu có, thì sẽ viết
		return;
		// Không thể viết code sau return
		
	}
	//
}
