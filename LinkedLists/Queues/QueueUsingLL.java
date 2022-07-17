package Queues;

import LinkedList1.Node;

public class QueueUsingLL<T> {
	
	private Node<T> front1;
	private Node<T> rear;
	int size;
	
	private  QueueUsingLL() {
		front1=null;
		rear=null;
		size=0;

	}
	
	public int size () {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
		
	}
	
	public void enqueue(T elem) {
		Node <T>data=(Node<T>) elem;
		if (rear==null) {
			rear=data;
			front1=data;
		}
		else{rear.next=data;}
		rear=data;
		size++;
		
	}
	public T front() throws QueueEmptyExceptiom{
		if (front1==null){
           throw new QueueEmptyExceptiom();
        }
		
		return front1.data;
		
	}
	
	public T dequeue() throws QueueEmptyExceptiom {
		if (front1==null) {
			throw new QueueEmptyExceptiom();
		
		}
		T temp=front1.data;
		front1=front1.next;
		if(front1==null) {
			rear=null;
		}
		size--;
		return temp;
	}
	
}
