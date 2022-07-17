package Queues;

import java.util.Stack;

public class QueueUsing2Stacks<T> {
	
	Stack<T> s1;
	Stack<T> s2;
	int size;
	T front;

	
	
	public QueueUsing2Stacks() {
		s1=new Stack <>();
		s2=new Stack<>();
		
	}
	public int size () {
		return s1.size();
	}
	
	 public boolean isEmpty() { 
		 
		 return size==0;
	 }
	public void enqueue(T elem) {
		if (s1.size()==0) {
			s1.push(elem);
			front=elem;
		}
		
		s1.push(elem);
		
	}
	
	public T front() throws QueueEmptyExceptiom{
		if (s1.size()==0) {
			throw new QueueEmptyExceptiom();
		}
		return front;
		
	}
	public T dequeue() throws QueueEmptyExceptiom {
		for (int i =0;i<s1.size();i++) {
			s2.push(s1.pop());
		}
		T temp=s2.pop();
		for (int i =0;i<s2.size();i++) {
			s1.push(s2.pop());
		}
		return temp;
	}

}
