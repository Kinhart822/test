/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		// List<Integer> integers = new ArrayList<>();
		List listItems = new ArrayList<>();
		listItems.add(1);
		listItems.add(true);
		listItems.add("Huy");
		
		for (Object e: listItems) {
//			Double aDouble = (Double) e;
//			System.out.println(aDouble);
			System.out.println(e);
			
		}

		
		List<Integer> integers0ld = new ArrayList<>();
		integers0ld.add(10);
		integers0ld.add(8);
		
		
		List<Integer> integers = new ArrayList<>();
		integers.add(1);   	// index = 0
		integers.add(8);	// index = 1
		integers.add(4);	// index = 2
		integers.add(12);	// index = 3
		
		integers.add(2, 40);				// 1,8,40,4,12
					// index, element
		integers.addAll(integers0ld);		// 1,8,40,4,12,10,8
		
		integers.remove(3);					// 1,8,40,12,10,8
				// index

		integers.remove(new Integer(8));	// 1,40,12,10,8
				// value
	
	// Thay đổi giá trị
		integers.set(1, 20);
		System.out.println(integers);
		
		System.out.println("Elements index 4 = " + integers.get(4));
															// index

		
	}
	
}
