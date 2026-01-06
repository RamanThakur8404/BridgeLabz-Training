package com.datastructure.stackandqueue.queueusingstack;
import java.util.Stack;
public class QueueUsingStack {
	Stack<Integer>stackEnq = new Stack<>();
	Stack<Integer>stackDeq = new Stack<>();
	
	//enqueue operation
	void enqueue(int x) {
		stackEnq.push(x);
	}
	
	//dequeue operation 
	int dequeue() {
		if(stackDeq.isEmpty()) {
			while(!stackEnq.isEmpty()) {
				stackDeq.push(stackEnq.pop());
			}
		}
		if(stackDeq.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stackDeq.pop();
	}
		
	// display front element
	int peek() {
		if(stackDeq.isEmpty()) {
			while(!stackEnq.isEmpty()) {
				stackDeq.push(stackEnq.pop());
			}
		}
		return stackDeq.isEmpty() ? -1 : stackDeq.peek();
	}
}
