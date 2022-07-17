package Recursion;

public class R_Assignment6PairStar {
	public static String addStars(String s) {
		if(s.length()==1) {
			return s;}// if there is only character then just return.
		String smallans=addStars(s.substring(1));// s is the current string and the small is the returned string after recursion call
		if(s.charAt(0)==smallans.charAt(0))// check small string first character and the long 
		{return s.charAt(0)+"*"+smallans;}
		else
		{return s.charAt(0)+smallans;}
	}

	public static void main(String[] args) {
		System.out.println(addStars("aaaabbaaaa"));
	}
}