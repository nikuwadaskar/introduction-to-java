package Arrays2D;

public class L11HomeWorkPrintSpiral {
	public static void spiralPrint(int matrix[][]){
		if (matrix.length == 0) {
			System.out.println();
			return;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int i = 0;
		int k = 0;
		int l = 0;
		while (k < rows && l < cols) {
			for (i = l; i < cols; ++i) {
				System.out.print(matrix[k][i] + " ");
			}
			k++;
			for (i = k; i < rows; ++i) {
				System.out.print(matrix[i][cols - 1] + " ");
			}
			cols--;
			if (k < rows) {
				for (i = cols -1; i >= l; --i) {
					System.out.print(matrix[rows -1][i] + " ");
				}
				rows--;
			}
			if (l < cols) {
				for (i = rows - 1; i >= k; --i) {
					System.out.print(matrix[i][l] + " ");
				}
				l++;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
