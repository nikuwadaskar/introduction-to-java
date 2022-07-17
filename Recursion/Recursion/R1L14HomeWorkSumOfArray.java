package Recursion;

public class R1L14HomeWorkSumOfArray {
	public static int sum(int input[]) {
		if (input.length==0) {
			return 0;
		}
		int []small= new int[input.length-1];
		for (int i=1;i<input.length;i++) {
			small[i-1]=input[i];
		}
		return input[0]+sum(small);
	}  

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sum(arr));
	}
}
