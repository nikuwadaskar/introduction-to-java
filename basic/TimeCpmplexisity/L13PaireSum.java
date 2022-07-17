package TimeCpmplexisity;

public class L13PaireSum {
	public static int pairSum(int[] arr, int x) {
		insertionSort(arr);
//		for (int i = 0; i < arr.length; ++i) {
//			System.out.print(arr[i]);
//		}
		int k=0;
		int i =0;
		int j =1;
		int l = 2;
		while (i < arr.length) {  

			if(arr[i] + arr[j]+arr[l]==x) { 
				
				k++;
				//System.out.println(k);
				i++;
				continue;

			}
			else if (arr[i] + arr[j]+arr[l]<x) {
				l++;
				continue;
			}
			else if  (arr[i] + arr[j]+arr[l]>x) {
				System.out.println(k);
				return k;
			} //System.out.println(k);
		} return k; 
	} 


	public static int[] insertionSort(int[] arr){
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int temp = arr[i];
			int j = i - 1;

			/* Move elements of arr[0..i-1], that are
           greater than key, to one position ahead
           of their current position */
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
			
		} 
		return arr;
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] input = {0, 9, 3, 4, 1, 2, 1, 6, 7, 8, 9};
	pairSum( input , 3);
}
}

