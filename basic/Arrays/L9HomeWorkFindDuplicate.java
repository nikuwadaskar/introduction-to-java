package Arrays;
import java.util.Scanner;

public class L9HomeWorkFindDuplicate {
	public static int duplicateNumber(int arr[]) {
		for (int i = 0; i < arr.length; i++) {  
	        for(int j = i + 1; j < arr.length; j++) {  
	            if(arr[i] == arr[j]) { 
	              //  System.out.println(arr[j]);  
	                return arr[j];
	            }  
	        } 
	    } return  0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}


