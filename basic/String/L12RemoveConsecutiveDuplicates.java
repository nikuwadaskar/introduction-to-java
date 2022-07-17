package String;

public class L12RemoveConsecutiveDuplicates {
//	public static String Comprimir(String s){
//		String ans = "";
//		for (int i = 0 ; i < s.length(); i++) {
//			int count = 1;
//			while (i < s.length()- 1 && s.charAt(i) == s.charAt(i + 1)) {
//				count++;
//				i++;// dekh yaha parr jab jab repeat valllue huyi hai tab tab  udtne jump skip ho gaye
//			}
//			ans += s.charAt(i);
//			if (count > 1) {
//				ans += count;
//			}
//		}
//		return ans;
//	}
	
	//ONLY FOR COMPRESSION
	 public static String removeConsecutiveDuplicates(String str) { 
	        String Rstr="";
	        int j =0;
	        Rstr+=str.charAt(j);
	        for (int i =0 ; i<str.length()-1;i++) {
	            if (str.charAt(i)!=str.charAt(i+1)) {
	                Rstr+=str.charAt(i+1);
	            }
	        }str=Rstr;
	        return str;
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabcccde";
		String reversedString=removeConsecutiveDuplicates(str);
		System.out.println(reversedString);

	}

}
