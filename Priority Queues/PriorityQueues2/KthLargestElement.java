package PriorityQueues2;
import java.util.PriorityQueue;
public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public static int kthLargest(int n, int[] arr, int k) {
		// Write your code here
		if(arr.length==0)
			return Integer.MIN_VALUE;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++)
		{
			pq.add(arr[i]);
		}
		for(;i<arr.length;i++){
			int min=pq.element();//pq.peek;
			if(min<arr[i])
			{    pq.remove();
			pq.add(arr[i]);
			}
		}
		return pq.remove();
	}
}
