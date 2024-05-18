/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		System.out.print("Enter a number: ");
//      int n = input.nextInt();
       
//        for(int i=2;i<=n;i++){
//        	while(n % i == 0) {
//        		System.out.printf("%d", i);
//        		n = n/i;
//        		if (n >= i) {
//        			System.out.print(" * ");
//        		}
//        	}      	
//        
//        }
        
		System.out.print("Enter a number: ");
		long number = input.nextLong();
        boolean isFirst = true;
        long i = 2;
		System.out.print(number + " = ");
        while (number > 1) {
        	if (number % i ==0) {
        		if(isFirst) {
            		System.out.print(i);
            		isFirst = false;
        		} else {
            		System.out.print("*" + i);
        		}
        		number = number / i;
        	} else {
        		i += 1; 
        	}
        }
        
	}
}
