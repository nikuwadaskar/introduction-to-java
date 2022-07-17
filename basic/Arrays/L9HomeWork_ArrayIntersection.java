package Arrays;
import java.util.Scanner;
public class L9HomeWork_ArrayIntersection {
	public static void intersections(int arr1[], int arr2[]) {
		//Your code goes here
		//this will take more time bcoz it takes two loop 
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr2[j]+" ");  
					arr2[j]=Integer.MIN_VALUE ;
					break;

					//return arr2[j];
				}
			}
		}System.out.println();
	}
//	public static void intersection(int[] arr1, int[] arr2) {
//		//its taking lesser time but ye GforG ka code se merg kiya hai
//		//this will take less time bcoz it takes only one loop 
//		{	int m=arr1.length,n = arr2.length;
//		int i = 0, j = 0;
//		while (i < m && j < n) {
//			if (arr1[i] < arr2[j])
//				i++;
//			else if (arr2[j] < arr1[i])
//				j++;
//			else {
//				System.out.print(arr2[j++] + " ");
//				i++;
//			}
//		}
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
