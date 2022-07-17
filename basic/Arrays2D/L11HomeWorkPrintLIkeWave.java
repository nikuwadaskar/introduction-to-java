package Arrays2D;

public class L11HomeWorkPrintLIkeWave {
	public static void wavePrint(int mat[][]){
		 for(int i=0;i<mat[0].length;i++) {
				//int sum=0;
			// System.out.println(mat.length);
			 if (i%2==0 || i==0) {
			 for (int j=0;j<mat.length;j++) {
				 System.out.print(mat[j][i]+" ");
					//sum=sum+mat[j][i];
				}}
			 else{for (int j=mat.length-1;j>=0;j--) {
	                System.out.print(mat[j][i]+" ");
	               // System.out.println(mat.length);
					//sum=sum+mat[j][i];
	            }}
	}
	}

	public static void main(String[] args) 
	{  int arr[][]={ {1,2,3,4} , {2,4,6,7} , {3,5,7,8} };
	wavePrint(arr);


}}
