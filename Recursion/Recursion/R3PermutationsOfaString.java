package Recursion;

import java.util.Scanner;

public class R3PermutationsOfaString {
	public static String[] permutationOfString(String input){
		if(input.length()==0) {
			String output[]= {""};
			return output;
		}
		String[] smallerOutput= permutationOfString(input.substring(1));
		
		String output[] = new String [input.length()*smallerOutput.length];
		
		int k =0;
		for (int i=0;i<smallerOutput.length;i++) {
			String currentString = smallerOutput[i];
			for (int j = 0; j <= currentString.length(); j++) {
				output[k]=currentString.substring(0, j)+ input.charAt(0)+currentString.substring(j);
				k++;
			}
		}
		return output;
	}
	
	
	
	public static void Printpermutations(String input){
		// Write your code here
        permutationsHelper(input,"");

	}
    
    private static void permutationsHelper(String input, String output)
    {
        if (input.length()==0)
            System.out.println(output);
        
        for (int i=0;i<input.length();i++)
            permutationsHelper(input.substring(0,i)+input.substring(i+1), output+input.charAt(i));
    }
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
//		String[] result = permutationOfString(input);
//		for(String val:result) {
//			System.out.println(val);
//		}
		Printpermutations(input);
		
	}
}
