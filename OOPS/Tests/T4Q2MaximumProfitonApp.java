package Tests;
import java.util.Scanner;
import java.util.*;
public class T4Q2MaximumProfitonApp {

	public static int maximumProfit(int arr[]) {
		// public static int merge(int arr[]) {
		Arrays.sort(arr);

		int cost[]=new int [arr.length];
		for (int i =0;i<arr.length;i++) {
			cost [i]=arr[i]*(arr.length-i);}
		int max = Integer.MIN_VALUE;
		for (int j :cost) {
			if (j>max) {
				max=j;
			}
		}
		return max;
	}


	public static void main(String args[]) {
	//	Arrays.sort(arr);

	}
}
