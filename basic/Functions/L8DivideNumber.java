package Functions;

public class L8DivideNumber {
	public static int devideNumber(int a, int b) {
		if (b==0) {
			return Integer.MIN_VALUE;// you cant just say return bcoz you have to give back it value.
		}System.out.println("outside if cond"); 
		return a/b;
	}
	public static void devideNumberResult(int a, int b) {
		if (b==0) {
			System.out.println("division by zero is not allowed");
			return;
		}System.out.println(a/b);
	}
	public static void main(String[] args) {/// main is the caller 
		int n =8;
		int m = 0;
		devideNumberResult(n, m); // callie becoz it is calling the function
		//int kal = devideNumberResult(n, m);//do not try this this will show errorbcoz you can not collect the result from void function
		//int kal= devideNumber(n, m);
		//System.out.println(kal);

	}

}
