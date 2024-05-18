/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session2;

import java.util.Scanner;

public class InputLinkedList {

	public static void main(String[] args) {
		// Nhập vào linked list từ bàn phím
		myNode head = null;
		Scanner input = new Scanner(System.in);
		char isContinue;
		char addAt;     // Add vào đầu: H, add vào cuối là T
		do {
			System.out.print("Nhập vào giá trị của node: ");
			int data = input.nextInt();
			input.nextLine();
			System.out.print("Bạn muốn add vào đầu hay vào cuối (H/T)?");
			addAt = input.nextLine().charAt(0);
			// Tạo node
			myNode myNode = new myNode();
			myNode.data = data;
			myNode.next = null;
			
			// Gắn node vào list
			if (head == null) {
				head = myNode;
			} else {
				if(addAt == 'M'){
					// add vào đầu
					myNode.next = head;
					head = myNode;
				} else {
					// add vào cuối
					myNode temp = head;
					// Tìm đến node cuối
					while (temp.next != null) {
						temp = temp.next;
					}	// temp đang trỏ đến node cuối
					
					temp.next = myNode;
				}
				
			}
		
			printList(head);
			
			System.out.print("Bạn có có muốn tiếp tục nhập hay không (Y/N)?");
			isContinue = input.nextLine().charAt(0);
		} while(isContinue == 'Y' || isContinue == 'y');

	}
	public static void printList(myNode head) {
		myNode temp = head;
		System.out.print("head -> ");
		while(temp != null) {
			System.out.print("[data: " + temp.data + "] -> ");
			temp = temp.next;
		}
		System.out.println("null");
		
	}

}
