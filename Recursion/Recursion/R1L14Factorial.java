package Recursion;
// factorial function has big O of n time complexity ;
// space complexity is big O of(n)
public class R1L14Factorial {
	public static int  fact(int n ) {
		if (n==0) {
			return 1;
		}
		int smallout= fact(n-1);
		int out = n*smallout;
		return out;
	}
	public static int  sumn(int n ) {
		if (n==0) {
			return 0;
		}else {
			int smallout= sumn(n-1);
			int out = n+smallout;
			return out;
		}
	}
	 public static void main(String[] args)
	    {
		 System.out.println(fact(5));
		 System.out.println(sumn(10));
	    }
}
