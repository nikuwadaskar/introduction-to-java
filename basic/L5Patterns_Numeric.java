import java.util.Scanner;
public class L5Patterns_Numeric {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n;
		n= s.nextInt();
	   int  i=1;
	   int t=0;
		int p=1;
		while (i<=n) {
			int j=1;
			
		while (j <= i) {
			//int k= n-i+1;
			int k=t-j+3;
          System.out.print(k);
          j++;
         
          //p++; this makes keep counting pattern.
		}System.out.println();
		i++;
		t=t+2;
		}

}
}