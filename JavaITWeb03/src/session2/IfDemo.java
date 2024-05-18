/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session2;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 7;
        int dayOfWeek = 6;
        if(hour == 7 && (2 <= dayOfWeek && 6 >= dayOfWeek)) {
            System.out.println("Thức dậy đi làm");
        } else {
            System.out.println("Ngủ");
        }

        int a = 10;
        int b = 5;
        if(a==b) {
            System.out.println("Số A bằng số B");
        } else if(a>b) {
            System.out.println("Số A lơn hơn số B");
        } else {
            System.out.println("Số A nhỏ hơn số B");
        }

        int day=5;
        if(day == 2) {
            System.out.println("monday");
        } else if(day==2) {
            System.out.println("tuesday");
        } else if(day==4) {
            System.out.println("tuesday");
        }  else if(day==5) {
            System.out.println("tuesday");
        } else if(day==6) {
            System.out.println("tuesday");
        } else if(day==7) {
            System.out.println("tuesday");
        } else if(day==8) {
            System.out.println("tuesday");
        } else {
            System.out.println("day is invalid");
        }

        switch (day) {
            case 2 : {
                System.out.println("monday");
                break;
            }
            case 3 : {
                System.out.println("Tuesday");
                break;
            }
            case 4 : {
                System.out.println("monday");
                break;
            }
            case 5 : {
                System.out.println("monday");
                break;
            }
            case 6 : {
                System.out.println("monday");
                break;
            }
            case 7 : {
                System.out.println("monday");
                break;
            }
            case 8 : {
                System.out.println("Tanery");
                break;
            }
            default: {
                //else
                System.out.println("day is invalid");
            }


        }

        System.out.println("Done!");

	}

}
