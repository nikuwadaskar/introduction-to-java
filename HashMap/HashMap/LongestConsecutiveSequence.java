package HashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class LongestConsecutiveSequence {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		HashMap<Integer, Integer> lenMap = new HashMap<>();
		for (int i=0;i<arr.length;i++)
		{
			map.put(arr[i],true);
		}
		int maxStart=-1,maxLen=0;
		//        boolean startCheck=true;

		for (int i: arr)
		{
			if (map.get(i))
			{
				int currStart=i,currLen=1;
				//System.out.println("Current start of sequence: "+currStart);
				//System.out.println("Current length of sequence: "+currLen);
				boolean flag=true;
				map.put(i,false);

				int ahead=i+1;
				//System.out.println("Checking for values ahead");
				//System.out.println();
				while(flag)
				{
					if(map.containsKey(ahead))
					{
						//System.out.println(ahead+" is included in sequence and status updates to false");
						currLen=currLen+1;
						map.put(ahead,false);
						ahead=ahead+1;
						//System.out.println("Current length of sequence: "+currLen);
					}
					else
					{
						flag=false;   
					}
				}
				flag=true; 
				int before=i-1;
				//System.out.println();
				//System.out.println("Checking for values before");
				while(flag)
				{
					if(map.containsKey(before))
					{
						//System.out.println(before+" is included in sequence and status updates to false");
						currLen=currLen+1;
						currStart=before;
						map.put(before,false);
						before=before-1;
						//System.out.println("Current length of sequence: "+currLen);
					}
					else
					{
						flag=false;   
					}
				}

				System.out.println();
				if (currLen>=maxLen)
				{
					maxLen=currLen;
					maxStart=currStart;   
					lenMap.put(maxStart,maxLen); 
				}
			}
			/*
            else
            {
                System.out.println("Element already considered in previous sequence");
            }
            System.out.println();
			 */
		}

		//System.out.println("Current start point and length: "+ maxStart+", "+maxLen);
		/*
        for (Integer i: lenMap.keySet())
        {
            System.out.println(i+": "+lenMap.get(i));
        }
        System.out.println();
		 */


		for (int i=0;i<arr.length;i++)
		{
			if (lenMap.containsKey(arr[i]) && lenMap.get(arr[i])>=maxLen)
			{
				maxStart=arr[i];
				maxLen=lenMap.get(arr[i]);
				break;
			}
		}
		output.add(maxStart);
		output.add(maxStart+maxLen-1);
		return output;
	}



	public static ArrayList<Integer> longestConsecutiveIncreasingSequence1(int[] arr) {
		Map <Integer, Boolean> visitedElements = new HashMap<>();
		Map <Integer, Integer> elementToIndexMapping = new HashMap<>();
		for (int i = 0; i < arr. length; i++) {
			int num= arr[i];
			elementToIndexMapping.put(num, i);
			if(!visitedElements.containsKey(num)) {
				visitedElements.put(num, false) ;
			}
		}
		ArrayList<Integer> longestSequence = new ArrayList<>();
		int globalMaxSequencelength = 1;
		int globalMinStartIndex = 0;
		for (int i = 0; i < arr.length; i++){
			int num = arr[i];
			int currentMinStartIndex = i;
			int count = 0;
			int tempNum = num;
			//Forward
			while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
				visitedElements.put (tempNum, true); //Mark Visited element in the array as visited

				count++;
				tempNum++;
			}
			//Backward
			tempNum= num-1;
			while(visitedElements.containsKey(tempNum) && !visitedElements.get ( tempNum)){
				visitedElements.put( tempNum, true); //Mark Visited elements in the array as true
				count++;
				currentMinStartIndex = elementToIndexMapping.get(tempNum);
				tempNum--;
			}
			if(count >globalMaxSequencelength) {
				globalMaxSequencelength = count;
				globalMinStartIndex = currentMinStartIndex;
			}else if(count == globalMaxSequencelength) {
				if(currentMinStartIndex < globalMinStartIndex) {
					globalMinStartIndex = currentMinStartIndex;
				}
			}
		}
		int globalStartNum = arr[globalMinStartIndex];
		longestSequence.add(globalStartNum);
		if(globalMaxSequencelength>1){
			longestSequence. add (globalStartNum + globalMaxSequencelength-1);

		}
		return longestSequence;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {15 ,24 ,23 ,12 ,19 ,11 ,16};
		ArrayList<Integer> arr1=longestConsecutiveIncreasingSequence1(arr);

		for(int i =0; i<arr1.size();i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
