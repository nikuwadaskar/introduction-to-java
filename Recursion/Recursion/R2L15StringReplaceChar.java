package Recursion;

public class R2L15StringReplaceChar {
	public static String replace( String s , char a, char b) {
		if (s.length()==0) {
			return s;
		}
		String small=replace( s.substring(1), a, b) ;
		if (s.charAt(0)==a) {
			return b+small;
		}else { return s.charAt(0)+small;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FuckYou";
		char a = 'u';
		char b = '*';
		System.out.println(replace(s, a, b));

	}

}
