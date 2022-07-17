package String;

public class L12printSubstrings {
	public static void printSubstrings(String str) {
//		for (int i =0 ;i <str.length();i++) {
//			for (int j =i; j<=str.length();j++) {
//				System.out.print(str.substring(i,j)+" "); 
//			}
//		}
	//	it have wo solution upar vala ek hai niche vala ek hai 
		 for(int len=1;len<=str.length();len++){
	          //We have to print all strings wih length as "len"
	          for(int start=0;start<=str.length()-len;start++){
	              int end=start+len;
	              System.out.println(str.substring(start,end));
	          }
	      }}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
