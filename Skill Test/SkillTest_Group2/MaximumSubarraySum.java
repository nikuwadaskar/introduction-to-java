package SkillTest_Group2;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long a= maxSubArraySum(arr);
		if(a<0) {
			return 0;
		}
		return a;
	}
	static long maxSubArraySum(int a[])
	{
		int size = a.length;
		long max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++)
		{
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}


}
