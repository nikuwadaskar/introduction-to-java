package LeetCode;

public class Q15_3summ {

	public static void main(String[] args) {
		int arr[]= {-1,0,1,2,-1,-4};
		int x = 0;
		for(int i = 0; i < arr.length-2; i++) {  
	        for(int j =  i+1; j < arr.length-1; j++) {
	        	for(int l = i+ 2; l < arr.length; l++) { 
	            if(arr[i] + arr[j]+arr[l]==0&&i != j&& i != l && j != l) { 
	                 
	            System.out.println("["+arr[i]+","+arr[j]+","+arr[l]+"]");
	        }  
	    } 
	} 
    }

}
}
