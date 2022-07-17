package DP2;

public class EditDistance {
	//Iterative 
	public static int editDistanceIterative(String s, String t) {
		//Your code goes here
        //Find the lengths of both strings
        int m=s.length();
        int n=t.length();
        
        int[][] dp = new int[m+1][n+1];
        //Initializing dp for iterative approach
        for (int i=n;i>=0;i--)
            dp[m][i]=n-i;
        
        for (int i=m;i>=0;i--)
            dp[i][n]=m-i;
        
        for (int i=m-1;i>=0;i--)
        {
            for (int j=n-1;j>=0;j--)
            {
                if (s.charAt(i)==t.charAt(j))
                {
                    dp[i][j]=dp[i+1][j+1];
                }
                else
                {
                    int ans1=1+dp[i+1][j+1];
                    int ans2=1+dp[i][j+1];
                    int ans3=1+dp[i+1][j];
                    
                    dp[i][j]=Math.min(ans1,Math.min(ans2,ans3));
                }
            }
        }
        return dp[0][0];
    }

	public static int editDistanceMemorization(String s, String t, int i , int j) {

		int n = Math.max(s.length(), t.length());
		int[][] dp= new int[n+1][n+1];
		for(int o=0;o<s.length();o++){
			for(int l=0;l<t.length();l++){
				dp[o][l]=-1;
			}
		}
		if (s.length()==0) {
			return t.length();
		}else if (t.length()==0) {
			return s.length();
		}int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE,ans4=Integer.MAX_VALUE;
		if (s.charAt(0)==t.charAt(0)) {
			ans1= editDistanceMemorization(s.substring(1), t.substring(1),i+1,j+1);
		}
		else { 
			if (dp[i+1][j+1]==-1) {
				ans2=1+editDistanceMemorization(s.substring(1), t.substring(1),i+1,j+1);
				dp[i+1][j+1]=ans2;
			}else {
				ans2=1+dp[i+1][j+1];
			}
			if (dp[i+1][j]==-1) {
				ans3=1+editDistanceMemorization(s.substring(1), t,i+1,j);
				dp[i+1][j]=ans3;
			}else {
				ans3=1+dp[i+1][j];
			}
			if (dp[i][j+1]==-1) {
				ans4=1+editDistanceMemorization(s, t.substring(1),i,j+1);
				dp[i][j+1]=ans3;
			}else {
				ans3=1+dp[i][j+1];
			}
			return Math.min(ans3, Math.min(ans2, ans4));
		}
		
		int result = ans1;
		return result;


	}

	public static int editDistanceRecursive(String s, String t) {
		if (s.length()==0) {
			return t.length();
		}else if (t.length()==0) {
			return s.length();
		}int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE,ans4=Integer.MAX_VALUE;
		if (s.charAt(0)==t.charAt(0)) {
			ans1= editDistanceRecursive(s.substring(1), t.substring(1));
		}else {
			ans2=1+editDistanceRecursive(s.substring(1), t.substring(1));
			ans3=1+editDistanceRecursive(s.substring(1), t);
			ans4=1+editDistanceRecursive(s, t.substring(1));
			return Math.min(ans3, Math.min(ans2, ans4));
		}
		System.out.println(ans1);
		int result = ans1;
		return result;

	}

	public static void main(String[] args) {
		String str1="asdggs";
		String str2="asdfgdf";
		int ans1 = editDistanceRecursive(str1,str2);
		int ans2= editDistanceMemorization(str1, str2, 0, 0);
		System.out.println(ans1+" "+ans2);
	}

}
