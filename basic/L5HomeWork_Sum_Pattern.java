import java.util.Scanner;

public class L5HomeWork_Sum_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int i=1;
		int sum=0;
		while (i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				//int k=1;
				if (j<i) {
					System.out.print("+");
				//k++;
				}
				j++;
			}
			sum=sum+i;
			System.out.print("=");
			System.out.print(sum);
			System.out.println();
			i++;
			
		}

	}

}
