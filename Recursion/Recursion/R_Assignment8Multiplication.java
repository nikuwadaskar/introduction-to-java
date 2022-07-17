package Recursion;

public class R_Assignment8Multiplication {
	public static int multiplyTwoIntegers(int m, int n){
	 if (m==0||n==0) {
			return 0;
		}return  m+ multiplyTwoIntegers(m,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(multiplyTwoIntegers(3,4));

	}

}
