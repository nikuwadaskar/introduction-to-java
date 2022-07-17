
import java.util.Scanner;
public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int i=1;// Next num to be added
		int sum=0;
		while(i<=n){
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);

	}
}
