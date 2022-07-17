package TimeCpmplexisity;

import java.util.Arrays;

public class L13ArrayInetersection_SOrtANdThenINtersect {
	public static void intersection(int[] arr1, int[] arr2) {
		//its taking lesser time but ye GforG ka code se merg kiya hai 
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		{	int m=arr1.length,n = arr2.length;
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr1[i])
				j++;
			else {
				System.out.print(arr2[j++] + " ");
				i++;
			}
		}
		}
	}
	
	
	
// this code i made by merging the code that i have wriiten my self but its taking mare time 
//	public static void intersection(int[] arr1, int[] arr2) {
//		arr1 = insertionSort(arr1);
//		arr2 = insertionSort(arr2);
//		{	for(int i = 0; i < arr1.length; i++) {
//			for(int j = 0; j < arr2.length; j++) {
//becoz maine i and j ke liye aalag alag loop chalaye thats why its taking time 
//				if(arr1[i] == arr2[j]) {
//					System.out.print(arr2[j]+" ");  
//					arr2[j]=Integer.MIN_VALUE ;
//					break;
//				}
//			}
//		}System.out.println();
//	}
//	}
//	public static int[] insertionSort(int[] arr){
//		int n =arr.length;
//		for (int i =0 ; i<n;i++) {
//			int j = i-1;
//			int temp = arr[i];
//			while (j>=0&&arr[j]>temp) {
//				arr[j+1]=arr[j];
//				j--;
//			}
//			arr[j+1]=temp;
//		} return arr;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] input = {1, 5, 8, 0, 9};
//		int [] intpt = {8, 0, 9};
//		intersection( input,intpt);	
//
//	}
//
}