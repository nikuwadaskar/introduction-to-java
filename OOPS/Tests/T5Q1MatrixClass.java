package Tests;
import java.util.Scanner;
public class  T5Q1MatrixClass {
	int [][]matrix;
	 mat(int[][]mat){
		matrix=mat;
	}
	
	public static mat add(mat a, mat b) {
		int ans [][]=new int [a.matrix.length][a.matrix[0].length];
		for (int i=0;i<a.matrix.length;i++) {
			for(int j=0;j<a.matrix[0].length;j++) {
				ans[i][j]=a.matrix[i][j]+b.matrix[i][j];
			}
		}
		mat answer=new mat(ans);
		return ans;
	}
	
	public static mat multiply (mat a, mat b) {
		int ans [][]=new int [a.matrix.length][b.matrix[0].length];
		for (int i =0;i<a.matrix.length ;i++) {
			for (int j=0;j<b.matrix[0].length;j++) {
				for(int k=0;k<a.matrix[0].length;k++) {
					ans[i][j]+=a.matrix[i][k]*b.matrix[k][j];
				}
			}
		}
		mat answer=new mat(ans);
		return answer;
	}
	
	public static mat transpose (mat m ) {
		int [][]tran_matrix  = new int [m.matrix.length][m.matrix.lrngth];
		for (int i =0;i<m.matrix.length;i++) {
			for (int j=0;j<m.matrix.length;j++) {
				trans_matrix[i][j]=m.matrix[j][i];
			}
		}
		mat answer=new mat (trans_matrix);
		return answer;
	}
	
	public static mat rotate (mat m) {
		int r =m.matrix.length ;
		int c= m.matrix[0].length;
		int [][] rotate_mat=new int [c][r];
		for(int i=0; i<r;i++) {
			for(int j=0;j<c;j++) {
				rotate_mat[c-j-1][i]=m.matrix[i][j];
			}
		}
		mat answer = new mat (rotate_mat);
		return answer;
	}
	
	public void print () {
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[0].length;j++) {
				System.out.println(matrix[i][j]+" ");
			}System.out.println();
		}
	}
	
	
	import java.util.Scanner;

	public class Runner {

		public static void main (String[] args) {
		        Scanner s=new Scanner(System.in);
		        int option=s.nextInt();
		         if(option==1)
		         {
		        	 int r1=s.nextInt();
		        	 int c1=s.nextInt();
		            int [][] m1=new int[r1][c1];
		            for(int i=0;i<r1;i++)
			        {
			            for(int j=0;j<c1;j++)
			            {
			                m1[i][j]=s.nextInt();
			            }
			        }
		            mat mat1=new mat(m1);
		            int r2=s.nextInt();
		        	 int c2=s.nextInt();
		            int [][] m2=new int[r2][c2];
		            for(int i=0;i<r2;i++)
			        {
			            for(int j=0;j<c2;j++)
			            {
			                m2[i][j]=s.nextInt();
			            }
			        }
		            mat mat2=new mat(m2);
		             mat ans=mat.add(mat1,mat2);
		             ans.print();
		         }
		         else if (option==2)
		         {
		        	 int r1=s.nextInt();
		        	 int c1=s.nextInt();
			            int [][] m1=new int[r1][c1];
			            for(int i=0;i<r1;i++)
				        {
				            for(int j=0;j<c1;j++)
				            {
				                m1[i][j]=s.nextInt();
				            }
				        }
			            mat mat1=new mat(m1);
			            int r2=s.nextInt();
			        	 int c2=s.nextInt();
			            int [][] m2=new int[r2][c2];
			            for(int i=0;i<r2;i++)
				        {
				            for(int j=0;j<c2;j++)
				            {
				                m2[i][j]=s.nextInt();
				            }
				        }
			            mat mat2=new mat(m2);
			         mat ans=mat.multiply(mat1,mat2);
			         ans.print();
		         }
		         else if(option==3)
		         {
		        	 int r1=s.nextInt();
		        	 int c1=s.nextInt();
			            int [][] m1=new int[r1][c1];
			            for(int i=0;i<r1;i++)
				        {
				            for(int j=0;j<c1;j++)
				            {
				                m1[i][j]=s.nextInt();
				            }
				        }
			            mat mat1=new mat(m1);
		        	 mat ans=mat.transpose(mat1);
		        	 ans.print();
		         }
		         else
		         {
		        	 int r1=s.nextInt();
		        	 int c1=s.nextInt();
			            int [][] m1=new int[r1][c1];
			            for(int i=0;i<r1;i++)
				        {
				            for(int j=0;j<c1;j++)
				            {
				                m1[i][j]=s.nextInt();
				            }
				        }
			            mat mat1=new mat(m1);
		        	 mat ans=mat.rotate (mat1);
		        	 ans.print();
		         }
		}

	}
}