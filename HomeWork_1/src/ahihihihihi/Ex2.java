/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihihihi;

import java.util.Scanner;

// Khai báo 
class Course {
    int courseId;
    String courseName;
    int duration;
    String description;

    public Course(int courseId, String courseName, int duration, String description) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.description = description;
    }
}

//	Singly LinkedList
class Node {
    Course data;
    Node next;

    public Node(Course data) {
        this.data = data;
        this.next = null;
    }
}

class courseManagement {
    Node head;

    public courseManagement() {
        this.head = null;
    }

    // Code that allow the user enters course information
    public void addCourse() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Course ID: ");
        int courseId = input.nextInt();

        System.out.print("Enter Course Name: ");
        String courseName = input.next();

        System.out.print("Enter Duration: ");
        int duration = input.nextInt();

        System.out.print("Enter Description: ");
        String description = input.next();

        Course newCourse = new Course(courseId, courseName, duration, description);
        Node newNode = new Node(newCourse);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        System.out.println("Course have been added! \n");
    }

    // Code that allow the user search course by name.
    public void searchCourseByName(String name) {
        Node temp = head;

        boolean hasFound = false;
        while (temp != null) {
            if (temp.data.courseName.equals(name)) {
                System.out.println("The result of searching : " + temp.data.courseName);
                hasFound = true;
                break;
            }
            temp = temp.next;
        }

        if (!hasFound) {
            System.out.println("The course do not exist in the library");
        }    
    }

    // Code that allow the user sort the course duration by ascending.
    public void sortCoursesByDuration() {
        Node current = head, index = null;
        Course temp;

        if (head == null) {
            return; 
        } else {
	        while (current != null) {
	            index = current.next;
	            while (index != null) {
	                
	                if (current.data.duration > index.data.duration) {
	                    temp = current.data;
	                    current.data = index.data;
	                    index.data = temp;
	                }
	
	                index = index.next;
	            }
	            current = current.next;
	        }
	    }
    }
    
    // Code that display the information
    public void display(){
    	Node temp = head;
        
    	while (temp != null) {
    		System.out.println("Course ID: " + temp.data.courseId + ", Course Name: " + temp.data.courseName + ", Duration: " + temp.data.duration + ", Description: " + temp.data.description);
              temp = temp.next;
        }
    	
        System.out.println();
    }
 
}

// Main task
public class Ex2 {
    public static void main(String[] args) {
    	
        courseManagement courseManager = new courseManagement();
        Scanner input = new Scanner(System.in);

        // Code that allow user to choose one of these tasks that code above provides
        int choice;

        do {
            System.out.println("1. Add Course");
            System.out.println("2. Search Course by Name");
            System.out.println("3. Sort Courses by Duration");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    courseManager.addCourse();
                    break;
                case 2:
                    System.out.print("Enter Course Name to search: ");
                    String searchName = input.next();
                    courseManager.searchCourseByName(searchName);
                    break;
                case 3:
                	System.out.println("Courses duration (unsorted):");
                    courseManager.display();
                    courseManager.sortCoursesByDuration();
                    System.out.println("Courses sorted by duration in ascending order.");
                    courseManager.display();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        input.close();

    }
    
}


        