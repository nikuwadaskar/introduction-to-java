package DP1;

public class Fibonnacci {
	
	// Iterative  way
	public static int fibbo1(int n ) {
		if(n==0||n==1) {
			return n ;
		}
		int [] dp = new int [n+1];
		dp[0]=0;
		dp[1]=1;
		//n>=2
		for (int i = 2; i <= n; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
// Memorization way
	public static int fibo(int n ,int dp[]) {
		if(n==0||n==1) {
			return n ;
		}int nas1,ans2;
		if (dp[n-1]==-1) {
			nas1= fibo(n-1,dp);
			dp[n-1]=nas1;
		}else{
			nas1=dp[n-1];
		}
		if (dp[n-2]==-1) {
			ans2= fibo(n-2,dp);
			dp[n-2]=ans2;
		}else{
			ans2=dp[n-2];
		}
		int myAns=nas1+ans2;

		return 	myAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1110;
//		int []dp= new int[n+1];
//		for (int i = 0; i < dp.length; i++) {
//			dp[i]=-1;
//		}
		int ans =fibbo1(n);
		System.out.println(ans);

	}

}
