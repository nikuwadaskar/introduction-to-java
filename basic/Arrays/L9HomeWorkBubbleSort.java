package Arrays;
//space cpmplixity is big O of (1)
public class L9HomeWorkBubbleSort {
	public static void selectionSort(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n-1;i++){
	        //Insert element at ith position
	        for(int j=0;j<n-1-i;j++){// i daalo ya matt daalo same hi ans milega 
	            //Finding the minimum element among j positions
	            if(arr[j]>arr[j+1]){
	            	int temp=arr[j];
	    	        arr[j]=arr[j+1];
	    	        arr[j+1]=temp;
	            }
	        }
	        //Swap element at minIndex with the ith element
//	        int temp=arr[minIndex];
//	        arr[minIndex]=arr[i];
//	        arr[i]=temp;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
