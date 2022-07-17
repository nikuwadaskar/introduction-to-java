import java.util.Scanner;
public class L5HomeWork_Parallelogram_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int i=1;
		while (i<=n) {
	int j=1;
	while (j+1<=i) {
		System.out.print("*");
		j++;
	}
	int k=1;
	while(k<=n) {
		System.out.print("%");
		k++;
	}System.out.println();
	i++;
		}
		
	}

}
