/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int num1 = input.nextInt();
        System.out.print("Input second integer: ");
        int num2 = input.nextInt();
        
        if (num1 < num2) {
        	System.out.println(num1 + "!=" + num2);
        	System.out.println(num1 + "<" + num2);
        	System.out.println(num1 + "<=" + num2);
		} else if (num1 > num2){
        	System.out.println(num1 + "!=" + num2);
        	System.out.println(num1 + ">" + num2);
        	System.out.println(num1 + ">=" + num2);
		} else {
        	System.out.println(num1 + "=" + num2);
		}
	}
}
