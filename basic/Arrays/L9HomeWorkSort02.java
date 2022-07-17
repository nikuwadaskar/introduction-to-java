package Arrays;

public class L9HomeWorkSort02 {
	 public static void sort012(int[] arr){
	    	//Your code goes here
	        int nextZero=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==0){
	            int temp =arr[nextZero];
	            arr[nextZero]=arr[i];
	            arr[i]=temp;
	            nextZero += 1;
	        }
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==1){
	            int temp =arr[nextZero];
	            arr[nextZero]=arr[i];
	            arr[i]=temp;
	            nextZero += 1;
	        }
	    }
	    }
	 
	 //this is kind of optimum solution maine 75% socha baaki help li
//	 public static void sort012(int[] arr){
//		 int nextZero=0,L2=arr.length-1,i=0;
//	       while (i<=L2) {
//	            if(arr[i]==0){
//	                int temp =arr[nextZero];
//	                arr[nextZero]=arr[i];
//	                arr[i]=temp;
//	                nextZero++;
//	                i++;
//	            }else if(arr[i]==2) {
//	            	int temp=arr[L2];
//	            	arr[L2]=arr[i];
//	            	arr[i]=temp;
//	            	L2--;
//	            }else {i++;}
//	            
//	       }
//	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
