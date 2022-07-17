package TicTacToe;
import java.util.*;
//public class rou

public class rough {

	public static int[] headSum = new int[100];
	public static int counter = 0;
	public static int z = 0;

	private static int largest(int[] arr)//Too find largest number from an 1D array
	{
		
		int i;
		int max = arr[0];
		for (i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
//			System.out.println(arr[i]);
		}

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
//			return;
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

		//converting string array into character array
		char[][] maze = new char[n][arr[0].length()];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < arr[0].length(); j++)
			{
				maze[i][j] = arr[i].charAt(j);
			}
		}
		//  convert String array into integer array
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
		//		System.out.println(sumOfnumbers);

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

