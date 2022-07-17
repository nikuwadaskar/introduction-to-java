package String;

public class L12RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabccccc";
		char ch ='a';
		for (int i=0; i<str.length();i++) {
			if (str.charAt(i)!=ch) {
				System.out.print(str.charAt(i));
			}
		}
	}

}
