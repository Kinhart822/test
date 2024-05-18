/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session4;

import java.util.Scanner;

public class ClearBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so thu nhat: ");
		int firstNumber = input.nextInt();
		System.out.print("Nhap so thu hai: ");
		int secondNumber = input.nextInt();
		// xóa bộ đệm
		input.nextLine();
// Mục tiêu : xóa bỏ enter khi nhập vào giá trị tại enter được coi là 1 giá trị nên nếu ko có dòng này, thì khi nhập 2 cái trên xong nó sẽ tự động tiêu thụ ký tự xuống dòng còn lại từ lần nhập số và gán giá trị rỗng cho char
		System.out.print("Nhap phep toan: ");
		char operator = input.nextLine().charAt(0);
		System.out.printf("Phep toan la: %d %c %d ", firstNumber, operator, secondNumber );
//Khi bạn sau đó gọi input.nextLine();, phương thức này sẽ đọc tất cả các ký tự trong bộ đệm đầu vào cho đến khi gặp ký tự xuống dòng. Do đó, nếu bạn không gọi input.nextLine(); sau input.nextInt();, phương thức nextLine() tiếp theo sẽ chỉ tiêu thụ ký tự xuống dòng còn lại trong bộ đệm đầu vào và trả về một chuỗi rỗng.
//Vì vậy, input.nextLine(); được sử dụng để “dọn sạch” bộ đệm đầu vào và đảm bảo rằng phương thức nextLine() tiếp theo sẽ hoạt động như mong đợi2
	}

}
