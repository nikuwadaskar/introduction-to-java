import java.util.Scanner;
public class L5Patterns_Mirror_Image {

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
				System.out.print(k);
				k++;
			}
			System.out.println();
			i++;

		}
	}

}
