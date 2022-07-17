package Queues;

import Stack.StacksUsingLL;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingArrays Queue = new QueueUsingArrays ();
		int arr[]= {10,2,3,4};
		for (int elem: arr) {

			Queue.enQueue(elem);

		}
		//		System.out.println(Queue.size());
		//		Queue.enQueue(12);
		//		Queue.enQueue(1);
		//		Queue.enQueue(2);
		//		System.out.println(Queue.front());
		//		System.out.println(Queue.deQueue());
		//		System.out.println(Queue.rear());


	}
}


