package String;

public class L12HomeWorkisPalindrome {
	public static boolean isPalindrome(String str) {
		boolean o =true;
		if(str.length() == 0){
          //  return ;
        }
		int count=1;
		int j= str.length();
		for (int i=0;i<j;i++) {
		if ((str.charAt(i))==str.charAt(j-1)) {
			o = true;
			j--;
			}
		else {return false;}
			
	} return true;
   //System.out.println(count);
  
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
