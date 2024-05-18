/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a03.opt1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		double k;
		
		System.out.println("Nhap vao so thu nhat: ");
		x = input.nextDouble();
		System.out.println("Nhap vao so thu hai: ");
		y = input.nextDouble();
		System.out.println("Nhap vao so thu ba: ");
		z = input.nextDouble();
		System.out.println("Nhap vao so thu tu: ");
		k = input.nextDouble();
		double total = calculateSalary(x,y,z,k);
		System.out.printf("The total salary is: %.2f",total);
	}
	
	static double calculateSalary(double rate, double hoursWorking, double bonus, double fee) {
		return rate * hoursWorking + bonus - fee;
	}

}
