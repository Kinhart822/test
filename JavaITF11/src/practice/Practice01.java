/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
        float x = input.nextFloat();
        System.out.print("Enter a number: ");
        float y = input.nextFloat();
        System.out.print("Enter a number: ");
        float z = input.nextFloat();
        
        if(x < 0 || y < 0 || z < 0 ) {
            System.out.println("Error");
            return;
        }
        
        if (x + y > z && x + z > y && y + z > x) {
			System.out.println("x, y, và z có thể là các cạnh của một tam giác");
			if(x == y && y == z) {
				System.out.println("Đây là một tam giác đều");
			} else if(x == y || y == z || z == x) {
            	if(x*x + y*y == z*z || x*x + z*z == y*y || y*y + z*z == x*x) {
					System.out.println("Đây là một tam giác vuông cân");
				} else {
                    System.out.println("Đây là một tam giác cân");
				}
            } else if(x*x + y*y == z*z || x*x + z*z == y*y || y*y + z*z == x*x) {
                System.out.println("Đây là một tam giác vuông");    
        
            } else if(x*x + y*y < z*z || x*x + z*z < y*y || y*y + z*z < x*x) {
                System.out.println("Đây là một tam giác tù");
            }else if(x*x + y*y > z*z || x*x + z*z > y*y || y*y + z*z > x*x) {
                System.out.println("Đây là một tam giác nhọn");
            } else {
                System.out.println("Đây là một tam giác thường");
            }
        } else {
			System.out.println("x, y, và z không thể là các cạnh của một tam giác");
		}
	}
}

