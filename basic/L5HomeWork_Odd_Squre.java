import java.util.Scanner;

public class L5HomeWork_Odd_Squre {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		n = 2 * n - 1;
		int i = 1;
		while(i <= n) {
			int j = i;
			while(j <= n) {
				System.out.print(j);
				j = j + 2;
			}
			int a = 1;
			while(a <= i - 1) {
				System.out.print(a);
				a = a + 2;
			}
			System.out.println();
			i = i + 2;

		}
	}
}
