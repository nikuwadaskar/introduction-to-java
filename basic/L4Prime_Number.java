import java.util.Scanner;
public class L4Prime_Number {
	public static void main(String[] args) {
		int a,i;
		Scanner s=new Scanner (System.in);
		a=s.nextInt();
		i=2;
		//boolean cond=true;
		while (i<a-1) {
			if(a%i==0) {
				//cond =false;
				return;// after return no line will be executed in main 
			}
			i++;
		}System.out.println("prime");
		//		if (cond) {
		//			System.out.println("Prime");
		//		}else {
		//			System.out.println("composit");
		//		}
	}

}
