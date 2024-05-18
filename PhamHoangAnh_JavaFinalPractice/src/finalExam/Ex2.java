/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package finalExam;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a word (string) of length 0 < str < 1000 (Have no space in the string): ");
        String str = input.nextLine();
        do {
            if (str.length() <= 0 || str.length() >= 1000) {
                System.out.println("Invalid string. Please enter again!");
            } else if (str.contains(" ")) {
                System.out.println("Invalid string. Please enter again!");
            } else {
                break;
            }
        } while (true);
        System.out.print("The middle character in the string: " + middle(str)+"\n");
    }
	
	public static String middle(String str){
        int position;
        int length;
        if (str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }

}
	

