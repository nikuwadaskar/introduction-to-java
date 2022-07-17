package Tests;

public class T4Q1Print2DArrayIDcreasingOrder {
		public static void main(String[] args) {
	// ye ek case me fail ho raha hai 
			int arr[][]= {{1,2,3},{1,2,1}};
			int k=0;
			int j =0;
			while(j<arr.length) {
				while (k<arr.length-j) {
					for (int i =0; i<arr[0].length;i++) {
						System.out.print(arr[j][i]+" ");
					}k++;
					System.out.println();
				}k=0;
				j++;}
	
		}
	//	
	// ye unka solution hai .,
//	public static void main(String[] args) {
//		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int k = arr.length;
//		for(int i =0;i<arr.length;i++) {
//			for (int l=k-1;l>=0;l--) {
//				for(int j =0;j<arr.length;j++) {
//					System.out.print(arr[i][j]+" ");
//				}System.out.println();
//			}k--;
//		}
//	}
}
