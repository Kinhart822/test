/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session3;

class MyNode{
	float data;
	MyNode next;
	
	public MyNode(){
		this.next = null;
	}
	
	public MyNode(float data) {
		this.data = data;
		this.next = null;
	}
}

class MyQueue{
	MyNode front;	// Đầu hàng
	MyNode rear;	// Cuối hàng
	// Do linked list không bao giờ đầy -> Không cần giưới hạn cho queue
	
	public MyQueue(){
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		if(this.front == null) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		// Linked list không bao giờ đầy
		return false;
	}
	
	public void enqueue(float value) throws Exception {
		// Tạo ra node
		if(isFull()) {
			throw new Exception("The queue is full. Can not enqueue new value ");
		}
		
		// Tạo ra node
		MyNode newNode = new MyNode(value);
		if (this.rear == null) {
			this.rear = newNode;
			this.front = newNode;
		} else {
			// Xếp vào cuố hàng
			this.rear.next = newNode;
			// Node mới trở thành node cuối
			this.rear = newNode;
		}
	}
	
	public float dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("The queue is empty. Nothing to dequeue!");
		}
		
		float value = this.front.data;
		this.front = this.front.next;
		// Nếu queue đã hết
		if(this.front == null) {
			this.rear = null;
		}
		return value;
	}
	
	public float peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("The queue is empty. Nothing to dequeue!");
		}
		
		float value = this.front.data;
		return value;
	}
	
}

public class DemoQueue {

	public static void main(String[] args) throws Exception {
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		float dequeue1 = myQueue.dequeue();
		System.out.println("dequeue1: " + dequeue1);
		float dequeue2 = myQueue.dequeue();
		System.out.println("dequeue2: " + dequeue2);
		
		myQueue.enqueue(3);
		float dequeue3 = myQueue.dequeue();
		System.out.println("dequeue3: " + dequeue3);




	}

}
