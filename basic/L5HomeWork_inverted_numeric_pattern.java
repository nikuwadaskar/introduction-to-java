import java.util.Scanner;

public class L5HomeWork_inverted_numeric_pattern {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n; 
		n = s.nextInt();
		int i=1;
		int t=0;
		while (i<=n) {
			int j=1;
			while (j<=(n-i)) {
				int k = n-i;
				System.out.print(" ");
				j++;
			}
			int k=1;
			while (k<=(i)) {
				int f = i+k-1;
				System.out.print(f);
				k++;
			}
			int p=1;
		     while((p+1)<=i) {
		    	 int w =t-p+1;
				System.out.print(w);
				p++;
				}
			System.out.println();
			i++;
			t=t+2;
		}

	}

}
