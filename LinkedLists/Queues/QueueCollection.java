package Queues;
import java.util.Stack;
import java.util.LinkedList;

import java.util.Queue;



public class QueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Queue<Integer> queue =new LinkedList<Integer>();

//		queue.add(30);
//		queue.add(40);
//		queue.add(20);
//		System.out.println(queue.size());
//		System.out.println(queue.peek());
//		System.out.println(queue.poll());
		   Queue<Integer> q=new LinkedList<Integer>();
	        Stack<Integer> s=new Stack<Integer>();
	        q.add(5);
	        q.add(10);
	        s.push(10);
	        s.push(20);

	        System.out.print(q.peek()+s.pop());
	}

}
