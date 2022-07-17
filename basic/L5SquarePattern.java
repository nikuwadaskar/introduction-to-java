import java.util.Scanner;
public class L5SquarePattern {

	 public static void main(String[] args) {
			// Write your code here
	         Scanner s= new Scanner (System.in);
		        int k;
				k= s.nextInt();
				int m = s.nextInt();
				int [] nums = new int [k];
				for (int h= 0;h<k;h++) {
					nums [k]= s.nextInt();
				}
	         int n = nums.length;
	        if (n == 0) {
	            System.out.println(0);
	        }

	        int[] dp = new int[n];
	        dp[0] = nums[0];

	        for (int i = 1; i < n; i++) {
	            dp[i] = Math.max(nums[i], Math.max(dp[i-1] + nums[i], nums[i-1] + nums[i]));
	        }

	        int max = Integer.MIN_VALUE;
	        for(int i = 0; i < dp.length; i++) {
	            if(dp[i] > max) {
	                max = dp[i];
	            }
	        }
	        System.out.println(max);
	    }
	    }
