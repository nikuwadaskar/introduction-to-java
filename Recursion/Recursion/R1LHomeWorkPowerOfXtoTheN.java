package Recursion;

public class R1LHomeWorkPowerOfXtoTheN {
	public static int power(int x, int n) {
        if (n==0) {
            return 1;
        }
       return power(x,n-1)*x;
    }

	public static void main(String[] args) {
		 System.out.println(power(4,5));
	}

}
