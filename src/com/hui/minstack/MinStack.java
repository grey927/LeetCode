package com.hui.minstack;

import java.util.Stack;


/**
 * Description:
 * 	Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * 		push(x) -- Push element x onto stack.
 * 		pop() -- Removes the element on top of the stack.
 * 		top() -- Get the top element.
 * 		getMin() -- Retrieve the minimum element in the stack.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class MinStack {

	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();

	public void push(int x) {
		if (minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		}
		stack.push(x);
	}

	public void pop() {
		if (stack.peek().equals(minStack.peek())) {
			minStack.pop();
		}
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
