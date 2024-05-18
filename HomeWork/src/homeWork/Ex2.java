/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package homeWork;

class MyStack1 {
	 String[] string;
	 int capacity;
	 int top;

	 public MyStack1() {}

	 public MyStack1(int capacity) {
       this.capacity = capacity;
       this.string = new String[capacity];
       this.top = -1;
	 }

	 public boolean isEmpty() {
	 	if(this.top == -1) {
	 		return true;
		} 
 		return false;
	 	}
	 	
	 public boolean isFull() {
	 	if(this.top == capacity - 1) {
	 		return true;
	 	} 
	 	return false;
	 }

	 public void push(char value) throws Exception {
		if (isFull()) {
			throw new Exception("The stack is full. Cannot push new value");
	    }
	    top += 1;
	    string[top] = String.valueOf(value);
	 }

	 public String pop() throws Exception {
		 if (isEmpty()) {
			 throw new Exception("The stack is empty. Cannot pop new value");
	     }
	     String value = string[top];
	     string[top] = null;

	     top -= 1;
	     return value;
	    }
	}

public class Ex2 {
    public static void main(String[] args) throws Exception {
        String input = "FSOFT ACADEMY";
        MyStack1 MyStack1 = new MyStack1(input.length());

        for (int i = 0; i < input.length(); i++) {
            MyStack1.push(input.charAt(i));
        }

        while (!MyStack1.isEmpty()) {
            System.out.print(MyStack1.pop());
        }
    }
}
