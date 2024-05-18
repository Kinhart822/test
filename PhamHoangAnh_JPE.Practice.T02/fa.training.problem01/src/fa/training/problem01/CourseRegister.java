/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.problem01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CourseRegister {
	
    public Map<String, Integer> countStudent(String filePath) {
    	filePath  = "D:\\Code\\fa.training.problem01\\src\\fa\\training\\problem01/course_register.txt";
        Map<String, Integer> courseCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arrOfStr = line.split("_");
                if (arrOfStr.length == 3) {
                    String course = arrOfStr[2];
                    courseCount.put(course, courseCount.getOrDefault(course, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseCount;
    }

    public static void main(String[] args) {
        CourseRegister cr = new CourseRegister();
        Map<String, Integer> result = cr.countStudent("course_register.txt");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "\n" + entry.getValue());
        }
    }


	
}
