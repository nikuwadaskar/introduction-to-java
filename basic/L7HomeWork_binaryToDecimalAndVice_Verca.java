import java.util.Scanner;

public class L7HomeWork_binaryToDecimalAndVice_Verca {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n;
		long ans=0;
		long k=1;
		n=s.nextInt();
//		while (n != 0) {
//		    int a = n % 10; // yaha pe "n" ko mode k kiya
//		    ans = ans + a * k;
//		    n = n / 10;
//		    k = k * 2; // its for upadating the ans by one value
//		  }
//		System.out.println(ans);
		while (n > 0) {
		    long a = n % 2; // yaha pe "n" ko mode k kiya
		    ans = ans + a * k;
		    n = n / 2;
		    k = k * 10; // its for upadating the ans by one value
		  }System.out.println(ans);
	}

}

