package HashMap;
import java.util.*;
public class LongestSubsetToZero {
	
	
	//	this is better

	public static int lengthOfLongestSubsetWithZeroSum1(int arr[]) {
		// Write your code here
		HashMap<Integer,Integer> map = new HashMap<>();
		int n =arr.length;
		for (int i = 0; i < n; i++) {
			arr[i]+=arr[i-1];
		}
		int len=0;
		for (int i = 0; i < n; i++) {
			if (arr[i]==0) {
				if (len<i+1) {
					len=i+1;
				}
			}
			else if (map.containsKey(arr[i])) {
				if (len<i-map.get(arr[i])) {
					len=i-map.get(arr[i]);
				}
			}else {
				map.put(arr[i], i);
			}
		}
		return len;
	}


	//public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
		HashMap<Integer,Integer> map = new HashMap<>();
		int sum=0,maxLen=-1;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			//System.out.println("Current cumulative sum: "+sum);
			if (sum==0)
			{
				maxLen=i+1;
			}
			if (map.containsKey(sum))
			{
				int prevIndex=map.get(sum);
				//System.out.println("Sum found previously at index: "+prevIndex);
				int currLen=i-prevIndex;
				//System.out.println("Length of 0 sum: "+currLen);
				if (currLen>maxLen)
				{
					maxLen=currLen;
					//System.out.println("Max Length of 0 sum: "+maxLen);
				}
			}
			else
			{
				//System.out.println("Adding sum to HashMap");
				map.put(sum,i);
			}
			//System.out.println();
		}
		return maxLen;
	}
	public static void main(String[] args) {


	}

}
