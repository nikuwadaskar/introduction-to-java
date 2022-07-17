package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		 Queue<Integer> queue =new LinkedList<Integer>();
	       Stack<Integer> stack = new Stack<>();
			while (!queue.isEmpty()) {
				stack.add(queue.peek());
				queue.remove();
			}
			while (!stack.isEmpty()) {
				queue.add(stack.peek());
				stack.pop();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
