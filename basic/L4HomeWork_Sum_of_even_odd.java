import java.util.Scanner;
public class L4HomeWork_Sum_of_even_odd {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		String str=s.next();//this is something new here how to take long input, take input as string and convert it into long 
		long n = Long.parseLong(str);// 
		long sumeve=0;
		long sumodd=0;
		while (n>0) {
			long digit = n%10;
			long rem= n/10;
			n=rem;
			if(digit%2==0) {
				sumeve=sumeve+digit;
			}
			if (digit%2!=0) {
				sumodd=sumodd+digit;
			}
		}
		System.out.println(sumeve+" "+ sumodd);
	}

}
