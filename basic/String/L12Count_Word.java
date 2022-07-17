package String;

public class L12Count_Word {
	public static int countWords(String str) {	

	if(str.length() == 0){
        return 0;
    }
    String str1=" ";
	int count=1;
	for (int i=0;i<str.length();i++) {
	if ((str.charAt(i))==str1.charAt(0)) {
		count++;
		
}
//System.out.println(count);

}System.out.println(count);
return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
