package Arrays2D;

public class L11xxxxxxxxxxxxx {

	public static void wavePrint(int mat[][]){
		int m =mat.length*mat[0].length;
		int Lsum=0,l=0;
		while (m>0) {
			for (int i=0; i<mat.length;i++) {
				int  rsum=0,csum=0; 
				for (int j=0; j<mat.length;j++) {
						rsum=rsum+mat[i][j];
						
						csum=csum+mat[j][i];
						
						m-=2;
				}if (Lsum<Math.max(rsum, csum)) {
					Lsum=Math.max(rsum, csum);}
				
			}
		} System.out.println(Lsum);
		
	}
	public static void main(String[] args) {
		int arr[][]={ {58,2,3,4} , {5,6,7,8} , {9,10,11,12},{13,14,15,16}};
		wavePrint(arr);


	}
}
