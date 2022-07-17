import java.util.Scanner;

public class T2Q1pattern {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n;
		n = s.nextInt();
		int l=n;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=n;j>=i;j--)
	        {
	            //cout<<n-j+1;
	            System.out.print(n-j+1);
	        }
	        if(i>1)
	        {
	        for(int p=1;p<=2*(i-1);p++)
	        {
	           // cout<<"*";
	            System.out.print("*");
	        }
	        }
	        for(int j=l;j>=1;j--)
	        {
	            //cout<<j;
	        	System.out.print(j);
	            
	        }
	        l=l-1;
	        //<<endl;
	        System.out.println();
        }
	}

}
