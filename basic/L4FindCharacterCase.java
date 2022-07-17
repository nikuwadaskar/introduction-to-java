import java.util.Scanner;
public class L4FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		String str=s.next();
		int a= str.charAt(0);
		System.out.println(a);
		if (91>a&&a>64) {
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
