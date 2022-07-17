
public class ArithmaticOperator {

	public static void main(String[] args) {
		int a =3;
		int b=10;
		int c=b/(2*a);//*;%;/ have same precedence as well +;- have same precedance 
		//so the *%and/ will happen first and then +-
		//if having same precedence operator came in operation then go left to rightS
		System.out.println(c);
	}

}
