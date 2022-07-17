
package TimeCpmplexisity;
import java.util.Scanner;
public class TC4Q1RectanglePattern {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int N = sc.nextInt();
		int N =4;
		/*  PRINT UPPER PART
	            4444444
	            4333334
	            4322234
	            4321234
		 */
		for(int i = N; i>(1); i--)
		{
			for(int j = N; j >i; j--) {
			//	System.out.print(j);
			}for(int j = 0; j<(i*2)-1; j++) {
			//	System.out.print(i);
			}for(int j = i+1; j<=N; j++){
				System.out.print(j);
			}System.out.println("");
		}
		/* 
	            PRINT LOWER PART
	            4322234
	            4333334
	            4444444
		 */
//		for(int i = 1; i<=(N); i++)
//		{
//			for(int j = N; j>i; j--) {
//				System.out.print(j);
//			}for(int j = 0; j<(i*2)-1; j++) {
//				System.out.print(i);
//			}for(int j = i+1; j <=N; j++) {
//				System.out.print(j);
//			}System.out.println("");
//		}
	}

}
