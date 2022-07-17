import java.util.Scanner;
public class L5Patterns_Alpha {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n;
		n= s.nextInt();
		int i=1;
		int p=1;
		while (i<=n) {
			int j=1;
		while (j <= i) {
			//int  ch= 'A'+ i-1;
			int k = 'A'+n+j-i-1;// this makes nice patterns in reverce 
          System.out.print((char)k);
          j++;
          //p++; this makes keep counting pattern.
		}System.out.println();
		i++;
		}

	}

}
