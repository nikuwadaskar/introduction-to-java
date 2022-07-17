package Stack;
import java.util.Stack;
public class StockSpan {
	public static int[] stockSpan(int[] price) {
		//Your code goes here\

		Stack<Integer> stack = new Stack<>();
		int l = price.length;

		int[] output = new int[l];
		stack.push(0);
		output[0] = 1;;

		for (int i = 1; i < l; i++) {
			while (!stack.isEmpty() && price[stack.peek()] < price[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				output[i] = i + 1;
			}
			else
			{
				output[i] =  i - stack.peek();
			}
			stack.push(i);
		}
		return output;

	}
}