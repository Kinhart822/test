/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session2;

class NodeDouble{
	int data;
	
	NodeDouble next;
	NodeDouble prev;
	
	public NodeDouble() {
		this.next = null;
		this.prev = null;  	
	}
	public NodeDouble(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;  	
	}
}

public class DemoDoubleLinkedList {
	public static void main(String[] args) {
		NodeDouble head = null;
		
		// Tạo node đầu tiên
		NodeDouble first = new NodeDouble(5);
		
		// Gắn node đầu tiên
		head = first;
		
		// Tạo node thứ hai
		NodeDouble second = new NodeDouble(10);
		first.next = second;
		second.prev = first;
		
		// Tạo node thứ 3
		NodeDouble third = new NodeDouble(15);
		second.next = third;
		third.prev = second;
		
		// Tạo node thứ 4
		NodeDouble fourth = new NodeDouble(20);
		third.next = fourth;
		fourth.prev = third;
		
		// Thêm node mới vào đầu
		NodeDouble preNode = new NodeDouble(1);
		preNode.next = head;
		head.prev = preNode;
		head = preNode;
			
		// Add vào cuối
		NodeDouble postNode = new NodeDouble(25);
		NodeDouble temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}	// Nối node mới vào sau
		temp.next = postNode;
		postNode.prev = temp;
		
		// Add vào giữa
		NodeDouble middleNode = new NodeDouble(7);
		temp = head;
		temp = temp.next;
		
		NodeDouble temp2 = temp.next;
		
		middleNode.next = temp2;
		temp.next = middleNode;
		
		middleNode.prev = temp;
		temp2.prev = middleNode;
		
		// In Linked List
		temp = head;
		System.out.print("head -> ");
		while(temp != null) {
			System.out.print("[data: " + temp.data + "] -> ");
			temp = temp.next;
		}
		System.out.println("null");
		
		// In theo chiều ngược lại
		temp = head;
		// Di chuyển con trỏ đến cuối
		while(temp.next != null) {
			temp = temp.next;
		}
		// In ngược trở về
		System.out.print("null -> ");
		while(temp != null) {
			System.out.print("[data: " + temp.data + "] -> ");
			temp = temp.prev;
		}
		System.out.println("head");
	}
}
