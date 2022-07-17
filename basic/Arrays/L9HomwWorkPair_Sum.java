package Arrays;

public class L9HomwWorkPair_Sum {
	public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int k=0;
		for(int i = 0; i < arr.length; i++) {  
	        for(int j = i + 1; j < arr.length; j++) {  
	            if(arr[i] + arr[j]==x) { 
	                  k++;
	            
	        }  
	    } 
	} return  k;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
