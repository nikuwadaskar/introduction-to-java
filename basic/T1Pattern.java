import java.util.Scanner;
public class T1Pattern {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n; 
		n = s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			int k;
			while (j<=n-i){
				k= n-j+1; 
				System.out.print(k);
				j++;
			}
			System.out.print("*");
			int l=1;
			while (l<=i-1){
				int sum= i-l;
				System.out.print(sum);
				l++;
			}System.out.println();
			i++;

		}
	}
}
