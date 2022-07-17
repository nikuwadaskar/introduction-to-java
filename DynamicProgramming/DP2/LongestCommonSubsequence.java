package DP2;

public class LongestCommonSubsequence {
	//Iterative 
	public static int lcsIterative(String str1, String str2) {

		int m = str1.length();
		int n = str2.length();

		int[][] dp = new int[m+1][n+1];

		for(int i=m-1; i>=0; i--) {
			for(int j=n-1; j>=0; j--) {

				int ans;
				if(str1.charAt(i) == str2.charAt(j)) {
					ans = 1 + dp[i+1] [j+1];
				}else {
					int ans1 = dp[i][j+1]; 
					int ans2 = dp[i+1][j];
					ans = Math.max(ans1,ans2);
				}
				dp[i][j] = ans;
			}
		}
		return dp[0][0];
	}

	public static int lcsMemorization(String str1, String str2, int i, int j) {
		int[][] dp= new int[str1.length()+1][str2.length()+1];
		for(int o=0;o<dp.length;o++){
			for(int l=0;l<dp[0].length;l++){
				dp[o][l]=-1;
			}
		}

		if(i==str1. length() || j==str2. length()) {
			return 0;
		}
		int myAns; 
		if(str1.charAt(i) == str2.charAt(j)) {
			int smallAns; 
			if(dp[i+1][j+1] == -1) {
				smallAns = lcsMemorization(str1,str2, i+1, j+1);
				dp[i+1][j+1] = smallAns;
			}else {
				smallAns = dp[i+1] [j+1];
			}
			myAns = 1 + smallAns;

		}else {
			int ans1, ans2;

			if(dp[i+1][j] == -1) {
				ans1 = lcsMemorization(str1, str2, i+1, j);
				dp[i+1][j] = ans1;
			}else{
				ans1 = dp[i+1] [j];
			}

			if(dp[i][j+1] == -1) {
				ans2 = lcsMemorization(str1, str2, i, j+1);
				dp[i][j+1] = ans2;
			}else{
				ans2 = dp[i][j+1];
			}
			myAns = Math.max(ans1, ans2);
		}
		return myAns;
	}


	private static int  lcsRecursive(String str1, String str2, int i , int j) {

		if (i==str1.length()||j==str2.length()) {
			return 0;
		}
		int myAns;
		if (str1.charAt(i)==str2.charAt(j)) {
			int smallAns= lcsRecursive(str1, str2, i+1, j+1);
			myAns=1+smallAns;

		}else {
			int ans1= lcsRecursive(str1, str2, i+1, j);
			int ans2 = lcsRecursive(str1, str2, i, j+1);
			myAns=Math.max(ans1, ans2);
		}
		return myAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="bedgmc";
		String str2="abdfglc";
		int ans1 = lcsRecursive(str1,str2,0,0);
		int ans2 = lcsMemorization(str1,str2,0,0);
		int ans3 =lcsIterative(str1, str2);
		System.out.println(ans1+" "+ans2+" "+ans3);

	}

}
