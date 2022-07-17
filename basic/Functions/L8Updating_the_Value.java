package Functions;

public class L8Updating_the_Value {
	public static int sum(int a, int b) {
		b=increment(b);
	 int result = a+b;
	 return result;
	}
 public static int increment(int n) {
	 n++;
	 //System.out.println(n);
	 return n;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int m = 10;
		n= sum(n,m);
		System.out.println(m + " main "+ n);

	}

}
