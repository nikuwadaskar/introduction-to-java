package DP2;
import java.util.*;
public class HelpAroma {
	static int peri(int w, int h) {
		return w*2+h*2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		char[][] arr = new char[n][m];
		int[] cnt = new int[m];
		int max = 0;
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextLine().toCharArray();
			for (int j=0; j<m; j++) {
				if (arr[i][j]=='.') cnt[j]++;
				else cnt[j] = 0;
			}
			for (int j=0; j<m; j++) {
				int h = cnt[j];
				int w = 1;
				if (h>0) {
					for (int k=j+1; k<m; k++) {
						if (cnt[k]<h) break;
						w++;
					}
					for (int k=j-1; k>0; k--) {
						if (cnt[k]<h) break;
						w++;
					}
				}
				max = Math.max(max, peri(w, h));
			}
		}
		System.out.println(max-1);
	}
}

