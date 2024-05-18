/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session5;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new TreeSet<>();
		set.add(new Student("Văn"));
		set.add(new Student("Nam"));
		set.add(new Student("Tùng"));
		set.add(new Student("Anh"));
		set.add(null); // at java.base/java.util.Objects.requireNonNull(Objects.java:208)

		System.out.println(set);
	}

}
