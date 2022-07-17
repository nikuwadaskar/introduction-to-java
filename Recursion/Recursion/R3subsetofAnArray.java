package Recursion;


public class R3subsetofAnArray {


	public static int [][] subsetsHelper (int [] input , int startIndex){
		if(startIndex==input.length) {
			int [][] output = new int [1][0];
			return output;	
		}
		int [][] smallerOutput= subsetsHelper(input, startIndex+1);
		int [][] output = new int [2*smallerOutput.length][];

		int k =0;
		for(int i =0;i<smallerOutput.length;i++) {
			output[k]= new int [smallerOutput[i].length];
			for (int j=0;j<smallerOutput[i].length;j++) {
				output[k][j]= smallerOutput[i][j];
			}
			k++;
		}
		for (int i = 0; i < smallerOutput.length; i++) {
			output[k]= new int [smallerOutput[i].length+1];
			output[k][0]= input[startIndex];
			for (int j = 1; j <= smallerOutput[i].length; j++) {
				output[k][j]= smallerOutput[i][j-1];
			}
			k++;
		}
		return output;
	}


	public static int [][] subset(int input []){
		return subsetsHelper(input, 0);

	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int[][] a = subset(arr);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}System.out.println();


		}
	}
}
