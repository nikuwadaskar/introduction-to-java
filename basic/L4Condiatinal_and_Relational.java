import java.util.Scanner;
public class L4Condiatinal_and_Relational {

	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		if (a>0&&b>0) {
			System.out.println("both are positive");
		}
		else {
			System.out.println("both are not positive");
		}
		if (a>0||b>0) {
			System.out.println("one of them is positive");
		}
		else {
			System.out.println("non of them is positive");
		}
		//if (a==b) {
		if (a!=b) {
			System.out.println("hey you are not Equal");
		}
		else {
			System.out.println("you are  Equal guys");
		}
	}

}
