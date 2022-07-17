package PriorityQueues1;

import java.util.ArrayList;

public class Priority_Queues <T> {

	private ArrayList<Element<T>> heap;

	public Priority_Queues() {
		heap = new ArrayList<>();
	}

	public void insert(T value,int priority) {
		Element<T> e = new Element<>(value, priority);
		heap.add(e);
		int childIndex= heap.size()-1;
		int parentIndex =(childIndex-1)/2;

		while (childIndex>0) {
			if (heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				Element<T> temp =heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex=parentIndex;
				parentIndex =(childIndex-1)/2;
			}else {
				return ;
			}
		}
	}

	public T getMin() throws PriorityQueuesException{
		if(isEmpty()) {
			throw new PriorityQueuesException();
		}
		return heap.get(0).value;
	}

	public T removeMin() throws PriorityQueuesException {
		if (isEmpty()) {
			throw new PriorityQueuesException();
		}

		Element<T>removed =heap.get(0);
		T ans = removed.value;

		heap.set(0, heap.get(size()-1));
		heap.remove(heap.size()-1);

		int parentIndex=0;
		int leftChildIndex=2*parentIndex+1;
		int rightchildIndex=2*parentIndex+2;

		while(leftChildIndex<heap.size()) {
			int minIndex=parentIndex;
			if (heap.get(leftChildIndex).priority<heap.get(minIndex).priority) {
				minIndex=leftChildIndex;
			}

			if (rightchildIndex<heap.size() && heap.get(rightchildIndex).priority<heap.get(minIndex).priority) {
				minIndex=rightchildIndex;
			}

			if (minIndex== parentIndex) {
				break;
			}
			
			Element<T> temp= heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			parentIndex=minIndex;
			leftChildIndex=2*parentIndex+1;
			rightchildIndex=2*parentIndex+2;
		}
		return ans;
	}

	public int size() {
		return heap.size();
	}
	public boolean isEmpty() {
		if (size()==0) {
			return true;
		}
		return false;
	}
}
