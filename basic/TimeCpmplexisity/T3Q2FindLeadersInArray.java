package TimeCpmplexisity;

public class T3Q2FindLeadersInArray {
	public static void leaderprint(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                if (arr[i] < arr[j])
                {
                    break;
                }
	
                if (j == n - 1)
                    System.out.println(arr[i]);
            }
        }
    }
// rivision ke time likha iski time complecity acchi hai 
//	public static void leaders(int[] arr) {
//		int max =Integer.MIN_VALUE;
//		for (int k=arr.length-1;k>0;k--) {
//			if (arr[k]>=max)		
//			{System.out.println(arr[k]);
//			max=arr[k];}
//	}
//}
	 public static void main (String[] args)
	    {
	        int arr[] = { 7, 8, 4, 5, 0, 1 };
	        int n = arr.length;
			
	        // calling function
	        leaderprint(arr, n);
	    }
	}
