package Arrays;

public class L9HomeWorkSelectionSort {
	public static void printArray(int[]arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	public static void selectionSort(int[] arr){
		int n = arr.length;
		for (int i =0 ; i<n-1;i++) {
			int min =Integer.MAX_VALUE;
			int minI=-1;
			for (int j = i+1; j<n;j++) {
				if(min>arr[j]) {
					min=arr[j];
					minI=j;
				}
			}int temp = arr[minI];
			arr[minI]=arr[i];
			arr[i]=temp;

		}

	}


	public static void main(String args[]) {
		int[] arr={1,6,4,8,0,3};
		selectionSort(arr);
		printArray(arr);
	}


}
