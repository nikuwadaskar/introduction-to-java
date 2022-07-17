import java.util.Scanner;

public class L7HomeWork_All_Prime_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int i;
		for (int j=2 ;j<=n;j++) {
			boolean cond = true;
			for (i=2;i<j;i++) {
				if(j%i==0) {
					cond=false;
				}
			}if (cond) {
				System.out.println(j);
			}
		}

	}

}
