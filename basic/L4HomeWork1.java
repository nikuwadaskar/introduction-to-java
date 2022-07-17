import java.util.Scanner;
public class L4HomeWork1 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		String str=s.next();
		char a= str.charAt(0);
		if (98>a&&a>64) {
			System.out.println("1");
		}
		else if (123>a&&a>96) {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
	}

}
