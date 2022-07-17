package Stack;

import LinkedList1.Node;

public class StacksUsingLL<T> {
	
	 private Node<T> head,head2;
	 private int size;
	 
	 public int size() {
		 
		 return size;
	 }
	 
	 public StacksUsingLL() {
		 head=null;
		 head2=null;
		 size=0;
	 }
	 
	 public boolean isEmpty() {
		 return size==0;
	 }

	 public void push (T elem) {
		Node<T>NNode=new Node<T>(elem);
	
		NNode.next=head;
		head=NNode;
		size++;
	 }
	 
	 
	 public  Node<T> top() throws StackEmptyExceptiom {
		 if (head==null) {
			 throw new StackEmptyExceptiom();
		 }
		 return (Node<T>) head.data;
	 }
	 
	 public T pop() throws StackEmptyExceptiom {
		 if (head==null) {
			 throw new StackEmptyExceptiom();
		 }
		 T temp= head.data;
		 head=head.next;
		 size--;
		return temp;
		
	 }
}
