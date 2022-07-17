package Recursion;

public class R2L15RemoveX {

	public static String RemoveX( String s ) {
		if (s.length()==0) {
			return s;
		}
		String small=RemoveX( s.substring(1)) ;
		if (s.charAt(0)=='x') {
			return small;
		}else { return s.charAt(0)+small;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xxxbb";
		System.out.println(RemoveX(s));

	}

}