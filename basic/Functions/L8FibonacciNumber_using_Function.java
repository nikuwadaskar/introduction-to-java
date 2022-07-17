package Functions;
import java.util.Scanner;

public class L8FibonacciNumber_using_Function {
	public static boolean checkMember(){
		Scanner s= new Scanner(System.in);
		int n =s.nextInt();
		int ans =2;
		int a=0;
		int b=1;
		for (int i=2; i<= n ;i++){
	     ans= a+ b;
	     a=b;
	     b=ans;
	    	if (n==b) {
	    		return true;
	    	}
	     
	     
	    	 
	     }
   	 return true;
		
	}
	public static void main(String[] args) {
		
		boolean b = checkMember();
		if(b==true) {
			System.out.println(true);
		}else {
		System.out.println(false);
	        }
	}
}

