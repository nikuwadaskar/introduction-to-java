import java.util.Scanner;

public class L7HomeWork_Fibonacci_Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		if (n>2) {
			double r = Math.sqrt(5);
			double o = ((r+1)/2);
			double p = ((r-1)/2);
			double h= Math.pow(p,n);
			double j= Math.pow(o,n);
			double sum =((j-h)/r);
			int roundOff = (int) Math.round(sum);
			System.out.println(roundOff);}
		else {
			System.out.println("1");
		}

	}

}
