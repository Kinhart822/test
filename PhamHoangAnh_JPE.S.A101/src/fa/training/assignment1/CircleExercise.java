/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.assignment1;

import java.util.Scanner;

public class CircleExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Radius = ");
        double radius = input.nextDouble();
        
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        
        input.close();
	}

}
