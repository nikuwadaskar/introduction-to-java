package TimeCpmplexisity;
import java.util.Scanner;
public class TC4Q3FaultyKeyboard {
	public static String removeConsecutiveDuplicates(String str) {

		String Rstr="";
		int j =0;
		Rstr+=str.charAt(j);
		for (int i =0 ; i<str.length()-1;i++) {
			if (str.charAt(i)!=str.charAt(i+1)) {
				Rstr+=str.charAt(i+1);
			}
		}
		str=Rstr;
		return str;
	}
	public static void main(String args[]) {
		Scanner s= new Scanner (System.in);
		int n =s.nextInt();
		boolean bb = true;
		for (int i=0;i<n;i++) {
			String str1=s.next();
			String str=s.next();
			String ming1 =removeConsecutiveDuplicates(str1);
			String ming =removeConsecutiveDuplicates(str);
			System.out.println(ming1.equals(ming));
		}
	}
}