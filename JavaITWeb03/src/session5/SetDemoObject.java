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

public class SetDemoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Student> strSet = new HashSet<>();
	     strSet.add(new Student("Nhung"));
	     strSet.add(new Student("Nam"));
	     strSet.add(new Student("Tung"));
	     strSet.add(new Student("Nhung"));

	     Set<Student> strSet2 = new HashSet<>(strSet);
	     List<Student> list = new ArrayList<>(strSet);

	     System.out.println(strSet2);

	     list.add(new Student("Nhung"));
	     System.out.println(list);

	     for(Student run : strSet){
	    	 System.out.println(run);
	     }
//	     	Set<Student> set = new HashSet<>();
//	        Student studentNhung1 =new Student("Nhung");
//	        Student studentNhung2 =new Student("Nhung");
//	        System.out.println(studentNhung1);
//	        System.out.println(studentNhung2);
//
//	        set.add(studentNhung1); //com.fjw01.collections.Student@6d03e736
//	        set.add(new Student("Nam"));
//	        set.add(new Student("Tùng"));
//	        set.add(studentNhung2); //  com.fjw01.collections.Student@568db2f2
//
//	        Set<Student> set2 = new HashSet<>(set);
//	        List<Student> list2 = new ArrayList<>(set);
//	        System.out.println(set2);
//
//	        list2.add(new Student("Nhung"));
//	        System.out.println(list2);

	}

}
