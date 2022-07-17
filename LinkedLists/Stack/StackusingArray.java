package Stack;

public class StackusingArray {
	
	private int data [];
	private int topIndex;//

	
	public StackusingArray() {
	data = new int [2];
	topIndex=-1;
	}
	
	
	public StackusingArray(int size) {
		data = new int [size];
		topIndex=-1;
		}
	
	//O(1);
	public int size() {
		return  topIndex+1;
	}
	
	//O(1);
	public boolean isEmpty(){
//		if(topIndex==-1) {
//			return true;
//		}else {return false;}
		return topIndex==-1;
	}
	
	
	//O(1);
	public void push(int elem)   {
		// if stack is full 
		if (topIndex==data.length-1) {
//			StackFullException e = new StackFullException();
//			throw e;
//			throw new StackFullException();
			doubeleCapacity();
		}
		data[++topIndex] = elem;//first give elem then add one 
	} 
	
	private void doubeleCapacity() {
		System.out.println("double capacity");
		int temp[]=data;
		data = new int[2*temp.length];
		for (int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}


	//O(1);
	public int top() throws StackEmptyExceptiom  {
		if (topIndex==-1) {
			throw new StackEmptyExceptiom();
		}
		return data[topIndex];
	}
	
	//O(1);
	public int pop() throws StackEmptyExceptiom  {
		if (topIndex==-1) {
			throw new StackEmptyExceptiom();
		}
		int temp =data[topIndex];
		topIndex--;
		return temp;
		
	}
}
