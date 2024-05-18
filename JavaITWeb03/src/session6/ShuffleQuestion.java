/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShuffleQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String > questionSort = new HashSet<>();
		questionSort.add("1 Question 1");
		questionSort.add("2 Question 2");
		questionSort.add("3 Question 3");
		questionSort.add("4 Question 4");
		questionSort.add("5 Question 5");
		questionSort.add("6 Question 6");
		questionSort.add("7 Question 7");
		
		List<String> questionList = new ArrayList<>(questionSort);
		
		Collections.shuffle(questionList);
		System.out.println(questionList);
	}

}
