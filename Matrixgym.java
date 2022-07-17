package skilltest;
import java.util.*;

public class Matrixgym {
	
	public static int[] headSum = new int[25];
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
	
	private static void ratInAMaze(char maze[][], int n)
	{	
        int path[][] = new int[n][maze[0].length];
        printAllPaths(maze, 0, 0, path,n);
	}
    
    private static void printAllPaths(char maze[][], int i, int j, int path[][], int n)//helper function for ratInAMaze
    {
        if(i < 0 || i >= n || j < 0 || j >= maze[0].length || maze[i][j] == '#' || path[i][j] == 1){
            return;
        }
        
        path[i][j] = 1;
        
        
        int[] summer = new int[n*maze[0].length];
        if(i == n-1 && j == maze[0].length-1){
            for(int r = 0; r < n; r++){
                for(int c = 0; c < maze[0].length; c++){
                    summer[z++] = path[r][c];
                }   
            }
            
          for(int m: summer) {
        	System.out.print(m + " ");
          }
          System.out.println();
            
            sum(summer);
            path[n-1][maze[0].length-1]= 0;
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
        	
//      print array
      for (int a = 0; a < n; a++)
      {
          for (int b = 0; b < n; b++)
          {
          	
          	System.out.print(maze[a][b]+ " ");
          }
          System.out.println();
      }
        
        ratInAMaze(maze, n);
        
      for(int q : headSum) {
    	System.out.print(q+" ");
    }
    System.out.println();
        
        int sumOfnumbers = largest(headSum);
        
      System.out.println(sumOfnumbers);
        
        
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
