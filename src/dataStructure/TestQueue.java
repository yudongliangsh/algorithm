package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		System.out.println(queue.add("a"));
		System.out.println(queue.add("b"));
		System.out.println(queue);
		queue.add("c");
		System.out.println(queue.element());
		queue.offer("d");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
	}
	
}	
