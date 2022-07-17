package SkillTest_Group1;

public class Printthepattern {

	public static void printPattern(int n){
		String[] s = NumberPattern(n);
		for (int i =0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		// Write your code here

	}
	public static String[] NumberPattern(int N) {

		String result[]= new String[N];

		int index = 0;

		int startValue = 1;

		for (int row = 1; row <= N; row++) {

			String ans = "";

			for (int col = startValue; col < startValue + N; col++) {
				ans += col + " ";
			}

			if (row == (N + 1) / 2) {
				if (N % 2 != 0) {
					startValue = N * (N - 2) + 1;
				} else {
					startValue = N * (N - 1) + 1;
				}
			} else if (row > (N + 1) / 2) {
				startValue = startValue - 2 * N;
			} else {
				startValue = startValue + 2 * N;
			}

			result[index++]=ans;
		}

		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
