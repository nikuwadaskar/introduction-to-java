import java.util.Scanner;
public class L4HomeWork_Find_Power_of_a_Number {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x,n;
		x=s.nextInt();
		n=s.nextInt();
		int i=1;
		int rum=1;
		while (i<=n) {
			rum=rum*x;
			i++;
		}System.out.println(rum);
	}
}
