package DP1;

public class StairCase {
	
	public static int staircasedp(int n) {
		int []dp= new int[n+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i]=-1;
		}
		if (n < 0) {
			return 1;
		}else if (n<2) {
			return 1;
		}else if (n<3) {
			return 2;
		}
		
		int k=0,m = 0,o = 0;
		if (dp[n-1]==-1) {
			k = staircasedp(n-1);
			dp[n-1]=k;
		}else {
			k=dp[n-1];
		}
		if (dp[n-2]==-1) {
			m = staircasedp(n-2);
			dp[n-2]=m;
		}else {
			m=dp[n-2];
		}
		if (dp[n-3]==-1) {
			o = staircasedp(n-3);
			dp[n-3]=o;
		}else {
			o=dp[n-3];
		}
		return m+k+o;
	}
	
	
	public static int staircaseRecursive(int n) {
		if ( n == 0)
			return 1;
		else if (n < 0)
			return 0;
		int k = staircaseRecursive(n-1);
		int m = staircaseRecursive(n-2);
		int o = staircaseRecursive(n-3);

		return m+k+o;

	}


		public static long staircase(int n) {
			//Your code goes here
	        /*
	        //If we reach n=0, we have found a path
	        if (n==0)
	            return 1;
	        
	        //If n<0, the steps we took till then don't work
	        else if(n<0)
	            return 0;
	        
	        return staircase(n-1)+staircase(n-2)+staircase(n-3);        
			*/
	               
	        if(n<=1)
	            return 1;
	        if(n==2)
	            return 2;
	        
	        long dpCount[] = new long[n+1];
	        dpCount[0]=1;
	        dpCount[1]=1;
	        dpCount[2]=2;

	        
	        for (int i=3;i<=n;i++)
	        {
	            dpCount[i]=dpCount[i-1]+dpCount[i-2]+dpCount[i-3];
	                
	        }
	        return dpCount[n];
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
//		long []dp= new long[n+1];
//		for (int i = 0; i < dp.length; i++) {
//			dp[i]=-1;
//		}
		System.out.println(staircase(n));

	}

}

