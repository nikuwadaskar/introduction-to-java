package Arrays;

public class L9HomeWorkSEcondLargest {
	public static void pushZerosAtEnd(int[] arr) {
		int max1 = Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
		for (int i = 1; i<arr.length;i++) {
		if (arr[i]>max1) {
			max1=arr[i];
		}
		}
		for (int i = 1; i<arr.length;i++) {
			if ((arr[i]>max2)&&(arr[i]!=max1)) {
				max2=arr[i];
			}
		
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
