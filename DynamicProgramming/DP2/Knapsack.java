package DP2;

public class Knapsack {

	public static int knapsackIterative(int[] wt, int[] val, int n, int W) {
		//Your code goes here
		int[][] dp = new int[n+1][W+1];

		for (int i=n-1;i>=0;i--)
		{
			for (int w=0;w<=W;w++)
			{
				if (wt[i]<=w)
				{
					int ans1=dp[i+1][w];
					int ans2=dp[i+1][w-wt[i]] + val[i];
					dp[i][w]=Math.max(ans1, ans2);
				}
				else
				{
					dp[i][w]=dp[i+1][w];
				}
			}
		}
		return dp[0][W];
	}
// i don't think any memorization is possible 
	public static int knapsackMemorization(int[] weights, int[] values, int n, int maxWeight,int i) {

		int[][] dp= new int[n+1][n+1];
		for(int o=0;o<n+1;o++){
			for(int l=0;l<n+1;l++){
				dp[o][l]=-1;
			}
		}return i;
	}

public static int knapsack(int[] weights, int[] values, int n, int maxWeight,int i) {
	//Your code goes here
	if (weights.length==0||values.length==0) {
		return 0;
	}else if (weights.length==1||values.length==1) {
		return values[0];
	}int ans1 = 0,ans2 = 0,ans3=0;
	if (n>i) {
		if (weights[i]>maxWeight) {
			ans1= knapsack(weights, values, n, maxWeight, i+1);
		}else {
			ans2=values[i]+knapsack(weights, values, n, maxWeight-weights[i], i+1);
			ans3=knapsack(weights, values, n, maxWeight, i+1);
			return Math.max(ans2, ans3);
		}
	}
	return ans1;
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n =5;
	int maxweught= 26;
	int [] arr= {12, 7, 11, 8, 9};//weight
	int [] arr1= {24, 13, 23, 15, 16};//values
	System.out.println(knapsack(arr, arr1, n, maxweught,0));

}

}
