package Recursion;

public class R3MinofArray {
	public static int findMin(int[]input,int startIndex){
		if(startIndex == input.length){
			return Integer.MAX_VALUE;
		}
		int minSmallArray=findMin(input,startIndex+1);
		if(input[startIndex]<minSmallArray){
			return input[startIndex];
		}else{
			return minSmallArray;
		}
	}


	public static void printMin(int []arr) {

	}

	public static void printMin2(int []arr,int startIndex, int minsofar) {
		if (startIndex==arr.length) {
			System.out.println(minsofar);
			return;
	}
		int newMinimum= minsofar;
		if(arr[startIndex]<minsofar) {
			newMinimum= arr[startIndex];
		}
		printMin2(arr, startIndex+1, newMinimum);

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,2,1,7,8};
//				int min=findMin(arr, 0);
//				System.out.println(min);
		printMin2(arr, 0, Integer.MAX_VALUE);

	}

}
