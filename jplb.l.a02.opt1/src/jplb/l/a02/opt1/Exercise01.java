/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a02.opt1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int centuries;
		System.out.print("Hay nhap so");
		centuries = input.nextInt();
		
		long years = centuries * 100;
        long days = years * 365;
        long hours = days * 24;
        long minutes = hours * 60;
        long seconds = minutes * 60;
        long milliseconds = seconds * 1000;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes = %d seconds = %d milliseconds\n",
        		centuries, years, days, hours, minutes, seconds, milliseconds);      
	}

}
