/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session4;

import java.util.Scanner;

public class DemoSwitchCase {

	public static void main(String[] args) {
		// Nhập vào 1 số là ngày trong tuần:
		// Quy ước: 0 là chủ nhật, 1 là thứ 2,...
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao ngay trong tuan: ");
		int day = input.nextInt();
		
		// In ra ngày trong tuần
		// 0 - Sunday
		// 1 - Monday
		// 2 - Tuesday ....
		
//		if (day == 0) {
//			System.out.print("Sunday");
//		} else if (day == 1) {
//			System.out.print("Monday");
//		} else if (day == 2) {
//			System.out.print("Tuesday");
//		} else if (day == 3) {
//			System.out.print("Wednesday");
//		} else if (day == 4) {
//			System.out.print("Thursday");
//		} else if (day == 5) {
//			System.out.print("Friday");
//		} else if (day == 6) {
//			System.out.print("Saturday");
//		} else {
//			System.out.print("Not a day of week");
//		}
		
		switch(day) {
		case 0:{
				System.out.println("Sunday");
				break;
		}
		case 1:{
			System.out.println("Monday");
			break;
		}
		case 2:{
			System.out.println("Tuesday");
			break;
		}
		case 3:{
			System.out.println("Wednesday");
			break;
		}
		case 4:{
			System.out.println("Thursday");
			break;
		}
		case 5:{
			System.out.println("Friday");
			break;
		}
		case 6:{
			System.out.println("Saturday");
			break;
		}
		default: {
			System.out.println("Not a day of week");
			break;
		}
		}
// If-else thì phải đi từ trên xuống dưới, quan trọng thứ tự sắp xếp
// Switch thì chỉ cần nhảy đến nơi mình muốn, ko quan trọng thứ tự sắp xếp
// nếu ko có break ở đoạn code trên thì nó sẽ in ra hết từ thứ 2 đến not a day of week
	
		// In ra ngày làm việc trong tuần
		// Group case
		switch(day) {
		case 0:
		case 6:{
			System.out.println("Weekend");
			break;
			}
		case 1: 
		case 2: 
		case 3:
		case 4:
		case 5:{
			System.out.println("Workday");
			break;
			}
		default: {
			System.out.print("Not a day of week");
			break;
			}
		}
	
	
	}

}
