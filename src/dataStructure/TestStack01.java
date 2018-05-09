package dataStructure;

import java.util.Stack;

public class TestStack01 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.push(100);
		System.out.println(stack);
		System.out.println("search 0 :" + stack.search(0));
		System.out.println("search 100 :" + stack.search(100));
	}
	
	
}
