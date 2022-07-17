import java.util.Scanner;
public class T2Q3Prability {
	public static int probability(int n,int x){
		double total_outcomes= nCr(8,n);
		double favourable_outcome = nCr(4,x)*nCr(4,n-x);
		int  answer= (int)((favourable_outcome/total_outcomes)*100);
		return answer;
	}
	public static int nCr(int n,int x) {
		int factn= factorial (n);
		int factr= factorial (x);
		int factt= factorial (n-x);
		int nCr=factn/(factr*factt);
		return nCr;
	}
	public static int factorial(int n) {
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	
}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		
		int n= s.nextInt();
		int x= s.nextInt();
		System.out.println(probability(n,x));
	}

}
