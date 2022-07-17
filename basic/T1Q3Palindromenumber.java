import java.util.Scanner;

public class T1Q3Palindromenumber {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
	 int i = 0;
	  int j = n; 
	  while (j > 0) {
	    int last = j % 10;
	    j = j / 10;
	    i = i * 10 + last;
	  }
	  if (n == i) {
	   System.out.println("true");
	  }
	  else {
	   System.out.println("false");
	  }
 
	}
}
