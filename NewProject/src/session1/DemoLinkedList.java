/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session1;

class myNode{
	// Thành phần dữ liệu
	int data;
		
	// Thành phần con trỏ
	myNode next;
}


class myNode2{
	// Thành phần dữ liệu
	int data;
	String name;
	float salary;
	double price;

	// Thành phần con trỏ
	myNode2 next;

}

// Nếu có quá nhiều dữ liệu thì có thể tách thành class riêng
class myData{
	int data;
	String name;
	float salary;
	double price;
	// ...more
}


class myNode3{
	// Thành phần dữ liệu
	myData data;
	
	// Thành phần con trỏ 
	myNode3 next;
	
}

public class DemoLinkedList {
	public static void main(String[] args) {
		// Sử dụng Linked List
		
		// Khai báo linked list: Khai bào con trỏ head
		myNode head = null;

		// Tạo node đầu tiên
		myNode first = new myNode();
		first.data = 10;
		first.next = null;
		
		// Gắn vào list
		head = first;
		
		// Tạo node thứ 2
		myNode second = new myNode();
		second.data = 20;
		second.next = null;
		
		// Gắn node thứ 2 vào sau node thứ 1
		first.next = second;
		
		// Tạo node thứ 3
		myNode third = new myNode();
		third.data = 30;
		third.next = null;
				
		// Gắn node thứ 3 vào sau node thứ 2
		second.next = third;
		
		// Duyệt linked list: từ đầu đến cuối
		// Nguyên tắc: head ko bao h đc di chuyển (nếu không cho phép)
		// Dùng biến tạm để duyệt
		myNode temp = head;
		// Dấu hiệu kết thúc list là gì? null
		// số lượng phần tử là linh động, không bt trước -> while
		System.out.print("head -> ");
		while(temp != null) {
			System.out.print("[data: " + temp.data + "] -> ");
			// Thao tác trượt
			temp = temp.next;
			
		}
		System.out.println("null");
		
		// Thêm node mới vào đầu
		myNode preNode = new myNode();
		preNode.data = 3;
		preNode.next = null;
		
		// Thực hiện gắn vào đầu
		preNode.next = head;
		head = preNode;
		
		// in lại để kiểm tra
		temp = head;
		System.out.print("head -> ");
		while(temp != null) {
			System.out.print("[data: " + temp.data + "] -> ");
			temp = temp.next;
		}
		System.out.println("null");

		// Add vào cuối: tìm đến node cuối và nối node mới vào sau đó
		myNode postNode = new myNode();
		postNode.data = 99;
		postNode.next = null;
		// tìm đến node cuối: có next = null
		temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		// sau khi kết thúc vòng lặp, temp đang là đến node cuối
		// Nối node mới vào sau
		temp.next = postNode;

		// in lại để kiểm tra
		printList(head);
		
		// add vào giữa (sau node số 2)
		myNode midNode = new myNode();
		midNode.data = 15;
		midNode.next = null;
		// Tìm node số 2 
		temp = head; // node số 1
		temp = temp.next; //node số 2
		// Lưu ý: trường hợp node ở xa -> dùng vòng lặp
		midNode.next = temp.next;
		temp.next = midNode;
		
		// in lại để kiểm tra
		printList(head);
		
		// Xóa node đầu trong list
		head = head.next;
		// in lại để kiểm tra
		printList(head);
		
		// Xóa nốt cuối (list phải có nhiều hơn 2 nodes)
		temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}	// temp đang trỏ đến node gần cuối
		
		temp.next = null; 
		// in lại để kiểm tra
		printList(head);
		
		// Xóa ở giữa (xóa node số 3)
		// Đứng ở node trc (node số 2)
		temp = head;
		temp = temp.next; // Node số 2
		// Thực hiện xóa
		temp.next = temp.next.next;
		// in lại để kiểm tra
		printList(head);
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
