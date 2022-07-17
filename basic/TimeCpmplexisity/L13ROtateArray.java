package TimeCpmplexisity;

public class L13ROtateArray {
	    // maine banaya ye solution thoda lamba hai but its okay 
	        public static void rotate(int[] str, int d) { 
	    	int str2[]=new int [d];
			int str3[]=new int [str.length-d];
			for (int i =0;i<str.length;i++) {
				if (i<str2.length) {str2[i]=str[i];}
				if (i+d<str.length) {
					str3[i]=str[i+d];
				}
			} for(int i = 0 ; i<str.length-d;i++) {
				str[i]=str3[i];
			}for(int i = 0 ; i<d;i++) {
					str[i+str.length-d]=str2[i];
			}
		}
	
	public static void main(String[] args) {
		int  str[] = {1, 3, 6, 11, 12, 17}; 
		rotate(str , 2);
	}
}
