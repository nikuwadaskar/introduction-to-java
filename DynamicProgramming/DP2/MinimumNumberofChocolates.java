package DP2;

public class MinimumNumberofChocolates {
	
	

	public static int getMin(int A[], int N){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		int[] B = new int[N];

		// Distribute 1 chocolate to each
		for (int i = 0; i < N; i++) {
			B[i] = 1;
		}

		// Traverse from left to right
		for (int i = 1; i < N; i++) {
			if (A[i] > A[i - 1])
				B[i] = B[i - 1] + 1;
			else
				B[i] = 1;
		}

		// Traverse from right to left
		for (int i = N - 2; i >= 0; i--) {
			if (A[i] > A[i + 1])
				B[i] = Math.max(B[i + 1] + 1, B[i]);
			else
				B[i] = Math.max(B[i], 1);
		}

		// Initialize sum
		int sum = 0;

		// Find total sum
		for (int i = 0; i < N; i++) {
			sum += B[i];
		}

		// Return sum
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]= {1 ,4, 4 ,6};
//		System.out.println(getMin1(arr, 4));
	}

}
