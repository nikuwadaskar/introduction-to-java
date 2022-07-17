package Arrays;
import java.util.Scanner;
public class L9Print_All_Pairs {
	public static void pair(int [] k) {
int n = k.length;
for (int i=0;i<n-1;i++) {
	for (int j =i+1; j<n;j++) {
		System.out.print("( "+k[i]+","+k[j]+")");
	}
	
}
	}

	public static void main(String[] args) {
		int i []= {1,2,3,4,5,6};
		pair(i);
	}

}
