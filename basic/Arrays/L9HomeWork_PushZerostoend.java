package Arrays;

public class L9HomeWork_PushZerostoend {
	public static void pushZerosAtEnd(int[] arr) {
	int n =arr.length;
	int cout = 0 ;
	for (int i =0;i<n;i++ ) {
		if (arr[i]!=0) {
			arr[cout++]=arr[i];
		}}
		while(cout<n) {
			arr[cout++]=0;
		
	}
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
