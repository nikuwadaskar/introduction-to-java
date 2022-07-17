package Arrays;

public class L9HomeWorkSumOfTwoArrays {
	 public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
	    	//Your code goes here
		 int i=arr1.length-1;
		 int j =arr2.length-1;
		 int carry= 0;
		 int k =Math.max(arr1.length, arr2.length);
		 while (i>=0 && j>=0) {
			 int sum=(arr1[i]+arr2[j])+carry;
			 output[k]=sum%10;
			 carry=sum/10;
			 i--;
			 j--;
			 k--;
		 }
		 while(i>=0) {
			 int sum=(arr1[i]+carry);
			 output[k]=sum%10;
			 carry=sum/10;
			 i--;
			// j--;
			 k--;
		 }while(j>=0) {
			 int sum=arr2[j]+carry;
			 output[k]=sum%10;
			 carry=sum/10;
			// i--;
			 j--;
			 k--;
		 } output[0]=carry;
		 }
	 
//	 public static void sumOfTwoArrays(int arr1[], int arr2[]) {
//			int n = Math.max(arr1.length, arr2.length );
//			int arr[];
//			// ek loop me possible nahi hai cause 
//			//jab ek badaaur dusara chota rahata hai to out of bound of given array chala jaata hai
//			// and more over out put array kitne veriable ka hoga ye decide karana mushkil hai
//			// like for each type you have to choos diff diff length array
//			int carry =0;
//			int digit=0;
//			for (int i=n-1;i>=0;i-- ) {
//				int sum= arr1[i]+arr2[i]+carry;
//				carry=0;
//				System.out.println(sum);
//				if (sum>9) {
//					digit =sum%10;
//					arr[i]=digit;
//					carry=carry+sum/10;
//				}else {arr[i]=sum;}
//			} for(int i =0;i<arr.length;i++) {
//				System.out.print(arr[i]);
//			} 
//		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
