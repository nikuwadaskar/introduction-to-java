package DP2;

public class MinCostPathProblem {
	
	//top down approch//nahi jamm raha 
	public static int minCostIterativeTD(int[][]cost){
		int m=cost.length;

		int n =cost[0].length;
		System.out.println(m+""+m);
		int [][]dp= new int[m+1][m+1];
		for (int k = 0; k <m; k++) {
			for (int l = 0; l < m; l++) {
				dp[k][l]=Integer.MAX_VALUE;
			}
		}


		for(int i=1;i<=n;i++){
			for(int j =1;j<=m;j++){
				if(i==1&&j==1) {
					dp[i][j]=cost[0][0];
					continue;
				}
				int ans1 =dp[i-1][j];
				int ans2=  dp[i][j-1];
				int ans3=  dp[i-1][j-1];


				dp[i][j]=cost[i-1][j-1]+Math.min(ans1,Math.min(ans2,ans3));
			}
		}
		return dp[n][m];
	}
	
	
	
	//iterative 
	public static int minCostIterative(int[][]cost){
		int m=cost.length;
		int n =cost[0].length;
		int [][]dp= new int[m+1][m+1];
		for (int k = 0; k < dp[0].length; k++) {
			for (int l = 0; l < dp[1].length; l++) {
				dp[k][l]=Integer.MAX_VALUE;
			}
		}


		for(int i=m-1;i>=0;i--){
			for(int j =n-1;j>=0;j--){
				if(i==m-1&&j==n-1) {
					dp[i][j]=cost[i][j];
					continue;
				}
				int ans1 =dp[i][j+1];
				int ans2=  dp[i+1][j];
				int ans3=  dp[i+1][j+1];


				dp[i][j]=cost[i][j]+Math.min(ans1,Math.min(ans2,ans3));
			}
		}
		return dp[0][0];
	}


	public static int minCostMemorization(int[][]cost,int i,int j){

		int m=cost.length;
		int n =cost[0].length;
		int [][]dp= new int[m+1][m+1];
		for (int k = 0; k < dp[0].length; k++) {
			for (int l = 0; l < dp[1].length; l++) {
				dp[k][l]=-1;
			}
		}
		// Special Case
		if(i==m-1&&j==n-1){
			return cost[i][j];
		}
		// Base Case
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}int ans1=0,ans2=0,ans3=0;
		//you are checking that position which is you are gonna call hence add i+1 okay 
		if (dp[i+1][j]==-1) {
			ans1=minCostMemorization(cost,i+1,j);
			dp[i+1][j]=ans1;
		}else {
			ans1=dp[i+1][j];
		}if (dp[i][j+1]==-1) {
			ans2=minCostMemorization(cost,i,j+1);
			dp[i][j+1]=ans2;
		}else {
			ans2=dp[i][j];
		}if (dp[i+1][j+1]==-1) {
			ans3=minCostMemorization(cost,i+1,j+1);
			dp[i+1][j+1]=ans3;
		}else {
			ans3=dp[i+1][j+1];
		}



		int myAns=cost[i][j]+Math.min(ans1,Math.min(ans2,ans3));
		return myAns;
	}

	public static int minCost(int[][]cost,int i,int j){
		int m=cost.length;
		int n =cost[0].length;
		// Special Case
		if(i==m-1&&j==n-1){
			return cost[i][j];
		}
		// Base Case
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		int ans1=minCost(cost,i+1,j);
		int ans2=minCost(cost,i,j+1);
		int ans3=minCost(cost,i+1,j+1);
		int myAns=cost[i][j]+Math.min(ans1,Math.min(ans2,ans3));
		return myAns;
	}
	
	

	public static void main(String[] args) {

		int[][]cost={{1,5,11},{8,13,12},{2,3,7},{15,16,18}};

		System.out.println(minCost(cost,0, 0));
		System.out.println(minCostMemorization(cost,0, 0));
		System.out.println(minCostIterative(cost));
		System.out.println(minCostIterativeTD(cost));
		

	}
}
