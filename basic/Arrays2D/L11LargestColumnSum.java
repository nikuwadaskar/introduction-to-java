package Arrays2D;

public class L11LargestColumnSum {
	public static void rowWiseSum(int[][] mat) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i< mat.length;i++) {
			int sum=0;
			int n = mat[i].length;
			
			for (int j=0;j<n;j++) {
				sum=sum+mat[i][j];
			}if(sum>largest){
	            largest=sum;
	        }
			System.out.println(sum+" ");
		//	System.out.println(largest);
		}	System.out.println();
		System.out.println(largest);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2d={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		rowWiseSum(arr2d);

	}

}
