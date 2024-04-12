/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.entities;

import java.util.Scanner;
import fa.training.utils.Validator;

public class Course {
	private String courseCode;
    private String courseName;
    private double duration;
    private String status;
    private String flag;

    public Course() {
        this.courseCode = "";
        this.courseName = "";
        this.duration = 0.0;
        this.status = "";
        this.flag = "";
    }

    public Course(String courseCode, String courseName, double duration, String status, String flag) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.duration = duration;
        this.status = status;
        this.flag = flag;
    }

// Getter - Setter
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    
// public void input()
    public void input() {
        Scanner input = new Scanner(System.in);
        	// Input course code
        System.out.print("Enter course code (FWXXX): ");
        String code = input.nextLine();
        while (!Validator.validateCourseCode(code)) {
            System.out.println("Invalid course code format! Please enter again.");
            code = input.nextLine();
        }
        this.courseCode = code;

        	// Input course name
        System.out.print("Enter course name: ");
        this.courseName = input.nextLine();

        	// Input duration
        System.out.print("Enter duration: ");
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input! Duration must be a number.");
            input.next();
        }
        this.duration = input.nextDouble();

        	// Input status
        System.out.print("Enter status (active/in-active): ");
        String status = input.next();
        while (!Validator.validateStatus(status)) {
            System.out.println("Invalid status! Please enter 'active' or 'in-active'.");
            status = input.next();
        }
        this.status = status;

        	// Input flag
        System.out.print("Enter flag (optional / mandatory / N/A): ");
        String flag = input.next();
        while (!Validator.validateFlag(flag)) {
            System.out.println("Invalid flag! Please enter 'optional', 'mandatory', or 'N/A'.");
            flag = input.next();
        }
        this.flag = flag;
    }

// Overriding toString()
    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
