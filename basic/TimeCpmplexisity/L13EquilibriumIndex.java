package TimeCpmplexisity;

public class L13EquilibriumIndex {
	public static int arrayEquilibriumIndex(int[] str){ 
	//	int n = arr.length;
	//  int i ,j;
		//		int leftsum, rightsum;
		//
		//		/* Check for indexes one by one until
		//		an equilibrium index is found */
		//		for (i = 0; i < n; ++i) {
		//
		//			/* get left sum */
		//			leftsum = 0;
		//			for (j = 0; j < i; j++)
		//				{leftsum += arr[j];}
		//
		//			/* get right sum */
		//			rightsum = 0;
		//			for (j = i + 1; j < n; j++)
		//				{rightsum += arr[j];}
		//
		//			/* if leftsum and rightsum are same,
		//			then we are done */
		//			if (leftsum == rightsum)
		//				{System.out.println(i);
		//				return i;}
		//		}
		//
		//		/* return -1 if no equilibrium index is found */
		//		System.out.println(-1);
		//		return -1;
		//	}
		// niche ka sir ka code hai i am trying but run nahi ho raha ; 
//		int i=0 , Rsum = 0 , Lsum=0;
//		 while(i<=arr.length) {
//			 Rsum=Rsum+arr[i];
//			 i++;
//			 System.out.println(Rsum);
//			 }
//		 int j=0;
//		 while(j<n) {
//			 Rsum=Rsum-arr[j];
//			 System.out.println(Rsum);
//			if (Lsum==Rsum) {
//				return j;
//			}
//			Lsum=Lsum-arr[j];
//			j+=1;
//		 } return -1;
//		 
//		 }
// Niche Maine kiya hu hai better ans easy , time complexity acchi hai 
		//public static int arrayEquilibriumIndex(int[] str){  
			int Lsum=0,Rsum=0;
			for (int i =0 ; i<str.length;i++) {
				Rsum=Rsum+str[i];
			}for (int i =0 ; i<str.length;i++) {
				Rsum=Rsum-str[i];
				if (i>0) {Lsum=Lsum+str[i-1];}
				if (Lsum==Rsum) {
					System.out.println(i);
					return i;
				}
			}return -1;
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] input = {1, 4, 9, 3, 2};
			//int [] intpt = {8, 0, 9};
			arrayEquilibriumIndex( input);	
			//System.out.println(b);
			//		 for (int i = 1; i < input.length; ++i) {
			//			 System.out.println(input[i]);}
		}


	}
