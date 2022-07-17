package Arrays;

public class L9HomeWorkInsertionSort {
	public static int[] insertionSort(int[] arr){
		int n =arr.length;
		for (int i =0 ; i<n;i++) {
			int j = i-1;
			int temp = arr[i];
			while (j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			//Position will be j+1;
			arr[j+1]=temp;
		} return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 5, 8, 6, 0, 9, 6};
		int kal []= insertionSort(input);
		for (int i= 0 ; i<kal.length;i++) {
			System.out.println();
		}
	}

}
