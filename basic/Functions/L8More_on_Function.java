package Functions;
import java.util.Scanner;
public class L8More_on_Function {
//	public static int sum(int a, int b ) {
//		int sum =a+b;
//		return sum;
//	}
//	public static void main(String[] args) {
//		Scanner s = new Scanner (System.in);
//		int a= s.nextInt();
//		int b = s.nextInt();
//		int cum = sum (a,b);// Sequence matter bhaiya if you send b and a then they will assign b to a and and a to b in function
//		System.out.println(cum);
//	}
//	public static double sum(int a, int b,double c ) {
//		double sum =a+b+c;
//		return sum;
//	}
	
//	public static void main(String[] args) {
//		Scanner s = new Scanner (System.in);
//		int a= s.nextInt();
//		int b = s.nextInt();
//		double cum = sum (a,b,10.5);// Sequence matter bhaiya if you send b and a then they will assign b to a and and a to b in function
//		System.out.println(cum);
	
	
	
//	public static void printEvenNumber() {
//		for (int i=2 ; i<=100; i+=2) {
//			System.out.println(i);
//		}
//		
//	}
//	public static void main(String[] args) {
//		printEvenNumber();
//}
	
	
	public static void printEvenNumber(int start , int end) {
		if (start%2!=0) {
			start++;
		}
		for (int i=start ; i<=end; i+=2) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		printEvenNumber(3,17);
	}
}





