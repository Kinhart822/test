/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session7;

public class Student {
	// Attribute: thuộc tính
	String name;
	float mark;
	boolean isRetest;
	String gender;

	// Method: phương thức
	public void study() {
		System.out.print("The student is studying");
	}
	
	public float doExam(String courseName) {
		System.out.print("The student is doing the exam");
		return mark;
	}
	
	// Nếu ko viết hàm khởi tạo => java sẽ tự tạo cho chúng ta hàm khởi tạo không tham số
	public Student() {}
	// Nếu viết hàm khởi tạo => java sẽ không tạo hàm khởi tạo nữa => phải tự viết
	
	// Hàm khởi tạo: không chỉ định kết quả trả về (vì mặc định là dùng để tạo đối tượng)
	// Tên hàm: trùng với tên class
	public Student(String studentName, float studentMark, boolean studentRetest, String studentGender) {
		name = studentName;
		mark = studentMark;
		isRetest = studentRetest;
		gender = studentGender;
	}
	
	// Có thể có nhiều hàm khởi tạo khác nhau
	// Tên của tham số thường trùng tên attribute
	public Student(String studentName, float studentMark, boolean isRetest) {
		this.name = studentName;
		this.mark = studentMark;
		this.isRetest = isRetest;
	}
	public Student(String name) {
		this.name = name;
	}
}
	

// Có thể tạo thêm class trong cùng file
// Nhưng chỉ có 1 class là public
class Teacher{
	boolean isSmoker;
	int age;
	String name;
	float experience;
	String[] courses; // Array
}
