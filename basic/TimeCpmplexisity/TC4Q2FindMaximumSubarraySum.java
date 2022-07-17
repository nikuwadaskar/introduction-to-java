package TimeCpmplexisity;
import java.util.Scanner;
public class TC4Q2FindMaximumSubarraySum {

	 public static int maxSum(int arr[], int n, int k)
	    {
	        if (n < k)
	        {
	            System.out.println("Invalid");
	            return -1;
	        }
	        int res = 0;
	        for (int i=0; i<k; i++) {
	            res += arr[i];
	        }int curr_sum = res;
	        for (int i=k; i<n; i++)
	        {
	            curr_sum += arr[i] - arr[i-k];
	            res = Math.max(res, curr_sum);
	        }

	        return res;
	    }
	    public static void main(String[] args)
	    {
	        Scanner s= new Scanner (System.in);
	        int n =s.nextInt();
	        int k =s.nextInt();
	        int arr[]= new int[n];
	        for (int i =0 ; i<n;i++) {
	            arr [i]= s.nextInt();
	        }
	        System.out.println(maxSum(arr, n, k));
	    }
}
