/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.main;

import java.util.ArrayList;
import java.util.Scanner;
import fa.training.entities.Person;
import fa.training.entities.Student;
import fa.training.entities.Teacher;
import fa.training.utils.Validator;

public class PersonManage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// a. Input data from the keyboard: create an array of 10 Person of all types as mentioned above.
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter person type (1 for Student, 2 for Teacher):");
            int type = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.println("Enter full name:");
            String fullName = input.nextLine();
            System.out.println("Enter gender:");
            String gender = input.nextLine();
            System.out.println("Enter phone:");
            String phone = input.nextLine();
            System.out.println("Enter email:");
            String email = input.nextLine();
            if (!Validator.validateEmail(email)) {
                System.out.println("Invalid email format. Please enter a valid email.");
                continue;
            }
            if (type == 1) {
                System.out.println("Enter student ID:");
                String studentId = input.next();
                System.out.println("Enter theory mark:");
                double theory = input.nextDouble();
                if (!Validator.validateTheory(theory)) {
                    System.out.println("Invalid theory mark. Please enter a mark between 0 and 10.");
                    continue;
                }
                System.out.println("Enter practice mark:");
                double practice = input.nextDouble();
                if (!Validator.validatePractice(practice)) {
                    System.out.println("Invalid practice mark. Please enter a mark between 0 and 10.");
                    continue;
                }
                persons.add(new Student(fullName, gender, phone, email, studentId, theory, practice));
            } else if (type == 2) {
                System.out.println("Enter basic salary:");
                double basicSalary = input.nextDouble();
                System.out.println("Enter subsidy:");
                double subsidy = input.nextDouble();
                persons.add(new Teacher(fullName, gender, phone, email, basicSalary, subsidy));
            }
        }

// Input choice 
        int choice;
        do {
            System.out.println("Choose an action:");
            System.out.println("1. Update student");
            System.out.println("2. Display teachers with salary > $1000");
            System.out.println("3. Report: display students with final mark >= 6");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    updateStudent(persons, input);
                    break;
                case 2:
                    displayTeachers(persons);
                    break;
                case 3:
                    displayStudents(persons);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 0);
        
        input.close();
    }
    
// b. Update student: update student info by entering studentId.
    public static void updateStudent(ArrayList<Person> persons, Scanner input) {
        System.out.println("Enter student ID to update:");
        String studentIdToUpdate = input.next();
        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getStudentID().equals(studentIdToUpdate)) {
            // Update student info 
            // I want the code to be short, so I only updating the theory mark and the practice mark here
                    System.out.println("Enter new theory mark:");
                    double newTheory = input.nextDouble();
                    if (!Validator.validateTheory(newTheory)) {
                        System.out.println("Invalid theory mark. Please enter a mark between 0 and 10.");
                    }
                    student.setTheory(newTheory);
                    
                    System.out.println("Enter new practice mark:");
                    double newPractice = input.nextDouble();
                    if (!Validator.validateTheory(newPractice)) {
                        System.out.println("Invalid practice mark. Please enter a mark between 0 and 10.");
                        return;
                    }
                    student.setPractice(newPractice);
                    System.out.println("Student information updated successfully.");
                }
            }
        }
        System.out.println("Student ID not found.");
    }

// c. Display teacher: displays information about teachers, who has a salary higher than 1000$.
    public static void displayTeachers(ArrayList<Person> persons) {
        System.out.println("Teachers with salary > $1000:");
        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.calculateSalary() > 1000) {
                    System.out.println(teacher.getName() + " - Salary: $" + teacher.calculateSalary());
                }
            }
        }
    }

// d. Report: display all students and their final mark, who qualify to pass the course (final mark >= 6).
    public static void displayStudents(ArrayList<Person> persons) {
        System.out.println("Students with final mark >= 6:");
        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                double finalMark = student.calculateFinalMark();
                if (finalMark >= 6) {
                    System.out.println(student.getName() + " - Final Mark: " + finalMark);
                }
            }
        }
    }
}
