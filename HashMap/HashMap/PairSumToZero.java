package HashMap;
import java.util.*;
public class PairSumToZero {
	public static void PairSum(int[] input, int size) {
		if (size==0)
			System.out.println(0);

		HashMap<Integer,Integer> map = new HashMap<>();
		for(int key:input)
		{	
			if(map.containsKey(key))
			{
				map.put(key,map.get(key)+1);
			}
			else
			{
				map.put(key,1);
			}   
		}
		/*
	        for (Integer i: map.keySet())
	        {
	            System.out.println(i + ": " + map.get(i));
	        }
	        System.out.println();
		 */
		int countPairs=0;
		for (Integer i: map.keySet())
		{
			if (map.containsKey(-i) && i!=0)
			{
				//System.out.println("Found the negative of " + i);
				countPairs=countPairs+(map.get(i)*map.get(-i));   
				//System.out.println("Current count of pairs: "+countPairs);
				//map.remove(i);
			}
			//System.out.println();
		}
		countPairs=countPairs/2;
		if (map.containsKey(0))
		{
			int val=map.get(0);
			countPairs=countPairs+(val*(val-1))/2;
		}
		//	        return countPairs;
		System.out.println(countPairs);

	}


	public static int PairSum2(int[] input, int size) {
		HashMap <Integer, Integer> h = new HashMap< Integer, Integer> ();
		int finalCount=0;
		for(int i=0; i<size; i++){
			int key = input[i];
			if(h.containsKey(key) ) {
				int value = h.get(key);
				h.put (key, value+1);}
			else{
				h.put(key, 1);//incrementing frequency value by 1 if key is already present in hashmap
			}
		}
		//traversing the array and checking if -key is present in hashmap
		for (int i=0; i < size; i++) {
			int key = input[i];
			if(h.containsKey(- key) && h.get (key) !=0) {
				int times;
				if (key == (-key) ){ //True in case of zero
					int occurences = h.get(key);
					times = (occurences * (occurences - 1)) / 2;
					finalCount = finalCount+times;
					h.put (key, 0);
					continue;
				}
				times = h.get (key) * h.get(-key);
				finalCount = finalCount+times;
				h.put(key,0);
				h.put(-key,0);
			}
		} return finalCount;
	}


	public static void main(String[] args) {
		int [] arr= {2 ,1 ,-2 ,2 ,3};
		PairSum(arr,arr.length);
	}

}
