/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session2;

public class DemoCircleLinkedList {
	public static void main(String[] args) {
		MyNode1 head = null; 
		
		MyNode1 first = new MyNode1(2);
		head = first;
		first.next = first;
		
		MyNode1 second = new MyNode1(4);
		second.next = first;
		first.next = second;
		
		MyNode1 third = new MyNode1(6);
		third.next = first;
		second.next = third;
		
		MyNode1 fourth = new MyNode1(8);
		fourth.next = first;
		third.next = fourth;
		
		// In data trong list
		MyNode1 temp = head;
		if (head == null) {
			System.out.print("nothing");
		} else if (head.next == head) {
			System.out.print("[data: " + head.data);
		} else {
			do {
				System.out.print("[data: " + temp.data + "] -> ");
				temp = temp.next;
			}while(temp != head);
			System.out.print("...");
		}
		

			
			
		
	}
}
