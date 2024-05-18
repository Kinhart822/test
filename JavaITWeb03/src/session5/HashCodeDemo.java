/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session5;

public class HashCodeDemo {

	public static void main(String[] args) {
	  Student student1 = new Student("1");
//      Student student1 = new Student("1", "Nguyễn Đình Phong");
      Student student2 = new Student("2");
//      Student student2 = new Student("2", "Nguyễn Đình Phong");
      System.out.println(student1.hashCode());
      System.out.println(student2.hashCode());
  }
}
