import java.util.Scanner;
public class L5tringularPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int k=1,j=1,sum=0;
		for (int i =2;sum<n;i++){
			sum=k+j;
			k=j;
			j=sum;
			System.out.println(sum);
		}if (sum==n) {
			System.out.println(true);
		}
		else {System.out.println(false);}
}
}