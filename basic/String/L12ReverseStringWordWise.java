package String;

public class L12ReverseStringWordWise {
	public static void reverseWordWise(String str) {
		String Rstr="";
		for (int i =0;i<str.length();i++ ) {
			Rstr+=str.charAt(str.length()-1-i);
		}
	String ans =	reverseEachWord(Rstr);
		System.out.println(ans);
	}

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


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
