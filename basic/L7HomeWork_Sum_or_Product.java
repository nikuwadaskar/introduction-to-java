import java.util.Scanner;

public class L7HomeWork_Sum_or_Product {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int c;
		c=s.nextInt();
		if (c==1) {
			int sum=0;
			int i =1;
			while(i<=n) {
				int res=sum+i;
				i++;
				sum=res;
			}
			System.out.println(sum);
		}
		else if (c==2) {
			int pro=1;
			int i;
			for(i=1;i<=n;i++) {
				int res=i*pro;
				pro=res;
			}System.out.println(pro);
		}
		else {
			System.out.println("-1");
		}
}

}
