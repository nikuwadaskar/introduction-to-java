package Queues;

public class QueueUsingArrays {


	private int data[];
	private int front;//index at the front of the queue
	private int rear;//index at the end of the queue
	private int size=0;

	public QueueUsingArrays() {
		data = new int[5];
		front=-1;
		rear=-1;
	}


	public QueueUsingArrays(int capacity) {
		data = new int[capacity];
		front=-1;
		rear=-1;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}

	public int front () throws QueueEmptyExceptiom {
		if (size ==0) {
			throw new QueueEmptyExceptiom();
		}
		else {
			return data[front];}

	}


	public int rear () throws QueueEmptyExceptiom {
		if (size ==0) {
			throw new QueueEmptyExceptiom();
		}
		else {
			return data[rear];}

	}


	public void enQueue(int elem)  {
		if (size==data.length) {
//			throw new QueueEmptyExceptiom();
			doubeleCapacity();
		}
		if(size==0) {
			front=0;
		}
		//		rear++;
		//		if (rear==data.length) {
		//			rear=0;
		//		}

		rear=(rear+1)%data.length;

		data[rear]=elem;

		size++;
	}

	private void doubeleCapacity() {
		int temp[]=data;
		data = new int[2*temp.length];
		int Index=0;
		for (int i=front;i<temp.length;i++) {
			data[Index++]=temp[i];
		}
		for (int i=0;i<front-1;i++) {
			data[Index++]=temp[i];
		}
		front =0;
		rear=temp.length-1;
	}


	public int deQueue() throws QueueEmptyExceptiom {
		if (size==0|| front ==-1) {
			throw new QueueEmptyExceptiom();
		}
		int temp=data[front];
		//		front++;
		//		if(front==data.length) {
		//			front=0;
		//		}

		front=(front+1)%data.length;
		size--;
		if (size==0) {
			front=-1;
			size=-1;
		}
		return temp;
	}

}
