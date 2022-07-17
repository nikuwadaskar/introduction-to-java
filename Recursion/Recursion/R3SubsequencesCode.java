package Recursion;
import java.util.Scanner;
public class R3SubsequencesCode {
	//return type is String array
	public static String[] ReturnSubsequences(String str){
		if(str.length()==0) {
			//Creating String array //base case
			String[] output = new String[1];
			output[0]=" ";
			return output;
		}

		String[] smallOutput=ReturnSubsequences(str.substring(1));
		String[] output = new String[smallOutput.length*2];
		for (int i = 0; i < smallOutput.length; i++) {
			output[i]=smallOutput[i];			
		}
		for (int i = 0; i < smallOutput.length; i++) {
			output[smallOutput.length+i]=str.charAt(0)+smallOutput[i];			
		}
		return output;
	}

	
	public static void printSubsequences(String input , String StringSoFar) {
		if (input.length()==0) {
			System.out.println(StringSoFar);
			return;
		}
		String smallInput= input.substring(1);
		printSubsequences(smallInput, StringSoFar);
		printSubsequences(smallInput, StringSoFar+input.charAt(0));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		String[] out= ReturnSubsequences(str);
		for (String outString: out){
			System.out.println(outString);
		}
	}
}
