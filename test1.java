package skilltest;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


import java.util.Scanner;

public class Pattern30
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("* Printing the pattern... *");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                if (j % 2 == 0)
                    System.out.print((rows * (j)) + i + 1 + " ");
                else
                    System.out.print((rows * (j + 1)) - i + " ");
            }
            System.out.print("\n");
        }
    }
}

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

	    static int maxSubArraySum(int a[])
	    {
	        int n = a.length;
	        int maxValue = Integer.MIN_VALUE, max_ending_here = 0;
	 
	        for (int i = 0; i < n; i++)
	        {
	            max_ending_here = max_ending_here + a[i];
	            
	            if (maxValue < max_ending_here) {
	            	maxValue = max_ending_here;
	            }
	            
	            if (max_ending_here < 0) {
	            	max_ending_here = 0;
	            }
	        }
	        return maxValue;
	    }
	    
	    public static void main (String[] args)
	    {
	    	Scanner s = new Scanner(System.in);
	    	
	    	int N = s.nextInt();
	    	
	    	int[] a = new int[N]; 
	    	
	    	for(int i=0; i<N; i++){
	    		a[i] = s.nextInt();  
	    	}  
	        System.out.println(maxSubArraySum(a));
	    }
	}

/////
one strings
int res = 0, count = 0;
for(int i = 0; i < str.length(); i++)
{
    count = str.charAt(i) == '1' ? count + 1 : 0;
    res = (res + count);
}
return res;

////
flag
if(N==1 || N==2) {
	return 2;
}
long ans = find_Ways(N-1)+find_Ways(N-2);

return ans;


//////

//super power
import java.util.Scanner;
public class Solution {

       public static int superPow(int a, int[] b) {
        a = a % 1337; 
        if (a <= 1) return a;
        
        Map<Integer, Integer> map = new HashMap<>();  // power of a -> a^power mod 1337
        Set<Integer> set = new HashSet<>();  // for O(1) search of existing value in the map
		
        int val = a, power = 1;
        while (! set.contains(val)) {
            map.put(power, val);
            set.add(val);
            val = (val * a) % 1337;
            power++;
        }
        
        int reminder = 0;
        for (int i = 0; i < b.length; i++) {
            reminder = (reminder * 10 + b[i]) % set.size();
        }
        
        return map.get(reminder);
    }

	public static void main(String[] args) {
		/* Your class should be named Solution.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n = s.nextInt();
        
        int[] b= new int[n];
        for(int i=0; i<n; i++)
        {
            b[i]=s.nextInt();
        }
        
        System.out.println(superPow(int a, int[] b));


	}

}

///////////////


import java.util.*;
public class Solution {
	public static int minCharDeletion(String str) {
		// Write your code here.
          
           Integer [] charCounts = new Integer[50];;
     Arrays.fill(charCounts, 0);

   for (int i = 0; i <str.length() ; i++)
   {
    int index = str.charAt(i)-'A';
    int count = charCounts[index];
    charCounts[index] = count + 1;
   }

   ArrayList<Integer> list = new ArrayList<>(50);
    for (int i = 0; i<charCounts.length ; i++)
    {
       if(charCounts[i]>0)
        list.add(charCounts[i]);
      }
      Collections.sort(list, Collections.reverseOrder());

        Integer[] counts = list.toArray(new Integer[list.size()]);

       int deletions = 0;

           for (int i = 0; i <counts.length-1 ; i++)
           {
              for (int j = i+1; j <counts.length ; j++) 
              {
               if (counts[i]>0 && counts[i]==counts[j])
               {
               int count = counts[j];
               counts[j] = count - 1;
               deletions++;
              }else
            break;
        }
     }
   return deletions;
    }
}

import java.util.*;

public class Practice {

	public static int StringChallenge(String str)
	{
		int k = Integer.parseInt(str);  
		String B = Integer.toBinaryString(k);
    
		if(B.length() < 8) {
			int a = 8-B.length();
		
			for(int j = 0; j<a;j++) {
				B = 0+B;
			}
		}
		String nstr = "";
		char ch;

    	for (int i=0; i<B.length(); i++)
    	{
    		ch = B.charAt(i);
    		nstr = ch+nstr; 
    	}
    	int decimal= Integer.parseInt(nstr,2);
    	return decimal;
	}

// Driver code
	public static void main(String[] args)
	{
	
		Scanner s = new Scanner(System.in);
		String str = s.next();
    
		System.out.println(StringChallenge(str));
	}
}


//Check Armstrong

import java.util.*;
import java.lang.*;
public class Main {
    
    
	private static boolean isArmstrong(int n)   
	{
		int temp, digits=0, last=0, sum=0;   
		temp=n;   
		while(temp>0)    
		{   
			temp = temp/10;   
			digits++;   
		}   
		temp = n;   
		while(temp>0)   
		{   
            last = temp % 10;   
            sum +=  (Math.pow(last, digits));   
            temp = temp/10;   
            }  
            if(n==sum)   
            	return true;      
            else 
                return false;   
        }  
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        
        int number = s.nextInt();

		if(isArmstrong(number))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

//Special Sum of array

public class solution {

	public static int sum(int arr[])
	{
         //Write code here 
        int number = 0;
 
        for (int i = 0; i < arr.length; i++)
            number += arr[i];
 
        if(number/10 > 0)
        {
            number = digSum(number);
        }
        return number;
	}
    
    private static int digSum(int n)
    {
        int sum = 0;
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

//Rectangular numbers

public class solution {

	public static void print(int n) {
	//Write your code here
        int original = n;
        n = (2*n)-2;
        for(int row = 0; row<=n; row++){
            for(int col =0; col<=n; col++){
                int index = original - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(index);
            }
            System.out.println();
        }
	}

}


//Total Strings
//have problems


public class Solution{

    public static int countStrings(int n){

        // Write your code here  
      return countStr(n,1,2);
    }
    
    private static int countStrUtil(int[][][] dp, int n, int b, int c)
    {
        if (b < 0 || c < 0)
        {
            return 0;
        }
        if (n == 0)
        {
            return 1;
        }
        if (b == 0 && c == 0)
        {
            return 1;
        }
        if (dp[n][b][c] != -1)
        {
            return dp[n][b][c];
        }

        int res = countStrUtil(dp, n - 1, b, c);
        res += countStrUtil(dp, n - 1, b - 1, c);
        res += countStrUtil(dp, n - 1, b, c - 1);
 
        return (dp[n][b][c] = res);
    }
    
    private static int countStr(int n, int b, int c)
    {
        int[][][] dp = new int[n + 1][2][3];
        for (int i = 0; i < n + 1; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                for (int k = 0; k < 3; k++)
                {
                    dp[i][j][k] = -1;
                }
            }
        }
        return countStrUtil(dp,n,b,c);
    }
}

//Water n Jugs
//have problems

import java.io.*;  
import java.util.Scanner;  
public class Solution {
  
	public static int gcd(int a, int b)
	{
    	if (b == 0)
        	return a;
         
    	return gcd(b, a % b);
	}

	public static int pour(int fromCap, int toCap, int d)
	{
    	int from = fromCap;
    	int to = 0;
 
    	int step = 1; 
    	while (from != d && to != d)
    	{
        	int temp = Math.min(from, toCap - to);
 
        	to += temp;
        	from -= temp;
        	step++;
 
        	if (from == d || to == d)
            	break;
        	if (from == 0)
        	{
            	from = fromCap;
            	step++;
        	}
        	if (to == toCap)
        	{
            	to = 0;
            	step++;
        	}
    	}
    	return step;
	}
 
	public static int minSteps(int m, int n, int d)
	{
    	if (m > n)
    	{
        	int t = m;
        	m = n;
        	n = t;
    	}

    	if (d > n)
        	return -1;
 
    	if ((d % gcd(n, m)) != 0)
        	return -1;

    	return Math.min(pour(n, m, d), pour(m, n, d)); 
	} 
  
    public static void main(String[] args) {
        /* Your class should be named Solution.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        int N;
        int a, b, c;  
    
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        
        for(int i=0; i<N; i++)
        {
        	a = sc.nextInt();  
        	b = sc.nextInt();  
        	c = sc.nextInt();   
        	if(minSteps(a, b, c)>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
            sc.close();  
    }  
}  

//Break Numbers
public class solution {
	public static void printCombination(int num){
		//Write your code here
   		printHelper(num, num, "");
	}
    
    private static void printHelper(int target, int max, String suffix){
    	if (target == 0)
			System.out.println(suffix);
    	else
    	{
       		for (int i = 1; i <= max && i <= target; i++)
          		printHelper(target - i, i, i + " " + suffix);
    	}
	}
}

//Group sum
import java.util.*;
public class Solution {

	public static boolean subsetSumToKIdentical(int input[], int n, int k){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
	 	 * Taking input and printing output is handled automatically.
		 */
        int count = 0;
		for (int i = 0; i < (n - 1); i++) {
			for (int j = (i + 1); j < n; j++) {
				if (input[i] + input[j] == k) {
					count++;
              }
          }
      }
        
        if(count>0)
        {
        	return true;
        }
        else
            return false;
	}
}

//Possible Combinations
import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
	public static void main (String[] args) {
	    // Write your code here
        // Take input and print desired output
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        if(N<12 && N>20){
            return;
        }

        int[] arr = new int[N];        
        for(int i = 0; i<N; i++){
            arr[i] = s.nextInt();
        }
        printCombination(arr, N, 12);
	}
    
    private static void combinationUtil(int arr[], int data[], int start, int end, int index, int r)
    {
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
    
    public static void printCombination(int arr[], int n, int r)
    {
        int data[]=new int[r];
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
}

//Winner of the Circular Game
import java.util.*;
public class Solution
{
    static public int findTheWinner(int n, int k) {
        // Write your code here
    	Queue<Integer> que = new LinkedList<>();
    	for (int i = 1; i <= n; i++) {
        	que.offer(i);
    	}
    	while (que.size() != 1) {
        	for (int i = 1; i <= k-1; i++) {
            	que.offer(que.poll());
        	}
        	que.poll();
    	}
    	return que.poll();
    }
}

//Valid Stack Permutation
//have problems

import java.util.*;
public class Solution {
    public static boolean validStackPermutation(ArrayList<Integer> first, ArrayList<Integer> other){
        // Write your code here.
        if(first.size() != other.size())
            return false;
        
        
        int n = first.size();
        Queue<Integer> input = new LinkedList<>();
        
        for (int i = 0; i < n; i++)
        {
            input.add(first.get(i));
        }
        
        Queue<Integer> output = new LinkedList<>();
        for (int i = 0; i < n; i++)
        {
            output.add(other.get(i));
        }
        
        Stack<Integer> tempStack = new Stack<>();
        while (!input.isEmpty())
        {
            int ele = input.poll();
 
            if (ele == output.peek())
            {
                output.poll();
                while (!tempStack.isEmpty())
                {
                    if (tempStack.peek() == output.peek())
                    {
                        tempStack.pop();
                        output.poll();
                    }
                    else
                        break;
                }
            }
            else
            {
                tempStack.push(ele);
            }
        }
        return (input.isEmpty() && tempStack.isEmpty());
    }
}

//Convert Bst To The Greater Sum Tree

/************************************************************

Following is the TreeNode class structure

class TreeNode<T> {
    T val;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T val) {
        this.val = val;
        left = null
        right = null
    }
};

************************************************************/

class Solution{
public static TreeNode<Integer> convertBstToGreaterSum(TreeNode<Integer> root)
{
	// Write your code here.
    helper(root,0);
    return root;
}

public static int helper (TreeNode<Integer> root, int sum) {
    if(root==null)
        return 0;
    
    int v = root.val;
    int right = helper(root.right, sum);
    root.val = right+sum;
    int left = helper(root.left,root.val + v);
    return right + left + v;
}
}

//Sorted Linked List to Balanced BST
public class Solution
{
	public static TreeNode<Integer> sortedListToBST(Node<Integer> head)
	{
		// Write your code here.
        if (head == null) {
            return null;
        }
        Node<Integer> temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        if (n == 1) {
            return new TreeNode<Integer>(head.data);
        }
        
        Node<Integer> leftHalf = new Node<Integer>(head.data);
        Node<Integer> leftTemp = leftHalf;
        for (int i = 0; i < n/2 - 1; i++) {
            head = head.next;
            leftTemp.next = new Node<Integer>(head.data);
            leftTemp = leftTemp.next;
        }
        head = head.next;
        
        TreeNode<Integer> root = new TreeNode<Integer>(head.data);
        
        head = head.next;
        
        Node<Integer> rightHalf = null;
        if (head != null) {
            rightHalf = new Node<Integer>(head.data);
            Node<Integer> rightTemp = rightHalf;
            head = head.next;
            while (head != null) {
                rightTemp.next = new Node<Integer>(head.data);
                rightTemp = rightTemp.next;
                head = head.next;
            }
        }
        
        root.left = sortedListToBST(leftHalf);
        root.right = sortedListToBST(rightHalf);
        return root;
	}
}

//Minimum and Maximum Cost to buy N Candies

public class Solution {

	// Function to calculate minimum cost.	
    public static long minimumCost(int[] cost, int n, int k)
	{
        // Write your code here.   
        long res = 0;
        for (int i = 0; i < n; i++) {
            // Buy current candy
            res += cost[i];
 
            // And take k candies for free
            // from the last
            n = n - k;
        }
        return res;
    }
    
    // Function to calculate maximum cost.  
    public static long maximumCost(int[] cost, int n, int k) 
	{
        // Write your code here.
        long res = 0, index = 0;
 
        for (int i = n - 1; i >= index; i--)
        {
            // Buy candy with maximum amount
            res += cost[i];
 
            // And get k candies for free from
            // the starting
            index += k;
        }
        return res;
    }

}

//Adjacent Bit Counts
//have problem
//java
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) {
		/* 
			* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        Scanner s = new Scanner(System.in);
        
        int T = s.nextInt();
        int n, k;
        for(int i = 0; i<T; i++){
            n = s.nextInt();
            k = s.nextInt();
            
                int totalWays = waysToKAdjacentSetBits(n, k, 1, 0, 1) + waysToKAdjacentSetBits(n, k, 1, 0, 0);
            
            System.out.println(totalWays);
        }
	}
    
    public static int waysToKAdjacentSetBits(int n, int k, int currentIndex, int adjacentSetBits, int lastBit)
	{
    	if (currentIndex == n) {

        	if (adjacentSetBits == k)
            	return 1;
        	return 0;
    	}
 
    	int noOfWays = 0;
    	if (lastBit == 1) {
        
        	noOfWays += waysToKAdjacentSetBits(n, k, currentIndex + 1, adjacentSetBits + 1, 1);
        	noOfWays += waysToKAdjacentSetBits(n, k,currentIndex + 1, adjacentSetBits, 0);
    	}
    	else if (lastBit == 0) {
        	noOfWays += waysToKAdjacentSetBits(n, k, currentIndex + 1, adjacentSetBits, 1);
        	noOfWays += waysToKAdjacentSetBits(n, k, currentIndex + 1, adjacentSetBits, 0);
    	}
    	return noOfWays;
	}
}
//c++

#include <bits/stdc++.h>
using namespace std;

#define mod 1000000007

int main()
{
    int dp[101][101][2];
    memset(dp, 0, sizeof(dp));
    dp[1][0][0] = 1;
    dp[1][0][1] = 1;
    for (int i = 2; i <= 100; i++)
    {
       dp[i][i - 1][0] = 0;
       dp[i][i - 1][1] = 1;
       dp[i][0][0] = (dp[i - 1][0][0] + dp[i - 1][0][1]) % mod;
       dp[i][0][1] = dp[i - 1][0][0];
    }
    for (int i = 2; i <= 100; i++) //for each n
    {
       for (int j = 1; j < i; j++) //for each k
       {
         dp[i][j][0] = (dp[i - 1][j][0] + dp[i - 1][j][1]) % mod;
         dp[i][j][1] = (dp[i - 1][j][0] + dp[i - 1][j - 1][1]) % mod;
       }
    }
    int t;
    cin >> t;
    while (t--)
    {
       int n, k;
       cin >> n >> k;
       if (n == 0 && k == 0)
         cout <<1 << endl;
       else
       {
         int ans = (dp[n][k][0] + dp[n][k][1]) % mod;
         cout << ans << endl;
       }
    }
}




//Crossword
//have problem

//Power Pokemon

import java.util.*;
public class Solution {


	public static void main(String[] args) {
		/* 
			* Your class should be named Solution.
			* Read input as specified in the question.
			* Print output as specified in the question.
			* Write your code here
		 */
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(countPairs(arr, n));
	}
    
	public static int countPairs(int[] arr, int n)
    {
		int count = 0;
   		for (int i = 0; i < n; i++) {
      		for (int j = i + 1; j < n; j++) {
         		int sum = arr[i] + arr[j];
         		if ((sum & (sum - 1)) == 0) {
            		count++;
         		}
      		}
   		}
   		return count;
    }
}

//Spy Among Us
import java.util.*;
class Solution {
    static public int findMole(int N, int[][] trust) {

        // Write your code here
        HashMap<Integer,Integer>h=new HashMap<>();
        int max=0,code=0;
        
       for(int i=0;i<trust.length;i++){
           h.put(trust[i][1],h.getOrDefault(trust[i][1],0)+1);
            if(h.get(trust[i][1])>max){
                max=h.get(trust[i][1]);
                code=trust[i][1];
            }
                
       }
         for(int i=0;i<trust.length;i++){
              if(trust[i][0]==code)
                  return -1;
         }
        if(max==N-1)return code ;
        else return -1;

    }
}



//White Subtree
//have problems


//Jumping Ninja
//have problems


//Help Pradyumana!
//have problems


//Minimum Character Deletion

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution {

    public static int minCharDeletion(String input) {

        int len = input.length();

        // Counter of characters to delete.
        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        // Storing frqquency of each character in the map.
        for (int i = 0; i < len; i++) {
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i), map.get(input.charAt(i))+1);
            }
            else{
                map.put(input.charAt(i), 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Set<Character> keys = map.keySet();
        
        // Put frequencies of characters into the priority queue.
        for(char key : keys){
            int currFreq = map.get(key);
            pq.add(currFreq);
        }

        while (!pq.isEmpty()) {

            // Take the biggest frequency character.
            int mostFrequent = pq.peek();
            pq.remove();

            // If priority queue is empty, then return the number of characters to be deleted.
            if (pq.isEmpty()) {
                return count;
            }

            // If this frequency is equal to the next one, decrease it by 1 and put back to the priority queue.
            if (mostFrequent == pq.peek()) {
                if (mostFrequent > 1) {
                    pq.add(mostFrequent - 1);
                }
                count++;
            }
        }
        // Return the number of characters to be deleted.
        return count;
    }

}

//Number of Atoms
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.lang.Character.*;

class Number {
	int value;

	Number(int value) {
		this.value = value;
	}
}

class Pair {

	String monoAtom;
	int count;

	Pair(String monoAtom, int count) {
		this.monoAtom = monoAtom;
		this.count = count;
	}
}

class SortComparator implements Comparator<Pair> {

	@Override
	public int compare(Pair p1, Pair p2) {

		return p1.monoAtom.compareTo(p2.monoAtom);
	}

}

//Special Walk

#include<bits/stdc++.h>

using namespace std;

void dfs1(int i,vector<int>adj[],int n,stack<int>&s,vector<bool>&vis)

{

    vis[i]=true;

    for(auto j:adj[i])

    if(!vis[j])

    dfs1(j,adj,n,s,vis);


 

    s.push(i);

}

void dfs2(int i,vector<int>adj[],vector<bool>&vis,vector<int>&temp)

{

    vis[i]=true;

    temp.push_back(i);

    for(auto j:adj[i])

    if(!vis[j])

    {

        dfs2(j,adj,vis,temp);

    

    }   

}

void findSSC(vector<int>adj[],int n)

{

    stack<int>s;

    vector<bool>vis(n,false);

for(int i=0;i<n;i++)

     {if(!vis[i])

     dfs1(i,adj,n,s,vis);}


 

     for(int i=0;i<n;i++)

     vis[i]=false;


 

     vector<int>rev[n];

     for(int i=0;i<n;i++)

     {

         for(auto j:adj[i])

         rev[j].push_back(i);

     }

     vector<vector<int>>res;

     while(!s.empty())

     {

         int curr=s.top();

         s.pop();

         if(!vis[curr])

         {

             vector<int>temp;

             dfs2(curr,rev,vis,temp);

             res.push_back(temp);

             temp.clear();

         }

     }

     set<int>ss;

     for(int i=0;i<res.size();i++)

     {

        vector<int>t=res[i];

        if(t.size()>=3)

        {

            for(int j=0;j<t.size();j++)

            ss.insert(t[j]);

        }

     }

     for(int i=0;i<n;i++)

     {

         if(ss.find(i)!=ss.end())

         cout<<"1"<<" ";

         else

         cout<<"0"<<" ";

     }

}

int main(){

    int n,m;

    cin>>n>>m;

    vector<int>adj[n];

    for(int i=0;i<m;i++)

    {

        int x;

        int y;

        cin>>x>>y;

        x--;

        y--;

        adj[x].push_back(y);

    }

    findSSC(adj,n);

    return 0;

}

//Limited Subway Surfer	
//have problems

//Break Numbers
import java.util.*;
public class solution {
    public static void printCombination(int n){
        //Write your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        findWays(arr, 1, n);
    }
    public static void printVector(ArrayList<Integer> arr)
    {
        if (arr.size() != 0)
        {
            for(int i = 0; i < arr.size(); i++)
            {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
    }

    static void findWays(ArrayList<Integer> arr,
                         int i, int n)
    {
        if (n == 0)
            printVector(arr);
        for(int j = i; j <= n; j++)
        {
            arr.add(j);
            findWays(arr, j, n - j);
            arr.remove(arr.size() - 1);
        }
    }
}

//All possible ways

public class Solution {

    static int res = 0;
    public static int allWays(int x, int n) {

        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        return check(x,n);

    }
    static int checkRecursive(int num, int x, int k, int n)
    {
        if (x == 0)
            res++;

        int r = (int)Math.floor(Math.pow(num, 1.0 / n));

        for (int i = k + 1; i <= r; i++) {
            int a = x - (int)Math.pow(i, n);
            if (a >= 0)
                checkRecursive(num,
                               x - (int)Math.pow(i, n), i, n);
        }
        return res;
    }

    // Wrapper over checkRecursive()
    static int check(int x, int n)
    {
        return checkRecursive(x, x, 0, n);
    }
}

//Maximum Subarray Sum

import java.util.* ;
import java.io.*; 

public class Solution {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long a= maxSubArraySum(arr);
        if(a<0) {
            return 0;
        }
        return a;
    }
    static long maxSubArraySum(int a[])
    {
        int size = a.length;
        long max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

}

//Sum of Powers of Three

class Solution {
    static public boolean checkPowersOfThree(int n) {
        
        // Write your code here
        
   
        int tmp = 3;
        while (tmp < n) {
            tmp *= 3;
        }
        
        while (tmp > 0) {
            if (n >= tmp) {
                n -= tmp;
            }
            tmp = tmp/3;
        }
        
        return n == 0;
    }
}

//Matrix Gym
//have problems
package skilltest;
import java.util.*;

public class Matrixgym {
	
	public static int[] headSum = new int[100];
	public static int counter = 0;
	public static int z = 0;
	
	private static int largest(int[] arr)//Too find largest number from an 1D array
    {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
         
        return max;
    }
	
	private static void sum(int[] array)//To find sum of all numbers in 1D array
	{
		counter += 1; 
		int sum1 = 0;
		for (int i : array)
		{
		        sum1+=i;
		}
		
		headSum[counter] = sum1;
	}  
	
	private static void ratInAMaze(int maze[][], int n)
	{	
        int path[][] = new int[n][maze[0].length];
        printAllPaths(maze, 0, 0, path,n);
	}
    
    private static void printAllPaths(int maze[][], int i, int j, int path[][], int n)//helper function for ratInAMaze
    {
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return;
        }
        
        path[i][j] = 1;
        
        
        int[] summer = new int[n*maze[0].length];
        if(i == n-1 && j == n-1){
            for(int r = 0; r < n; r++){
                for(int c = 0; c < maze[0].length; c++){
                    summer[z++] = path[r][c];
                }
                
            }           
            sum(summer);
            path[n-1][n-1]= 0;
            return;
        }
        //Doing Recursion
        //top
        printAllPaths(maze, i-1, j, path, n);
        //down
        printAllPaths(maze, i+1, j, path, n);
        //left
        printAllPaths(maze, i, j-1, path, n);
        //right
        printAllPaths(maze, i, j+1, path, n);
        
        path[i][j] = 0; 
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        String[] arr = new String[n];
        
        for(int e = 0; e<n; e++) {
        	arr[e] = s.next();
        }
        int c = s.nextInt();
         
// converting string array into character array
        char[][] maze = new char[n][arr[0].length()];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < arr[0].length(); j++)
            {
                maze[i][j] = arr[i].charAt(j);
            }
        }
//      convert String array into integer array
        int[][] newArray = new int[n][arr[0].length()];
        for (int k = 0; k < n; k++)
        {
            for (int l = 0; l < arr[0].length(); l++)
            {
            	if(maze[k][l] == '#') {
            		newArray[k][l] = 0;
            	}
            	else if (maze[k][l] == '.') {
            		newArray[k][l] = 1;
            	}
            }
        }
        ratInAMaze(newArray, n);
        int sumOfnumbers = largest(headSum);
        
        sumOfnumbers = sumOfnumbers*5;
    
        if(sumOfnumbers > c) {
        	int extraCalories = (sumOfnumbers - c);
        	System.out.println("Yes " + extraCalories);
        }
        
        else if(sumOfnumbers == c) {
        	System.out.println("Yes");
        }
        
        else {
        	System.out.println("No");
        }
        s.close();
    }
}


