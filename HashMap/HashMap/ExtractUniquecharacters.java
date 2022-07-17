package HashMap;

import java.util.*;

public class ExtractUniquecharacters {

	public static String uniqueChar(String str){
		String st="";
		if (str.length() == 0) {
			return  "";
		}
		HashMap<Character, Integer> ok=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (ok.containsKey(str.charAt(i))) {

			}else {
				ok.put(str.charAt(i), i);
				st=st+str.charAt(i);
			}
		}
		return st;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueChar("aabbbaacbba") );
	}

}
