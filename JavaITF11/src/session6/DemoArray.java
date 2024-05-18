/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session6;

public class DemoArray {

	public static void main(String[] args) {
		// Khai báo array
		int[] array = new int[10];
		// Khai báo array để chứa điểm môn Java của lớp ITF11
		float[] javaFinalMark = new float[14];
		
		char[] englishLetters = new char[26];
		
		// 1. Declare an array and initialize values
		int[] numbers01 = new int[] {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		
		byte[] playerNumber = new byte[] {1,3,4,5,6,10,12,15};

		// 2. This approach is called an anonymous array.
		// It is anonymous because you don’t specify the type and size
		int[] numbers02 = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};

		byte[] playerNumber2 = {1,3,4,5,6,10,12,15};
		
		byte[] Employees = {1,2,4,6,10,12,14};

		//		playerNumber = 3; 
		//		Sử dụng index để thao tác với thành phần bên trong array
		playerNumber[0] = 16; 
		javaFinalMark[0] = 9;
		javaFinalMark[1] = 8.5f;
		javaFinalMark[2] = 4.9f;
		javaFinalMark[3] = javaFinalMark[2] + 2;  // 4.9 + 2
		javaFinalMark[4] = 9;
		javaFinalMark[5] = javaFinalMark[0];
		javaFinalMark[6] = javaFinalMark[0] + javaFinalMark[2];
		javaFinalMark[2] += 4;
		
		// 		Lưu ý: index từ 0 đến length - 1
		// 		Nếu các bạn sử dụng index < 0 hoặc >= length => lỗi: truy cập ngoài mảng
		//		javaFinalMark[-1] = 3;
		//		javaFinalMark[14] = 3;
		
		for (int i = 0; i < javaFinalMark.length; i++) {
			 System.out.println(javaFinalMark[i]);
			 
		//		Sử dụng 
		for (float value : javaFinalMark) {
			 System.out.print(value);
		}
			}





		
	}

}
