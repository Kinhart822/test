/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session3;

public class DemoRecursive {
//	- Hàm đệ quy là vòng lặp và nó chạy với chính nó
//  - So với hàm đệ quy tương đương vòng lặp phát sinh 2 vấn đề:
//		+ Tốn tài nguyên, hơn nhiều so với vòng lặp => Ko có cách giải quyết or ko dùng hàm đệ quy nữa
//		+ Over stack, dễ bị lặp vô hạn (dễ bị hơn while) 
//			=> Cách giải quyết: luôn phải có điều kiện dừng (phải có ít nhất 1 nhánh cơ sở để khi đến 1 lúc nào đó chúng ta dừng lại) và phải làm xu hướng code đén gần đến nhánh cơ sở
	
	public static int sum(int number){
		System.out.println("Begin of function with number = " + number);
		if (number != 0) {
//			return number + sum(number -1);
			int result = number + sum(number -1);
			System.out.println("End of function with number = " + number);
		} 
		
		System.out.println("End of function with number = " + number);
		return number;
	}

	public static void main(String[] args) {
		int result = sum(10);
		System.out.print("Result: " + result);

	}

}
