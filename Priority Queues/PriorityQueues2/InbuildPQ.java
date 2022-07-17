package PriorityQueues2;

import java.util.PriorityQueue;

public class InbuildPQ {
	
	
	
	
	public static void main(String[] args) {
		int arr[] = {4,7,3,2,8,9,6,11};
//		its by default min priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
//		System.out.println(pq.peek());
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.poll();
		}
		
	}
}
