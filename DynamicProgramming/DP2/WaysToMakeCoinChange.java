package DP2;
import java.util.*;
public class WaysToMakeCoinChange {
	// kuch khaass samjha nahi 

//	public static int countWaysToMakeChangeRecursive(int denominations[], int value){
//return 0;
//	}
	
	static int coinchange(int[] a, int v, int n, int[][] dp)
	{
		if (v == 0)
			return dp[n][v] = 1;
		if (n == 0)
			return 0;
		if (dp[n][v] != -1)
			return dp[n][v];
		if (a[n - 1] <= v)
		{
		
			// Either Pick this coin or not
			return dp[n][v]
				= coinchange(a, v - a[n - 1], n, dp)
				+ coinchange(a, v, n - 1, dp);
		}
		else // We have no option but to leave this coin
			return dp[n][v] = coinchange(a, v, n - 1, dp);
	}
	
	public static void mai()
	{
		int tc = 1;
		while (tc != 0) {
			int n, v;
			n = 6;
			v = 250;
			int[] a = {1, 2, 3, 4, 5, 6};
			int[][] dp = new int[n + 1][v + 1];
			for (int[] row : dp)
				Arrays.fill(row, -1);
			int res = coinchange(a, v, n, dp);
			System.out.println(res);
			tc--;
		}
	}
	public static int countWaysToMakeChangeMemorization(int denominations[], int value,int n){
		// If n is 0 then there is 1 solution
	    // (do not include any coin)
		
		int[][] dp= new int[n+1][value+1];
		for(int o=0;o<=n;o++){
			for(int l=0;l<=value;l++){
				dp[o][l]=-1;
			}
		}
		
			if (value == 0)
				return dp[n][value] = 1;
			if (n == 0)
				return 0;
			if (dp[n][value] != -1)
				return dp[n][value];
			if (denominations[n - 1] <= value)
			{
			
				// Either Pick this coin or not
				return dp[n][value]
					= countWaysToMakeChangeMemorization(denominations, value - denominations[n - 1], n)
					+ countWaysToMakeChangeMemorization(denominations, value, n - 1);
			}
			else // We have no option but to leave this coin
				return dp[n][value] = countWaysToMakeChangeMemorization(denominations, value, n-1 );
		}
		public static int countWaysToMakeChangeRecursive(int denominations[], int value,int n )
		{
			
			
		// If n is 0 then there is 1 solution
	    // (do not include any coin)
	    if (value == 0)
	        return 1;
	     
	    // If n is less than 0 then no
	    // solution exists
	    if (n < 0||value<0)
	        return 0;
	 
	    // If there are no coins and n
	    // is greater than 0, then no
	    // solution exist
	    if (value <= 0 && n >= 1)
	        return 0;
	 
	    // count is sum of solutions (i)
	    // including S[m-1] (ii) excluding S[m-1]
	    
	    int ans1=countWaysToMakeChangeRecursive(denominations, value - denominations[n], n) ;
	   
	    int ans2=countWaysToMakeChangeRecursive(denominations, value, n - 1);
	    		 return ans1+ans2;
//	    return countWaysToMakeChangeRecursive(denominations, value - denominations[n], n) +countWaysToMakeChangeRecursive(denominations, value, n - 1);
	}

		public static int countWaysToMakeChangeIterative(int denominations[], int value){
	     // Write your code here
        /*
        if (value==0)
            return 1;
        
        if (value<0)
            return 0;
        
        int finalAns=0;
        for (int i=0;i<denominations.length;i++)
        {
            finalAns=finalAns+countWaysToMakeChange(denominations,value-denominations[i]);
        }
        return finalAns;
        */
        int[] dp = new int[value+1];
        dp[0]=1;
        for (int i=0;i<denominations.length;i++)
        {
            for (int j=0;j<=value;j++)
            {
                if (j>=denominations[i])
                {
                    dp[j]=dp[j]+dp[j-denominations[i]];
                }
            }
        }
        return dp[value];
	}	
		
		
		
	public static void main(String[] args) {

	
	int arr[]=	{1, 2, 3, 4, 5, 6};
		int val = 250;
		int n = arr.length-1;
		System.out.println(countWaysToMakeChangeMemorization(arr, val,n));
		mai();
		
	
	}

}
