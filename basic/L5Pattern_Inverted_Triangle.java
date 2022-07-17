import java.util.Scanner;
public class L5Pattern_Inverted_Triangle {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n; 
		n = s.nextInt();
		int i=1;
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
				System.out.print("*");
				k++;
			}
			int p=1;
			while((p+1)<=i) {
				int w=i-p;
				System.out.print("*");
				p++;
			}
			System.out.println();
			i++;
		}
	}
}
