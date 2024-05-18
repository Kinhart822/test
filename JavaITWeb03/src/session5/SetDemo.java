/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("Nhung");
        set.add("Nam");
        set.add("Tùng");
        set.add("Nhung");
		
		Set<String> set2 = new HashSet<>(set);
		List<String> list2 = new ArrayList<>(set);
		System.out.println(set2);

		list2.add("Nhung");
		System.out.println(list2);

	}

}
