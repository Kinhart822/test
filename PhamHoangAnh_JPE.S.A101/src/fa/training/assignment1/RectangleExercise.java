/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.assignment1;

import java.util.Scanner;

public class RectangleExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Width = ");
        double width = input.nextDouble();
        System.out.print("Height = ");
        double height = input.nextDouble();
        
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
        
        input.close();
	}

}
