package Recursion;

public class R3PrintSubsetSumToK {

	public static void printSubsetsSumToKhelper(int [] input, int begainIndex ,int [] output,int k) {

		if(begainIndex==input.length) {
			if(k==0) {
				for(int i:output) {
					System.out.print(i+" ");
				}
				System.out.println();
				return ;
			}else {
				return ;
			}
		}
		int [] newOutput= new int [output.length+1];
		int i=0;
		for(;i<output.length;i++) {
			newOutput[i]=output[i];
		}
		newOutput[i]=input[begainIndex];
		printSubsetsSumToKhelper(input, begainIndex+1, output, k);
		printSubsetsSumToKhelper(input, begainIndex+1, newOutput, k-input[begainIndex]);
	}
	
	public static void printSubsetsSumToK(int input[],int k) {
	int output[]=new int [0];
	printSubsetsSumToKhelper(input, 0, output, k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5 ,12 ,3 ,17 ,1 ,18 ,15 ,3 ,17 };
		printSubsetsSumToK(arr, 6);

	}

}
