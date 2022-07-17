package Arrays;
import java.util.Scanner;
public class L9Premitives_andNon_Premitives {
		public static void increement(int i) {
			i++;
			System.out.println(i);
		}
	
	//	public static void main(String[] args) {
	//		int i = 10;
	//		increement(i);
	//		System.out.println(i);
	//
	//	}
		public static int [] increementArr(int[] input) {
			System.out.println(input);
			//System.out.println(input);// from this you can say value of arrays are not getting copied only the references are copied
			 input = new int [7];
			 System.out.println(input);
			for(int i=0;i<input.length;i++){
				input[i]= input[i]+1;
			}return input;
		}
	public static void print(int [] arr) {
		int n =arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,4,23,2,5,6};
		System.out.println(arr);
		arr = increementArr(arr);
		print(arr);
		
	}
}
