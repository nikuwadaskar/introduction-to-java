package Recursion;
//Hence the time taken by recursive Fibonacci is O(2^n) or exponential
public class R1L14FibonacciNumber {//its horrible, its not suggest to use this 
	public static int fibo(int n)	{
		if(n==0	||	n==1)	{ 
			return n;
		}
		int a	=	fibo(n-1); 
		int b	=	fibo(n-2); 
		return a+b; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(45));

	}

}
