/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session7;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
			student1.name = "Phạm Hoàng Anh";
			student1.mark = 10.5f;
			student1.gender = "Male";
			student1.isRetest = false;
			
		Student student2 = new Student();
			student2.name = "Nguyễn Việt Anh";
			student2.mark = 10.5f;
			student2.gender = "Male";
			student2.isRetest = false;
			
		Student student3 = new Student("Hoàng Anh", 17, false, "Male");	}
// private không áp dụng class chỉ áp dụng attribute
	
	

}
