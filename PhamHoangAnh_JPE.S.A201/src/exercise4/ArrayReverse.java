/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = {"FTP", "Fresher", "Acedemy", "2018"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to search: ");
        String sValue = scanner.nextLine();
        
        boolean contains = Arrays.asList(stringArray).contains(sValue);
        
        if (contains) {
            System.out.println("Check '" + sValue + "' in Array: Contained!");
        } else {
            System.out.println("Check '" + sValue + "' in Array: Not Contained!");
        }
	}

}
