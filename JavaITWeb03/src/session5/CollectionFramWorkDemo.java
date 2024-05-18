/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session5;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionFramWorkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(8);
		integers.add(4);
		integers.add(12);
		
		System.out.println("Before: " + integers);
		
		Collections.sort(integers);
		System.out.println("After (sort): " + integers);
		
		Collections.reverse(integers);
		System.out.println("After (reverse): " + integers);



	}

}
