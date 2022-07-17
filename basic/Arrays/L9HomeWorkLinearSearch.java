package Arrays;
import java.util.Scanner;

public class L9HomeWorkLinearSearch {
	public static int linearSearch(int arr[], int x) {

		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				return i;
			}
		} return -1;
	}
	public static int[] takeInput() {
		Scanner s= new Scanner (System.in);
		int n =s.nextInt();
		int arr[]= new int[n];
		for (int i =0 ; i<n;i++) {
			System.out.println("Enter element at "+i+"th index");
			arr [i]= s.nextInt();
		} return arr;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int x =s.nextInt();
		int arr [] = takeInput();
	int k =	linearSearch(arr,x);
		System.out.println(k);

	}

}
