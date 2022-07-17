package BackTracking;


public class RatInAMaze {

	public static boolean ratInAMaze(int maze[][]){
		int n =Math.max(maze[0].length, maze.length);
		int path[][] = new int[n][n];
//		System.out.println(maze[0].length);

		return solveMaze(maze,0,0,path);
	}


	public static boolean solveMaze(int[][] maze, int i, int j, int[][] path)
	{
		//Check if i,j are valid pair of indices => i,j>=0
		int n=maze.length;
		if (i<0 || j<0 || i>=n || j>=n)
			return false;

		//If cell is already part of the path
		if (path[i][j]==1)
			return false;

		//If cell is blocked in maze (cell value=0)
		if (maze[i][j]==0)
			return false;

		//If all previous conditions fail, then the cell is a possible path
		//Include the cell in current path
		path[i][j]=1;

		//If we have reached ending point 
		if (i==n-1 && j==n-1) {
			for (int r = 0; r < path.length; r++) {
				for (int c = 0; c < path.length; c++) {
					System.out.print(path[r][c]);
				}System.out.println();
			}
			return true;
		}
		//Now, explore in all directions
		// Direction 1 - move towards cell above (top direction)
		if (solveMaze(maze,i-1,j,path))
			return true;

		//Direction 2 - move towards cell to the right (right direction)
		if (solveMaze(maze,i,j+1,path))
			return true;

		//Direction 3 - move towards cell below (bottom direction)
		if (solveMaze(maze,i+1,j,path))
			return true;

		//Direction 3 - move towards cell to the left (left direction)
		if (solveMaze(maze,i,j-1,path))
			return true;

		//If none of the conditions are satisfied, then the path is not working out
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maze[][]={{0,0,0,1,1},{0,1,0,0,1},{1,1,0,0,1},{0,0,1,0,0}};

		System.out.println(ratInAMaze(maze));

	}


	

}
