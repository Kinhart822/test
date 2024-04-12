/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.main;

import fa.training.entities.Course;
import java.util.Scanner;

public class CourseManagement {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course[] courses = new Course[10];

// Input data for courses
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Enter details for course " + (i + 1));
            Course course = new Course();
            course.input();
            courses[i] = course;
        }
        
// Search for a course
        System.out.println("--Search for a course--");
        System.out.print("Enter the attribute name to search (courseCode, courseName, duration, status, flag): ");
        String attribute = input.next();
        System.out.print("Enter the value to search for: ");
        String value = input.next();

        boolean found = false;
		for (Course course : courses) {
            if (course == null) continue; // Skip null entries in the array
            switch (attribute) {
                case "courseCode":
                    if (course.getCourseCode().equals(value)) {
                        System.out.println(course);
                        found = true;
                    }
                    break;
                case "courseName":
                    if (course.getCourseName().equals(value)) {
                        System.out.println(course);
                        found = true;
                    }
                    break;
                case "duration":
                    if (String.valueOf(course.getDuration()).equals(value)) {
                        System.out.println(course);
                        found = true;
                    }
                    break;
                case "status":
                    if (course.getStatus().equals(value)) {
                        System.out.println(course);
                        found = true;
                    }
                    break;
                case "flag":
                    if (course.getFlag().equals(value)) {
                        System.out.println(course);
                        found = true;
                    }
                    break;
                default:
                    System.out.println("Invalid attribute name!");
                    return;
            }
        }
        if (!found) {
            System.out.println("Course not found with the given attribute and value.");
        }
        
// Display all courses with flag "mandatory"
        System.out.println("Courses with flag 'mandatory':");
        for (Course course : courses) {
            if (course.getFlag().equals("mandatory")) {
                System.out.println(course);
            }
        }
    }
	
}
	

