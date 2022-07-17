package Arrays2D;

import java.util.Scanner;

public class L11takingInputandPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=s.nextInt();
		System.out.println("Enter numbe rof cols");
		int c =s.nextInt();
		int arr[][]=new int [r][c];
		for (int i=0;i<r;i++) {
			for (int j=0;j<c;j++) {
				System.out.println("Enter the element at "+i+" row "+j+"column");
				arr[i][j]=s.nextInt();
			}
		}
		for (int i=0;i<r;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}}
