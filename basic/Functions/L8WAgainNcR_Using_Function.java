package Functions;
import java.util.Scanner;
public class L8WAgainNcR_Using_Function {
	public static int factorial(int n) {
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n= s.nextInt();
		int r = s.nextInt();
		int factn= factorial (n);
		int factr= factorial (r);
		int factt= factorial (n-r);
		int result=factn/(factr*factt);
		System.out.println(result);
	}

}
