package Arrays;

public class L9Introduction_To_Arrays {
	public static void main(String[] args) {
		int arr[] = new int[10];
		arr[0]=5;
		arr[5]=17;
		//arr[-1]=9;// not allowed only for 0 to 9 (n-1)
		System.out.println(arr[0]+" "+arr[5]+" "+arr[3]+" "+arr[8]);// if you have not initialize then the value is consider as zero for int
		double rr[] = new double[10];
		char Arr[] = new char[10];
		System.out.println(rr[0]);
		System.out.println(Arr[0]);//we are getting null character
		System.out.println(rr);// by this you can understand how arr store the refrance number and not values after @ and D means double
	}
}
