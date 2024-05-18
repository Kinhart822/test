/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package exercise1;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;
        }

        double average = (double) sum / upperbound;
        
        System.out.println("Average of all " + upperbound + " first numbers: " + average);
	}

}
