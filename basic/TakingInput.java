import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("you wanna know your name?\nthen give me your first name?\nAnd please dont forgate to keep First word cap");
		String str1=s.nextLine();
 		System.out.println("now tell me whats your middle name?");
 		String str2=s.nextLine();
 		System.out.println("ok now whats your last name?");
 		String str3 =s.nextLine();
 		System.out.println("ok here is your full name ");
 		System.out.print(str1);
 		System.out.print(" ");
 		System.out.print(str2);	
 		System.out.print(" ");
 		System.out.print(str3);
 		String str=s.next();
		char a= str.charAt(0);
	}

}
