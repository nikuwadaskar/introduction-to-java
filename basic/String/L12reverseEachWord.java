package String;

public class L12reverseEachWord {
	public static String reverseEachWord(String str){
        String ans="";
        int currentWordStart=0;
        int i=0;
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                //Reverse Current Word
                int currentWordEnd=i-1;
                String reversedWord="";
                for(int j=currentWordStart;j<=currentWordEnd;j++){
                    reversedWord=str.charAt(j)+reversedWord;
                }
                //Add it final String(ans)
                ans+=reversedWord+" ";
                currentWordStart=i+1;
            }
        }
        int currentWordEnd=i-1;
        String reversedWord="";
        for(int j=currentWordStart;j<=currentWordEnd;j++){
            reversedWord=str.charAt(j)+reversedWord;
        }
        ans+=reversedWord;
        return ans;
    }
	
	
// this is working nearly every case but ek case me time limit exceed ho rahi hai
//	String str="";
//	if (str.length()<1) {System.out.println(0);}
//	else {str=str+" ";
//	String str1="";
//	String str2="";
//	for (int i=0; i<str.length();i++) {
//		if (str.charAt(i)!=' ') {
//			str1=str1+str.charAt(i);
//		}else {
//			for (int j=str1.length()-1;j>=0;j--) {
//				str2=str2+str1.charAt(j);
//			}str2=str2+" ";
//			str1="";
//		}
//	}System.out.println(str2);
//}
//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
