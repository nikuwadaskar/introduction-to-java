package Recursion;
//meko kuch nahi samjha 

public class R3KayPad {
	public static String[] keypad(int n){  
		if(n==0||n==1){
			String output[]={""};
			return output;
		}
		int lastDigit=n%10;
		//		System.out.println(newN);
		String[] smallOutput=keypad(n/10);
		//		System.out.println(ans.length);
		String lastDigitOption=getOption(lastDigit);
		String output[]=new String[lastDigitOption.length()*smallOutput.length];
		//		System.out.println(finalans.length);
		int k=0;
		for(int i=0;i<smallOutput.length;i++){
			for(int j=0;j<lastDigitOption.length();j++){
				output[k]=smallOutput[i]+lastDigitOption.charAt(j);
				//	System.out.println(ans[i]);
				k++;
			}
		}
		return output;
	}





	private static String getOption(int newN){
		if(newN==2)
			return "abc";
		if(newN==3)
			return "def";
		if(newN==4)
			return "ghi";
		if(newN==5)
			return "jkl";
		if(newN==6)
			return "mno";
		if(newN==7)
			return "pqrs";
		if(newN==8)
			return "tuv";
		if(newN==9)
			return "wxyz";
		else
			return "";
	}


	public static void printKeypad(int input ,String stringSoFar ){
		if(input ==0) {
			System.out.println(stringSoFar);
			return ;
		}
		int lastDigit= input%10;
		int smallInput=input/10;
		String optionLastDigit=getOption(lastDigit);
		for (int i=0;i<optionLastDigit.length();i++) {
			printKeypad(smallInput, optionLastDigit.charAt(i)+stringSoFar);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeypad(22, "");
	}

}
