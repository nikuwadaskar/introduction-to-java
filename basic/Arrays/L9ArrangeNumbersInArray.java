package Arrays;
import java.util.Scanner;
public class L9ArrangeNumbersInArray {
	public class L9Print_All_Pairs {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
	public static void arrange(int[] arr, int n) {
		// n = arr.length;
        int a = 1;

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                arr[i] = a;
                a = a + 2;
            }
            int c = n;
            for (int j = n / 2; j < n; j++) {
                arr[j] = c;
                c = c - 2;
            }
        }

        else {
            for (int i = 0; i < n / 2 + 1; i++) {
                arr[i] = a;
                a = a + 2;
            }
            int d = n - 1;
            for(int k = n / 2 + 1; k < n; k++) {
                arr[k] = d;
                d = d - 2;
            }
        }
    }       
	public static void main(String[] args) {
		// TODO Auto-generated method stub// saurabh bhai ne diya yet to understand

	}

}
