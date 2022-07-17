import java.util.Scanner;

public class L7HomeWork_Reverse_of_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int res=0;
		n=s.nextInt();
		while (n>0) {
		int digit = n%10;
		n=n/10;
		res=(res * 10) + digit;
	}System.out.println(res);

}
}
