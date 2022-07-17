package Functions;
import java.util.Scanner;
public class L8Calculating_NcR0 {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int n= s.nextInt();
	int r= s.nextInt();
	int factn=1;
	int factr=1;
	int factt=1;
	for (int i=1;i<=n;i++) {
		factn=factn*i;
	}
	
	for (int i=1;i<=r;i++) {
		factr=factr*i;
	}
	for (int i=1;i<=(n-r);i++) {
		factt=factt*i;
	}
	
	int result=factn/(factr*factt);
    System.out.println(result);
	}

}
