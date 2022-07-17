package TimeCpmplexisity;
import java.util.*;
public class XXXXXXXX13 {

	public static void main(String[] args) {
		int arr1 []= {1, 1, 3, 3, 5, 5};
		int arr2 []= {1, 1, 1, 3, 3, 3, 5, 5};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	int n = Math.max(arr1.length, arr2.length),i=0,j=0;
	int m= Math.min(arr1.length, arr2.length);
			while (i<m||j<m&&m>0) {
				if (arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					i++;
					j++;
				}
				else { if (arr1[i]>arr2[j]&&i<arr2.length) {j++;}
				if (arr1[i]<arr2[j]&&j<arr1.length) {i++;}
			}
		}System.out.println("ok");
	}
}
