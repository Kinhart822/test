/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session5;

public class DemoForLoop {

	public static void main(String[] args) {
		
// for(a;b;c)		 
//		a: có thể có 1 hoặc nhiều hoặc không có câu lệnh;
//		b: có thể có nhiều biểu thức logic nhưng phải liên kết các biểu thức logic bằng &&, or, có thể bỏ trống;
//		c tương tự a
		
		//Vòng lặp in các số
		for(int i = 0; i < 5; i++) {
			 System.out.print(i + " " );
		}
		
		// Câu lệnh tiếp theo
		System.out.println();	
		// Khai báo biến tổng ngoài vòng lặp
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i + " " );
			System.out.println("Sum = " + sum);
		}
		// Đợi tính xong tổng bằng vòng lặp rồi mới in kết quả
			//		System.out.println("Sum = " + sum);

		// Tính tổng: S = 1/2 + 1/3 + ... + 1/100
		System.out.println();	
		// Khai báo biến tổng ngoài vòng lặp
		float S = 0;
		for (int i = 2; i <= 10; i++) {
			// Thường là int i = 2 thay vì float
			S += 1/(float)i;
			// Cách khác: S += 1f/i;
		}
		System.out.println("Sum = " + S);

		
		// Tính tổng: S = 1/3 + 1/5 + ... + 1/101
		System.out.println();	
		float S1 = 0;
		for (int n = 1; n <= 50; n++) {
		    float i = 2*n + 1;
		    S1 += 1/i;
		}
	    System.out.println("Sum = " + S1);
//	    Cách khác:
//	    System.out.println();	
//		float S1 = 0;
//		for (int n = 1; n <= 101; n +=2) {
//		    S1 += 1/n;
//		}
//	    System.out.println("Sum = " + S1);
	    
		// Tính tổng: S = 1/2 + 2/3 + ... + 99/100
	    System.out.println();	
		float S2 = 0;
		for (int n = 1; n <= 99; n++) {
		    float i = (float)n/(n + 1);
		    S2 += i;
		}
		System.out.println("Sum = " + S2);
		
		// Tính tổng S = 1/2 - 1/3 + ... + 1/98 - 1/99
		System.out.println();	
		float S3 = 0;
		for (int n = 2; n <= 99; n++) {
			if (n % 2 == 0) {
		        S3 += 1.0f / n;
		    } else {
		        S3 -= 1.0f / n;
		    }
		}
		System.out.println("Sum = " + S3);
			// Cách khác:
		float s4 = 0;
		for (int i=2, j=3; i <= 98; i +=2 ,j += 2) {
			s4 +=(1f/i)-(1f/j);
		}
		System.out.println("S4 = " + s4);
		}
	}

