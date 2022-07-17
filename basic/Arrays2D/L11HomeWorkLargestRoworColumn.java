package Arrays2D;

public class L11HomeWorkLargestRoworColumn {// this shit is working like champ
	public static void findLargest(int mat[][]){
		//Your code goes here
		int largest1=Integer.MIN_VALUE;
		if ( mat.length>0) {
		int j=0;
		int k =0;
		int l=0;
		for(int i=0;i< mat.length;i++) {
			int sum=0;
			int n = mat[i].length;

			for (j=0;j<n;j++) {
				sum=sum+mat[i][j];
			if(sum>largest1){
				largest1=sum;
				 l=j;
			}}
		//System.out.println(largest1);
		}
		int largest2=Integer.MIN_VALUE;
	for(int i=0;i<mat[0].length;i++) {
			int sum=0;

			for (j=0;j<mat.length;j++) {
				sum=sum+mat[j][i];
			if(sum>largest2){
				largest2=sum;
				k=j;
			}}
			//System.out.println(largest2);
		}
		//System.out.println(largest);
	if (largest1>largest2) {
		System.out.println("row "+ l +" "+largest1);
	}
	else if(largest1<largest2) {
		System.out.println("column "+k+" "+largest2);
		
	}
	else if (largest1==largest2) {
		if(l>k) {
			System.out.println("column "+k+" "+largest2);
		}
		else if (k>=l) {
			System.out.println("row "+ l +" "+largest1);
		}
	}
	}
		else {System.out.println("row 0 -2147483648");}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2d={{1,2,24,0},{5,6,7,8},{9,10,11,12}};
		findLargest(arr2d);
	}

}
