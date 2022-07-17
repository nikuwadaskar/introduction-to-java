package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
	
	 public  Queue<Integer> q1;
	  public Queue<Integer> q2;
	  
	  public StackUsing2Queues() {
	        //Implement the Constructor
		  this.q1=new LinkedList<>();
		  this.q2=new LinkedList<>();
		  
	    }





	    public int getSize() { 
	        return this.q1.size();
	    }

	    public boolean isEmpty() {
	    	return this.q1.size()==0;

	    }

	    public void push(int element) {
	    	 q2.add(element);
	    }

	    public int pop() {
	    	if (this.isEmpty()) {
	    		return -1;
	    	}
	    	while (q1.size()>1) {
	    		q2.add(q1.poll());
	    	}
	    	int ans=q1.poll();
	    	Queue<Integer> temp=q1;
	    	q1=q2;
	    	q2=temp;
	    	return ans;
	    }

	    public int top() {
	    	if (this.isEmpty()) {
	    		return -1;
	    	}
	    	while (q1.size()>1){
	    		q2.add(q1.poll());
	    	}
	    	int ans =q1.poll();
	    	q2.add(ans);
	    	Queue<Integer>temp =q1;
	    	q1=q2;
	    	q2=temp;
	    	return ans;
	    }

}
