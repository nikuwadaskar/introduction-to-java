package Recursion;
//1+(1/2)+(1/4)+....+(1/2^n)
public class R_Assignment1GeometricSum {
	public static double findGeometricSum(int n){
		if (n == 0)
			{return 1;}
		return (1 / (double)Math.pow(2, n) + findGeometricSum(n - 1));
	}
	public static void main(String[] args) {
		System.out.println(findGeometricSum(3));
	}
}