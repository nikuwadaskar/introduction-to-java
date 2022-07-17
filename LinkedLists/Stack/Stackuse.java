package Stack;

public class Stackuse extends StackusingArray{

	
	public static void main(String[] args) throws StackFullException, StackEmptyExceptiom {
//		StackusingArray stack = new StackusingArray ();
		StacksUsingLL<Integer> stack = new StacksUsingLL ();
		
		int arr[]= {5,6,7,8,9,0};
		for (int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
//		stack.push(10);
//		System.out.println(stack.top());
//		stack.pop();
//		stack.top();
//		stack.size();
//		System.out.println(stack.isEmpty());
		
		
	}
}
