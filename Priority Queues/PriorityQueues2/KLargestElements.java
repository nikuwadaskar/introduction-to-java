package PriorityQueues2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElements {

	public static void main(String[] args) {	

	}
	public static ArrayList<Integer> kLargest(int input[], int k)
	{
		ArrayList<Integer> ary=new ArrayList<>();
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		int i=0;
		for( ;i<k;i++){
			pq.add(input[i]);
		}
		for( ;i<input.length;i++){
			int min=pq.peek();
			if(min<input[i])
			{
				pq.remove();
				pq.add(input[i]);
			}
		}
		while(!pq.isEmpty())
		{
			ary.add(pq.poll());
		}
		return ary;
	}


}
