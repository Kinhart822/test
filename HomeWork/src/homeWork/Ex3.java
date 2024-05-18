/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package homeWork;

class MyNode{
	char data;
	MyNode next;
	
	public MyNode(){
		this.next = null;
	}
	
	public MyNode(char data) {
		this.data = data;
		this.next = null;
	}
}

class MyQueue{
	MyNode front;	
	MyNode rear;	
	
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
		return false;
	}
	
	public void enqueue(char value) throws Exception {
		if(isFull()) {
			throw new Exception("The queue is full. Can not enqueue new value ");
		}
		
		MyNode newNode = new MyNode(value);
		if (this.rear == null) {
			this.rear = newNode;
			this.front = newNode;
		} else {
			this.rear.next = newNode;
			this.rear = newNode;
		}
	}
	
	public char dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("The queue is empty. Nothing to dequeue!");
		}
		
		char value = this.front.data;
		this.front = this.front.next;
		// Nếu queue đã hết
		if(this.front == null) {
			this.rear = null;
		}
		return value;
	}
		
}
public class Ex3 {

	public static void main(String[] args) throws Exception {
        MyQueue myQueue = new MyQueue();

        myQueue.enqueue('E');   
        myQueue.enqueue('A');   
        myQueue.enqueue('S');   
        System.out.println(myQueue.dequeue());   
        System.out.println(myQueue.dequeue());   

        myQueue.enqueue('Y');   
        System.out.println(myQueue.dequeue());   
        System.out.println(myQueue.dequeue());   

        myQueue.enqueue('Q');   
        myQueue.enqueue('U');   
        myQueue.enqueue('E');   
        System.out.println(myQueue.dequeue());   
        System.out.println(myQueue.dequeue());   
        System.out.println(myQueue.dequeue());  

        myQueue.enqueue('S');   
        myQueue.enqueue('T');   
        System.out.println(myQueue.dequeue());   
        System.out.println(myQueue.dequeue());  

        myQueue.enqueue('I');   
        myQueue.enqueue('O');   
        System.out.println(myQueue.dequeue());   
        System.out.println(myQueue.dequeue());   

        myQueue.enqueue('N');  
        System.out.println(myQueue.dequeue());   
    }
}
