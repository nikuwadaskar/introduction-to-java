package SkillTest_Group1;

public class TwoSubstrings {
	
	
	public static void twoSubstrings(String s) {
		// Write your code here
		int N = s.length();
		splitString(s, N);

	}

	// Function to check if a String can be
	// divided into two subStrings such that
	// one subString is subString of the other
	static void splitString(String S, int N)
	{

		// Store the last character of S
		char c = S.charAt(N - 1);
		int f = 0;

		// Traverse the characters at indices [0, N-2]
		for (int i = 0; i < N - 1; i++)
		{

			// Check if the current character is
			// equal to the last character
			if (S.charAt(i) == c)
			{

				// If true, set f = 1
				f = 1;

				// Break out of the loop
				break;
			}
		}

		if (f > 0)
			System.out.print("YES");
		else
			System.out.print("NO");
	}



}
