package HashMap;

import java.util.HashMap;

public class PairWithDiffrenceK {
	// this is much better
	public static int getPairsWithDifferenceK1(int arr[], int k) {
		//Write your code here
		HashMap<Integer,Integer> map = new HashMap<>();
		int paircount =0;
		for(int i :arr){
			int p1=i+k;
			boolean flag =false;
			if (i==p1) {
				flag=true;
			}
			if (map.containsKey(p1)) {
				paircount+=map.get(p1);

			}
			int p2=i-k;
			if (map.containsKey(p2)&&!flag) {
				paircount+=map.get(p2);
			}if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		return paircount;
	}


	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int key:arr)
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
		if (k==0)
		{
			for (Integer i: map.keySet())
			{
				int val=map.get(i);
				countPairs=countPairs+(val*(val-1))/2;
			}
			return countPairs;
		}

		for (Integer i: map.keySet())
		{
			//System.out.println("Current element: "+i);
			//System.out.println("Need to find: "+(i-k)+", "+(i+k));
			if (map.containsKey(k+i))
			{
				//System.out.println("Found " + (k+i));
				countPairs=countPairs+(map.get(i)*map.get(k+i));   
				//System.out.println("Current count of pairs: "+countPairs);
			}
			if (map.containsKey(i-k))
			{
				//System.out.println("Found " + (i-k));
				countPairs=countPairs+(map.get(i)*map.get(i-k));   
				//System.out.println("Current count of pairs: "+countPairs);
			}
			//System.out.println();
		}
		countPairs=countPairs/2;
		return countPairs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
