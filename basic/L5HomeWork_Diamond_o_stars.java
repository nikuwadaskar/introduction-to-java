import java.util.Scanner;
public class L5HomeWork_Diamond_o_stars {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n;
		n = s.nextInt();
		//int n =((z+1)/(int)2);
		int i=1;
		while (i<=(n)) {
			int j=1;
			while (j<=(n-i+1)) {
				System.out.print(j);
				j++;
			}
			int k=1;
			while (k<=(i-1)) {
				System.out.print("*");
				k++;
			}
			int p=1;
		     while((p+1)<=i) {
				System.out.print("*");
				p++;
				}
			int l = 1;
			 for (int lk = i; lk<=n; lk++) {
	                System.out.print(lk);}
	           System.out.println();
				i++;
		}
//		int l=1;
//		while (l<=n-1) {
//			int j=1;
//			while (j<=l) {
//				System.out.print(j);
//				j++;
//			}
			//int y=1;
//			while (y<=(n-l)) {
//				System.out.print("*");
//				y++;
//			}
//			int o=1;
//			while (o<=(n-l-1)) {
//				System.out.print("*");
//				o++;
//			}
//			System.out.println();
//			l++;
//	}

}
}
