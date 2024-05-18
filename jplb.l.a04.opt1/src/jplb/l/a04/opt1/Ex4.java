/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a04.opt1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hay nhap ngay vao: ");
        int day = input.nextInt();
        
        switch(day) {
        case 0:  
        	System.out.println("Sunday");
        	break;
        case 1:  
        	System.out.println("Monday");
        	break;
        case 2:  
        	System.out.println("Tuesday");
        	break;
        case 3:  
        	System.out.println("Wednesday");
        	break;
        case 4:  
        	System.out.println("Thusday");
        	break;
        case 5:  
        	System.out.println("Friday");
        	break;
        case 6:  
        	System.out.println("Saturday");
        	break;
        default:  
        	System.out.println("Invalid range number");
        	break;
        }
        
        switch(day) {
        case 0:
        case 6: {  
        	System.out.println("Weekend");
        	break;
        }
        case 1:  
        case 2:  
        case 3:  
        case 4:  
        case 5:  {
        	System.out.println("Workday");
        	break;
        }
        default:  
        	System.out.println("Invalid range number");
        	break;
        }

        
	}

}
