import java.util.Scanner;
public class L4HomeWork_Fahrenheit_Celsius {

	public static void main(String[] args) {
		int s,e,w;
		Scanner g =new Scanner(System.in);
		s=g.nextInt();
		e=g.nextInt();
		w=g.nextInt();
	while (s<=e) {
		double con=((s-32)*((double)5/(double)9));
		int con2=(int)con;
		System.out.println(s+" "+con2);
		s=s+w;
	}
		

	}

}
