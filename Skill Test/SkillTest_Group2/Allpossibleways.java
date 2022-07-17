package SkillTest_Group2;

public class Allpossibleways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	static int res = 0;
	public static int allWays(int x, int n) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		return check(x,n);

	}
	static int checkRecursive(int num, int x, int k, int n)
	{
		if (x == 0)
			res++;

		int r = (int)Math.floor(Math.pow(num, 1.0 / n));

		for (int i = k + 1; i <= r; i++) {
			int a = x - (int)Math.pow(i, n);
			if (a >= 0)
				checkRecursive(num,
						x - (int)Math.pow(i, n), i, n);
		}
		return res;
	}

	// Wrapper over checkRecursive()
	static int check(int x, int n)
	{
		return checkRecursive(x, x, 0, n);
	}
}
