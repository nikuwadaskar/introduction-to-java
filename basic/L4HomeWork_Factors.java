import java.util.Scanner;
public class L4HomeWork_Factors {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n;
		n = s.nextInt();
		int i=2;
		while (i<=n/2) {
			if (n%i==0) {
				System.out.print(i);
				System.out.print(" ");
			}i++;
		}
	}

}
