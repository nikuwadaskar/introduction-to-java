package Arrays;

public class L9HomeWorkRotateArray {
	public static void rotate(int[] arr, int d) {
		 int n=arr.length;
		 int temp[]=new int[d];
		 for (int i=0;i<d;i++) {
			 temp[i]= arr[i];
		 }
		 for (int i = d;i<n;i++) {
			 arr[i-d]=arr[i];
		 }
		 for (int i =0; i<d;i++) {
			 arr[i-n+d]=temp[i];
		 }
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
