package Arrays2D;

public class L11ArrayTotalSumontheBoundariesandDiagonals {
	public static void totalSum(int[][] arr) {
		//Your code goes here
		int requiredSum = 0;
		int N=arr.length;
		// Traverse arr[][]
		// Loop from i to N-1 for rows
		for (int i = 0; i < N; i++) {

			// Loop from j = N-1 for columns
			for (int j = 0; j < N; j++) {

				// Condition for diagonal
				// elements
				if (i == j || (i + j) == N - 1) {
					requiredSum += arr[i][j];
				}

				// Condition for Boundary
				// elements
				else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) {
					requiredSum += arr[i][j];
				}
			}
		}

		// Print the final Sum
		System.out.println(requiredSum);
	}
// this niche wala i made it it will print the boundry and the digonals
//	int m =mat.length*mat[0].length;
//	while (m>0) {
//		for (int i=0; i<mat.length;i++) {
//			for (int j=0; j<mat.length;j++) {
//				if (i==0|| i==mat.length-1|| j==0||j==mat.length-1) {
//					System.out.print(mat[i][j]+" ");
//					m--;
//				}
//				else if (i+j==mat.length-1||i==j){
//					System.out.print(mat[i][j]+" ");
//					m--;
//				}m--;
//			}
//		}
//	}
//	
//}

public static void main(String[] args) {
	 int arr[][]={ {1,2,3,4} , {2,4,6,7} , {3,5,7,8} };
	totalSum(arr);
	}
}


