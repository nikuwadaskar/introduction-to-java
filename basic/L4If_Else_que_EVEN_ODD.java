import java.util.Scanner;
public class L4If_Else_que_EVEN_ODD {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		//b=s.nextInt();
		//int rem= a%2;
		//boolean result = (rem ==0);
		//if (result==true) {
		//if (result) {
		//if (rem==0) {
		if (a%2==0) {
			System.out.println(a+ " aap to even nikale");
		}
		else {
			System.out.println(a+ " aap to odd lagg rahe ho");
		}
	}

}
