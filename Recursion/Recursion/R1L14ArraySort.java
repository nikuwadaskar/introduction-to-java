package Recursion;

public class R1L14ArraySort {
	//	public static boolean isArraySort(int a[]) {
	//		if (a.length==1) {
	//			return true;
	//		}if(a[0]>a[1]) {
	//			return false;
	//		}
	//		int []small= new int[a.length-1];
	//		for (int i=1;i<a.length;i++) {
	//			small[i-1]=a[i];
	//		}
	//		boolean isSmallSorted = isArraySort(small);
	//		return isSmallSorted;
	//	}

	// METHOD TWO WITH START INDEX is is better and simple
	public static boolean isArraySort(int a[], int si) {
		if (si==a.length-1) {
			return true;
		}if(a[si]>a[si+1]) {
			return false;
		}boolean isSmallSorted = isArraySort(a,si+1);
				return isSmallSorted;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6,7,8};
		System.out.println(isArraySort(a,1));

	}

}
