package Functions;

import java.util.Scanner;

public class L8CheckPrime_using_Function {
	public static boolean isPrime(int n) {// first type of solving 
		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		} return true;
	}
	public static boolean isPrime2(int n) {//second type of solving
		int div=2;
		boolean isPrime=true;
		while(div<=n/2){
			if(n%div==0){
				//Not prime
				isPrime=false;
				break;
			}
			div=div+1;
		}return isPrime;
	}

			public static void main(String[] args) {
				Scanner s= new Scanner(System.in);
				int n =s.nextInt();
				boolean b = isPrime2(n);
				System.out.println(b);
			}

		}
