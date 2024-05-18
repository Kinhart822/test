/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session3;

class MyStack{
	// Có thể dùng array or Linked List để triển khai stack
	// Thành phần data: số nguyên
	int[] array;	// Nơi lưu trữ dữ liệu của stack
	int capacity;	// Khả năng chứa tối đa của stack
	int top;		// Đánh dấu phần tử "trên cùng" của stack
	
	public MyStack() {}
	
	public MyStack(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.top = -1;
	}
	
	// Method isEmpty check is stack is empty
	public boolean isEmpty() {
		if(this.top == -1) {
			return true;
		} 
		return false;
	}
	
	// Method isFull to check is stack is full
	public boolean isFull() {
		if(this.top == capacity - 1) {
			return true;
		} 
		return false;
	}
	
	// Method push to add/push new value into the stack
	public void push(int value) throws Exception {
		// Nhớ kiểm tra xem stack có đầy không
		if(isFull()) {
			// Không thể push phần tử vào stack
			throw new Exception("The stack is full. Cannot push new value");
		}
		
		// Nếu stack chưa đầy, thực hiện add value vào top của stack
		// Nâng top lên 1 đơn vị
		top += 1;
		// Gắn giá trị mới ở vị trí của top
		array[top] = value;
	}
	
	// Method pop to remove/pop value from top of the stack
	public int pop() throws Exception  {
		// Kiểm tra xem stack có empty hay không
		if(isEmpty()) {
			// stack rỗng -> Không có phần tử để lấy
			throw new Exception("The stack is emty. Cannot pop new value");
		}
		
		// Nếu stack có phần tử
		int value = array[top];
		// Optional: xóa value khỏi stack
		array[top] = 0;
				
		// Hạ con trỏ top để trỏ xuống phần tử bên dưới
		top -= 1;
		return value;
	}
	
	// Method peek to get value from top of the stack, but, do not remove the value
		public int peek() throws Exception  {
			// Kiểm tra xem stack có empty hay không
			if(isEmpty()) {
				// stack rỗng -> Không có phần tử để lấy
				throw new Exception("The stack is emty. Cannot pop new value");
			}
			
			// Nếu stack có phần tử
			int value = array[top];
			return value;
		}
	
	
}
public class DemoStack {
	public static void main(String[] args) throws Exception {
		MyStack myStack = new MyStack(5);
		myStack.push(1);
		myStack.push(3);
		myStack.push(3);
		
		// Chú ý thứ tự thực hiện thao tác push và pop
		
		int pop1 = myStack.pop(); 		// 3, trong stack còn 1,2
		System.out.println("pop1: " + pop1);
		myStack.push(5);
		int pop2 = myStack.pop();		// 5, trong stack còn 1,2
		System.out.println("pop2: " + pop2);
		myStack.push(6);
		myStack.push(7);
		myStack.push(8);
		//		myStack.push(9);			// Lỗi, tràn stack
		int pop3 = myStack.pop(); 					// 8, trong stack còn 1,2,6,7
		System.out.println("pop3: " + pop3);
		int peek4 = myStack.peek(); 					// 7, trong stack còn 1,2,6,7
		System.out.println("peek4: " + peek4);

		
	}
}
