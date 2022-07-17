package Arrays;

public class L9mergingTwoSortedArray {
	public static void printArray(int[]arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	public static int[] merge2SortedArrays(int[] arr1,int[]arr2){
		int m = arr1.length;
		int n = arr2.length;
		int arr3[]=new int [n+m];
		int i =0;
		int j=0;
		int k =0;
		while (i<m && j<n) {
			if (arr1[i]>=arr2[j]) {
				arr3[k]=arr2[j];
				i++;
				j++;
				k++;
			}
			else {arr3[k]=arr1[i];
			i++;
			j++;
			k++;}

		}
		while(i<m) {
			arr3[k]=arr1[i];
			i++;
			//j++;
			k++;
		} 
		while(j<n) {arr3[k]=arr2[j];
		//i++;
		j++;
		k++;}
		return arr3;		
		}



	public static void main(String[] args) {
		int arr1[]={1,4,8,10,13,17};
		int arr2[]={2,3,5,7,9,11,12};
		int arr3[]=merge2SortedArrays(arr1,arr2);
		printArray(arr3);
	}
}