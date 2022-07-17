package Stack;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> stack = new Stack <>();
		   while(stack.isEmpty())
	        {
	            stack.push(10);
	        }
	        System.out.print(stack.pop()+" "+stack.size());
		

//		int arr[]= {5,6,8,9,0};
//		for (int i:arr) {
//			stack.push(i);
//		}
//		
//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
		
//		System.out.println(stack.size());
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
		
	}

}
