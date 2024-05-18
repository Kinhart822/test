/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session2;

public class MyNode1 {
	// Thành phần dữ liệu
	int data;

	// Thành phần con trỏ
	MyNode1 next;
	public MyNode1() {
		this.next = null;
	}	
	public MyNode1(int data) {
		this.data = data;
		this.next=null;
	}
}
