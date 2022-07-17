package Arrays;

public class L9HomeWorkCheakArrayRotation {
	 public static int arrayRotateCheck(int[] arr){
		 int n =arr.length;
		 int count = 0;
		 int min= arr[count];
		 if(n==0) {
			 return 0;
		 }
		 else {
			 for (int i=0;i<n;i++) {
				 if(min>arr[i]) {
					 min=arr[i];
					 count = i;
				 }
			 }
		 }
		 return count;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
