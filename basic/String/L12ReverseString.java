package String;

public class L12ReverseString {
	public static String reverseString(String str){
		String Rstr=" ";
//		
//		for (int i=str.length();i>0;i--) {
//			Rstr+=str.charAt(i);
//			
//		}
		for (int i =0;i<str.length();i++ ) {
			Rstr+=str.charAt(str.length()-1-i);
		}
		return Rstr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	      String str="abcde";
	      String reversedString=reverseString(str);
	      System.out.println(reversedString);

	}

}
