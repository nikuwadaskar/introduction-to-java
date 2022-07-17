package Functions;

public class L8FunctionOverloading {
	public static int sum(int a , int b) {
		 return a+b;
	}
	public static int sum(int a) {
		return a=a+1;
	}
	public static double sum(double a, double b) {
		return a-b;
	}

	public static void main(String[] args) {
		int a=8;
		int b =2;
		int c =sum(a,b);
		int d =sum(a);
		double k =sum(a,b);
		double z =sum(8.0,7.2);
		System.out.println(c);
		System.out.println(d);
		System.out.println(k);
		System.out.println(z);

	}

}
