import java.util.Scanner;
public class L4HomeWork_multiplication_table {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a;
		a=s.nextInt();
		int i=1;
		while (i<=10) {
			int v= (i*a);
			System.out.println(v);
			i++;
		}
	}
}
