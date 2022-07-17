package String;

public class L12BufferString {
	public static void main(String args[]) {
	 StringBuffer str=new StringBuffer("abc kl");
     str.setCharAt(0,'d');
     //str.append("def");
   //  System.out.println(str+" "+str.length());
     System.out.println(str );
     String s="d";
     for(int i=0;i<5;i++){
         s=s+'z';
     }
}
}
