package Arrays2D;

public class L11HomeWorkSumof2Arrays {
	public static void rowWiseSum(int[][] mat) {
	for(int i=0;i< mat.length;i++) {
		int sum=0;
		int n = mat[i].length;
		for (int j=0;j<n;j++) {
			sum=sum+mat[i][j];
		}
		System.out.println(sum+" ");
	}	System.out.println();
	}
// this will give each row sum
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
