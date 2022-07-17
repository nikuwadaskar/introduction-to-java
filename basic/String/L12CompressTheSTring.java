package String;
public class L12CompressTheSTring {
//	 public static String getCompressedString(String s) {
//	        // Write your code here.
//	        String ans = "";
//	        for (int i = 0 ; i < s.length(); i++) {
//	            int count = 1;
//	            while (i < s.length() - 1
//	                   && s.charAt(i) == s.charAt(i + 1)) {
//	                count++;
//	                i++;
//	            }
//	            ans += s.charAt(i);
//	            if (count > 1) {
//	                ans += count;
//	            }
//	        }System.out.println(ans);
//	        return ans;
//
//	    }
	// iski time complecity thodi acchi hai maine khud likha ek loop bhi kam hai isme so
	public static String getCompressedString(String str) {
        // Write your code here.
		int k=1;
		str=str+"#";
		String str1="";
		for (int i=0; i<str.length()-1;i++) {
			if (str.charAt(i)==str.charAt(i+1)) {
				k++;
			}else if(k>1) {str1=str1+(str.charAt(i));
			str1=str1+k;
			k=1;}
			else {str1=str1+(str.charAt(i));}
		}return str1;
    }

public static void main(String[] args) {
	String str="aaabccccc";
	//	String str2="";
	getCompressedString(str);
	//System.out.println(str1.contains(str2));
}

}
