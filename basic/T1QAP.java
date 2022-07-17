import java.util.Scanner;

public class T1QAP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int prev=s.nextInt();
		int current= s.nextInt();
		int d = current - prev;
		int count =3;
		prev=current;
		while (count <=n) {
			current =s.nextInt();
			int tempD = current -prev;
			if(tempD!=d) {
				System.out.println("false");
				return;
			}
			count++;
			prev=current;
		}
		System.out.println("true");	 
	}
}