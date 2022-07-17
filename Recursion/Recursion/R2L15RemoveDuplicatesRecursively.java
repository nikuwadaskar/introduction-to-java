package Recursion;

public class R2L15RemoveDuplicatesRecursively {

	public static String removeConsecutiveDuplicates(String s) {
			if(s.length()<=1){
			return s;
		}
		if(s.charAt(0)==s.charAt(1)){
			//Call recursion on string of length n-2;
			return removeConsecutiveDuplicates(s.substring(1));
		}else{
			//call recursion on string of length n-1;
			String smallOutput=removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0)+smallOutput;
			
		}
	}

	public static void main(String[] args){
		//System.out.println(replaceChar("abcxdxex",'x','y'));
		System.out.println(removeConsecutiveDuplicates("baabbsbbahsahbahshhbhsjjjj"));
	}
}