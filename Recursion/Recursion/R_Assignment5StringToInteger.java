package Recursion;

public class R_Assignment5StringToInteger {
	
	public static int convertStringToInt(String str){
		
		// If the number represented as a string
		// contains only a single digit
		// then returns its value
		if (str.length() == 1)
			{return (str.charAt(0) - '0');}

		// Recursive call for the sub-string
		// starting at the second character
		double y = convertStringToInt(str.substring(1));

		// First digit of the number
		double x = str.charAt(0) - '0';

		// First digit multiplied by the
		// appropriate power of 10 and then
		// add the recursive result---
		// For example, xy = ((x * 10) + y)
		x = x * Math.pow(10, str.length() - 1) + y;
		return (int)(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertStringToInt("234"));
	}
}
