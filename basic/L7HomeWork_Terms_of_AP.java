import java.util.Scanner;

public class L7HomeWork_Terms_of_AP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int j = 0;
		int AP = 0;
		while (j <= n) {
		while (i <= n + j - i / 2) {
			AP = 3 * i + 2;
			if (AP % 4 != 0)
				System.out.print(AP + " ");
			i++;
		}
//		System.out.println();
//			System.out.print(j);
			j++;
		}
	}

}
