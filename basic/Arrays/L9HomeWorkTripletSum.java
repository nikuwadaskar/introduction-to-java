package Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class L9HomeWorkTripletSum {
	 public static int findTriplet(int[] arr, int x) {
		 int k=0;
			for(int i = 0; i < arr.length; i++) {  
		        for(int j = i + 1; j < arr.length; j++) {
		        	for(int l = j + 1; l < arr.length; l++) { 
		            if(arr[i] + arr[j]+arr[l]==x) { 
		                  k++;
		            
		        }  
		    } 
		} 
	    }return  k;
	 }
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    public static int[] takeInput() throws IOException {
	        int size = Integer.parseInt(br.readLine().trim());
	        int[] input = new int[size];

	        if (size == 0) {
	            return input;
	        }
	        
	        String[] strNums; 
	        strNums = br.readLine().split("\\s");
	        

	        for (int i = 0; i < size; ++i) {
	            input[i] = Integer.parseInt(strNums[i]);
	        }

	        return input;
	    }


	    public static void main(String[] args) throws NumberFormatException, IOException {
	        int t = Integer.parseInt(br.readLine().trim());

	        while(t > 0) {

	            int[] input = takeInput();
	            int x = Integer.parseInt(br.readLine().trim());
	            System.out.println(L9HomeWorkTripletSum.findTriplet(input, x));

	            t -= 1;
	        }
	    }
	}


