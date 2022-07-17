package Stack;
import java.util.Stack;
public class ReverseStack {
		// Recursive function to reverse a given stack
	public static void reverseStack(Stack<Integer> s, Stack<Integer> extra) {
		// base case: stack is empty
		if (s.empty()) {
			return;
		}
		// Pop all items from the stack and hold them in the call stack
		int item = s.pop();
		reverseStack(s,extra);
		// After the recursion unfolds, insert each item in the call stack
		// at the bottom of the stack
		insertAtBottom(s, item);
	}
	public static void insertAtBottom(Stack<Integer> s, int item)
	{
		// base case: if the stack is empty, insert the given item at the bottom
		if (s.empty())
		{
			s.push(item);
			return;
		}
		// Pop all items from the stack and hold them in the call stack
		int top = s.pop();
		insertAtBottom(s, item);
		// After the recursion unfolds, push each item in the call stack
		// at the top of the stack
		s.push(top);
	}


	public static void main(String[] args) {
		Stack<Integer> stack = new Stack ();
		Stack<Integer> helper = new Stack ();
		int arr[]= {5,6,7,8,9,0};
		for (int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		reverseStack(stack,helper);

		for (int i=0;i<arr.length;i++) {
			System.out.println(stack.pop());
		}
		
	}



}
