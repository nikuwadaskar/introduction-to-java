package Arrays;
import java.util.Scanner;
public class L9HomeWorkSwapAlternate {
	public static void swapAlternate(int a[]) {
	    for (int i = 0; i < a.length - 1; i += 2) { //this commented shit qork likr champ dont worry 
	        int c = a[i] + a[i + 1];
	        a[i] = c - a[i];
	        a[i + 1] = c - a[i + 1];
	    }

		  }
	public static void print(int [] arr) {
		int n =arr.length;
		for(int i=0;i<n;i++){
	        System.out.println(arr[i]);
	    }
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i []= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11} 
;
			swapAlternate(i);
			print(i);
		}

	}
