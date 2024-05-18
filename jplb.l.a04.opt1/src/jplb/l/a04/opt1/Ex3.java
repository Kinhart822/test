/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a04.opt1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Number of classes held: ");
        int classesHeld = input.nextInt();

        System.out.print("Number of classes attended: ");
        int classesAttended = input.nextInt();

        double attendancePercentage = (double) classesAttended / classesHeld * 100;

        System.out.printf("Percentage of class attended: %.2f\n", attendancePercentage);

        if (attendancePercentage < 75) {
            System.out.println("Student is allowed to sit in exam: NO");
        } else {
            System.out.println("Student is allowed to sit in exam: YES");
        }
    }
}


