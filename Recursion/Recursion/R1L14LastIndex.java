package Recursion;

public class R1L14LastIndex {

	// mai kiya ye 
	//	public static int lastIndex(int input[], int x) {
	//	    for (int i=input.length-1;i>0;i--) {
	//			if (input[i]==x) {
	//				 return i;}
	//			}return -1;
	//		}
	public static int lastIndex(int a[],int x){
		if(a.length==0){
			return -1;
		}
		int smallArray[]=new int[a.length-1];
		for(int i=1;i<a.length;i++){
			smallArray[i-1]=a[i];
		}
		int k=lastIndex(smallArray,x);
		if(k!=-1){
			return k+1;
		}else{
			if(a[0]==x){
				return 0;
			}else{
				return -1;
			}
		}
	}
	 public static int lastIndexUSINGSI(int a[], int x) {
	        return lastIndexBetter(a,x,0);
	    }
	public static int lastIndexBetter(int a[],int x,int si){
		if(si==a.length){
			return -1;
		}
		int k=lastIndexBetter(a,x,si+1);
		if(k!=-1){
			return k;
		}else{
			if(a[si]==x){
				return si;
			}else{
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {34, 57, 82, 41, 65, 35, 82, 27, 73};
		System.out.println(lastIndexBetter(a,61,9));

	}

}
