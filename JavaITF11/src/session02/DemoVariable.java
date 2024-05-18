/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session02;

public class DemoVariable {
//Constant
	// A constant is a variable whose value cannot change once it has been assigned.
	// A constant must be assigned a value when it is defined.
	// The name should be all capital letters with the words separated by underscores.

	static final float C = 299792458;

	public static void main(String[] args) {
// Cú pháp khai báo biến
		// Dân số của 1 quốc gia
		int population = 101123456;
		
		// Số lượt xem của 1 video trên youtube
		long numberViewOfYoutubeVideo =123456789L;
		
		// Số lượt xe đi qua trạm thu phí trong 1 ngày
		short numberOfVehicle = 12345 ;
		
		// Số môn thi lại của 1 sinh viên
		byte numberOfRetakeExam = 4;   // Chú ý tên biến phải là 1 danh từ thay vì động từ, tính từ
		
		// Quãng đường từ Cầu Giấy đến Bách Khoa (tính theo km)
		float distanceFromCauGiayToBackKhoa = 8.6f;
		
		// Điểm thi môn Java của sinh viên
		float javaFinalMark = 7.5f;		// Nếu ko có f thì nó sẽ hiểu như theo kiểu double vì thế dẫn đến không hợp lệ 
		
		// Số pi
			// double pi = 3.14159256539d;  (Nếu ko có d thì cx ko sao) 
		
		// Tình trạng cô đơn của 1 sinh viên
		boolean hasCouple = true;
		
		// Nhóm máu của 1 người
		String bloodType = "AB";
		
		// Đáp án 1 câu hỏi trắc nghiệm (single choice)
		char answer ='C';
		
		// Trường hợp dùng trg cái này
		final double PI = 3.14159265358979323846d; 
	

	}

}
