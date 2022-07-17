
package binaryTree;
import java.util.LinkedList;
public class BinaryTreeNode <T> {
	T data;
	BinaryTreeNode<T> left ;
	BinaryTreeNode<T> right ;

	public BinaryTreeNode(T data) {
		this.data=data;
	}
}


class Pair<T, U> {
	T minimum;
	U maximum;

	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}


class IsBSTReturn{
	int min;
	int max;
	boolean isBST;
	public IsBSTReturn(int  min, int max, boolean isBST) {
		this.max=max;
		this.min= min;
		this.isBST= isBST;
		// TODO Auto-generated constructor stub
	}
}



class PairOfNodeElem{
	LinkedList<Integer>head;
	LinkedList<Integer>tail;

}



class LinkedListNode<T> 
{ 
	T data; 
	LinkedListNode<T> next;
	public LinkedListNode(T data) 	
	{
		this.data = data; 
	}
}