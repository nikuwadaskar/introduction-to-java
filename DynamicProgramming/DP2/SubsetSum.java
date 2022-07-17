package DP2;

public class SubsetSum {

	static boolean isSubsetPresent1(int[] set, int n, int sum) {
		//dp [i][j] is true if we can create arr subset sum of j from first i elements
		
		boolean dp[][]=new boolean [n+1][sum+1];
		//if sum 0 , then answer is true
		for (int i = 0; i < n; i++) {
				dp[i][0]=true;
			}
		
		//if sum is not 0 and set is empty , then answer is false
		for (int i = 1; i < sum; i++) {
			dp[0][i]= false;
		}
		
		//fill the table on bottom up manner 
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (j<set[i-1]) {
					dp[i][j]=dp[i-1][j];
				}
				else {
					dp[i][j]=dp[i-1][j]||dp[i-1][j-set[i-1]];
				}
			}
		}
		
		boolean result= dp[n][sum];
		return result ;
	}
	
		
	


	static boolean isSubsetPresent(int[] set, int n, int sum) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		{
			// Base Cases
			if (sum == 0)
				return true;
			if (n == 0)
				return false;

			// If last element is greater than
			// sum, then ignore it
			if (set[n - 1] > sum)
				return isSubsetPresent(set, n - 1, sum);

			/* else, check if sum can be obtained
			by any of the following
				(a) including the last element
				(b) excluding the last element */
			return isSubsetPresent(set, n - 1, sum)
					|| isSubsetPresent(set, n - 1, sum - set[n - 1]);
		}

	}

	public static void main(String[] args) {
		int arr[]= {4, 3, 5, 2};
		int n=13;
		System.out.println(isSubsetPresent(arr, arr.length, n));
	}
}
