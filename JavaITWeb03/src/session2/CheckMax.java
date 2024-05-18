/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session2;

public class CheckMax {

	public static void main(String[] args) {
		  int a = 10;
	        int b = 20;
	        int max = (a > b) ? logicTrue(a, "A") : logicTrue(b, "B");
	        System.out.println(max);
	        if (a > b) {
	            logicTrue(a, "A");
	        } else {
	            logicTrue(b, "B");
	        }

	    }

	    private static int logicTrue(int max, String label) {
	        System.out.println("Số max là " + label + ": " + max);
	        return max;
	    }

}
