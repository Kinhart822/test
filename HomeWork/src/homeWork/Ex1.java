package homeWork;

/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

class MyStack {
    char[] character;
    int capacity;
    int top;

    public MyStack() {
    }

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.character = new char[capacity];
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
        character[top] = value;
    }

    public char pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("The stack is empty. Cannot pop new value");
        }
        char value = character[top];
        character[top] = 0;

        top -= 1;
        return value;
    }
}

public class Ex1 {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(20);
        myStack.push('E');
        myStack.push('A');
        myStack.push('S');
        char pop1 = myStack.pop();
        System.out.println("pop1: " + pop1);
        myStack.push('Y');
        char pop2 = myStack.pop();
        System.out.println("pop2: " + pop2);
        char pop3 = myStack.pop();
        System.out.println("pop3: " + pop3);
        myStack.push('Q');
        myStack.push('U');
        myStack.push('E');
        char pop4 = myStack.pop();
        System.out.println("pop4: " + pop4);
        char pop5 = myStack.pop();
        System.out.println("pop5: " + pop5);
        char pop6 = myStack.pop();
        System.out.println("pop6: " + pop6);
        myStack.push('S');
        myStack.push('T');
        char pop7 = myStack.pop();
        System.out.println("pop7: " + pop7);
        char pop8 = myStack.pop();
        System.out.println("pop8: " + pop8);
        myStack.push('I');
        myStack.push('O');
        char pop9 = myStack.pop();
        System.out.println("pop9: " + pop9);
        char pop10 = myStack.pop();
        System.out.println("pop10: " + pop10);
        myStack.push('N');
        char pop11 = myStack.pop();
        System.out.println("pop11: " + pop11);
    }
}


