package DP1;

public class SquaresToRepresentN {
//Iterative 
	public static int minCount(int n) {
		if(n==1) {
			return 1;
		}
		int[] dp = new int[n+1];
		for (int i=0;i<n+1;i++) {
			dp[i]=-1;
		}
		dp[0]=1;
		dp[1]=1;
		for (int i = 2; i <= n; ++i)

		{
			int myAns=0;

			dp[i] = Integer.MAX_VALUE;

			for (int j = 1; i - (j * j) >= 0; ++j)

			{

				myAns=	dp[i] = Math.min(dp[i], dp[i - (j * j)]);
			}

			dp[i] = myAns+ 1;
		}

		int result = dp[n];

		return result;
	}



	public static int minCountRecursive(int n) {
		//Your code goes here
		int dp[] = new int[n+1];
		for (int i=0;i<n+1;i++)
			dp[i]=-1;


	
		if (n==0) {
			return 0;

		}int minVal = Integer.MAX_VALUE;
		for (int i=1;i*i<=n;i++)
		{int currVal;
			if (dp[n-(i*i)]==-1) {
				currVal=dp[n-(i*i)]=minCountRecursive(n-(i*i));
			}else{
				 currVal = dp[n-(i*i)];
				}
			if (currVal<minVal) {
				minVal=currVal;
			}
		}

		return minVal+1;
	}


	public static int minSquares(int n){
		if(n==0){
			return 0;
		}
		int minAns =Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++){
			int currans=minSquares(n-(i*i));
			if(minAns> currans) {
				minAns= currans;
			}
		}
		int myAns=1+minAns;
		return myAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(minCount(6));
//		System.out.println(minSquares(6));
		

	}

}
