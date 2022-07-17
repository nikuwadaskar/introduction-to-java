package BackTracking;

public class RatInMazePrintAllPath {

	public static void ratInAMaze(int maze[][]) {

		int n = maze.length;
		int path[][] = new int[n][n];
		solveMaze(maze, 0, 0, path);

	}

	public static void solveMaze(int maze[][], int i, int j, int path[][]) {

		//check if i, j, are valid indices
		int l = path.length;
		if(i < 0 || j < 0 || i >= l || j >= l) {
			return;
		}

		if (path[i][j] == 1) {
			return;
		}

		if (maze[i][j] == 0) {
			return;
		}

		// If all the condition fail, then the cell is a possible path.
		// Include the cell in current path.
		path[i][j] = 1;

		if (i == l - 1 && j == l - 1) {

			for (int row = 0; row < l; row++)
			{
				for (int col = 0; col < l; col++)
				{
					System.out.print(path[row][col]+" ");
				}					

				System.out.println();
			}
			path[i][j] = 0;
			System.out.println();
			return;
		}

		// Now Explore in all Direction.
		// Top Direction
		solveMaze(maze, i - 1, j, path);

		// Right Direction.
		solveMaze(maze, i, j + 1, path);

		// Down Direction.
		solveMaze(maze, i + 1, j, path);

		// Left Direction.
		solveMaze(maze, i, j - 1, path);
		path[i][j] = 0;
		// If none of the condition are satisfied, then the path is not working out.
		return;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][]={{1,1,0},{1,1,0},{1,1,1}};

		ratInAMaze(maze);
	}

}
