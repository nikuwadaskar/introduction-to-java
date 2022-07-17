package Recursion;

public class R_Assignment2CheckPalindrome {
	public static boolean isStringPalindrome(String input) {
		if (input.length()<2) {
			return true;
		}if (input.charAt(0)!=input.charAt(input.length()-1)){
			return false;
		} boolean vv=  isStringPalindrome( input.substring(1, input.length()-1)) ;
		return vv;
	}

	public static void main(String[] args) {
		System.out.println(isStringPalindrome("tuyyut"));	
	}
}
