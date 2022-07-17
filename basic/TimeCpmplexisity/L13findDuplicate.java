package TimeCpmplexisity;

public class L13findDuplicate {
	public static int findDuplicate(int[] arr) {
		arr= insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {  
	            if(arr[i] == arr[i+1]) { 
	              //  System.out.println(arr[j]);  
	                return arr[i];
	        }
	            //System.out.print(arr[i]);
	    } return  0;
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
		} return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
