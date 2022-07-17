package Stack;
import java.util.Stack;
public class CheckRedundantBrackets {
	public static boolean find (char ch) {

		if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
			return true;
		}
		return false;
	}

	public static boolean checkRedundantBrackets(String expression) {
		Stack<Character> stack = new Stack<>();

		for (int i  = 0; i < expression.length(); ++i) {
			if (expression.charAt(i) == '(' || find(expression.charAt(i))) {
				stack.push(expression.charAt(i));
			}
			else if (expression.charAt(i) == ')') {
				boolean ans = false;

				while (!stack.isEmpty() && stack.peek() != '(') {
					stack.pop();
					ans = true;
				}
				if (!ans) {
					return true;
				}
				if (!stack.isEmpty()) {
					stack.pop();
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		

	}

}
