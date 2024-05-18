/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package ahihihi;

import java.util.Scanner;

class myNode{
	// Thành phần dữ liệu
	int data;
		
	// Thành phần con trỏ
	myNode next;
}

public class Ex12 {
	
	public static void main(String[] args) {

		myNode head1 = null;
		myNode head2 = null;
		Scanner input = new Scanner(System.in);
		char isContinue;
		char addAt;     // Add vào đầu: H, add vào cuối là T

		// Input for first linked list
		do {
			System.out.print("Nhập vào giá trị của node cho danh sách liên kết thứ nhất: ");
			int data = input.nextInt();
			input.nextLine();
			System.out.print("Bạn muốn add vào đầu hay vào cuối (H/T)?");
			addAt = input.nextLine().charAt(0);
			// Tạo node
			myNode myNode = new myNode();
			myNode.data = data;
			myNode.next = null;
			
			// Gắn node vào list
			head1 = addNode(head1, myNode, addAt);
		
			printList(head1);
			
			System.out.print("Bạn có có muốn tiếp tục nhập hay không (Y/N)?");
			isContinue = input.nextLine().charAt(0);
		} while(isContinue == 'Y' || isContinue == 'y');

		// Input for second linked list
		do {
			System.out.print("Nhập vào giá trị của node cho danh sách liên kết thứ hai: ");
			int data = input.nextInt();
			input.nextLine();
			System.out.print("Bạn muốn add vào đầu hay vào cuối (H/T)?");
			addAt = input.nextLine().charAt(0);
			// Tạo node
			myNode myNode = new myNode();
			myNode.data = data;
			myNode.next = null;
			
			// Gắn node vào list
			head2 = addNode(head2, myNode, addAt);
		
			printList(head2);
			
			System.out.print("Bạn có có muốn tiếp tục nhập hay không (Y/N)?");
			isContinue = input.nextLine().charAt(0);
		} while(isContinue == 'Y' || isContinue == 'y');
		
		// Merge two linked lists
		myNode merge = mergeLists(head1, head2);
		System.out.println("Danh sách liên kết sau khi hợp nhất:");
		printList(merge);
	}
	
	public static myNode addNode(myNode head, myNode myNode, char addAt) {
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
		return head;
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
	
	public static myNode mergeLists(myNode head1, myNode head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		
		if (head1.data < head2.data) {
			head1.next = mergeLists(head1.next, head2);
			return head1;
		} else {
			head2.next = mergeLists(head1, head2.next);
			return head2;
		}
	}
}
