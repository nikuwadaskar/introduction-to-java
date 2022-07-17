package Arrays;
import java.util.Scanner;
public class L9HomeWork_ReturnArraySum {
	public static int sum(int[] arr) {
		int n =arr.length;
		int sum=0;
		for(int i=0;i<n;i++){
	       sum = sum+ arr[i];
	}return sum;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n =s.nextInt();
		int m = s.nextInt();
		
		for(int i =0;i<n;i++) {
			int crr[]= new int[m];
			  sum(crr);
		}
		  //int rum = sum[];
	//	System.out.println(rum);

	}//return rum;

}
