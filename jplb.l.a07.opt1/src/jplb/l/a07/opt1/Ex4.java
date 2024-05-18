/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package jplb.l.a07.opt1;

public class Ex4 {

	public static void main(String[] args) {
        String str1 = "Fresher Academy";
        System.out.println(removeDuplicates(str1));

        String str2 = "FPT Software";
        System.out.println(removeDuplicates(str2));
    }

    public static String removeDuplicates(String str) {
        int index = 0;
        char[] resultStr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str.charAt(i) == resultStr[j]) {
                    break;
                }
            }
            if (j == i) {
                resultStr[index++] = str.charAt(i);
            }
        }
        return new String(resultStr, 0, index);
    }
    

}
