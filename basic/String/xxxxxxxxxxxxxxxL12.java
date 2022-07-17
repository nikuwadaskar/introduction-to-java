package String;
public class xxxxxxxxxxxxxxxL12 {
	public static void main(String[] args) {
		
		String str="";
		if (str.length()<1) {System.out.println(0);}
		else {str=str+" ";
		String str1="";
		String str2="";
		for (int i=0; i<str.length();i++) {
			if (str.charAt(i)!=' ') {
				str1=str1+str.charAt(i);
			}else {
				for (int j=str1.length()-1;j>=0;j--) {
					str2=str2+str1.charAt(j);
				}str2=str2+" ";
				str1="";
			}
		}System.out.println(str2);
	}
}
}