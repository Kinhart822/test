/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session4;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Tôi thấy hoa vàng trên     cỏ xanh";
		
		// chỉ tính chữ ko tính space các chữ
		String[] terms = text.split("\\s+");
		System.out.print(terms.length);
	}

}
