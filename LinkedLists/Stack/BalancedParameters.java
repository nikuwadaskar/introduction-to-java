package Stack;

import java.util.Stack;

public class BalancedParameters {
	
	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack <>();
		boolean bb=true;
		for (int i =0;i<expression.length();i++) {

			if (expression.charAt(i)=='{') {
				stack.push(expression.charAt(i));
			}if (expression.charAt(i)=='}') {
//				System.out.println(expression.charAt(i)+" "+stack.pop());
				if (expression.charAt(i)=='}'&&stack.pop()=='{') {
					bb=true;
				}else {bb=false;}
//				bb=( expression.charAt(i)==stack.pop());
			}
			
			if (expression.charAt(i)=='[') {
				stack.push(expression.charAt(i));
			}if (expression.charAt(i)==']') {
				if (expression.charAt(i)==']'&&stack.pop()=='[') {
					bb=true;
				}else {bb=false;}
			}

			if (expression.charAt(i)=='(') {
				stack.push(expression.charAt(i));
			}if (expression.charAt(i)==')') {
				if (expression.charAt(i)==')'&&stack.pop()=='(') {
					bb=true;
				}else {bb=false;}
			}
		}return bb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced("({}{}{})"));

		
		
	}

}
