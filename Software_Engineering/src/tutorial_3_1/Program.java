/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package tutorial_3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Person a = new Person(1, "A");
		Person b = new Person(2, "B");
		Person c = new Person(3, "C");
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(a);
		persons.add(b);
		persons.add(c);
		
		System.out.print(persons);
		
		// Sort 
		Collections.sort(persons);
		System.out.println(persons);


	}

}
