package Functions;
import java.util.Scanner;
public class L8HomeWorkFahrenheit_to_Celsius_Table_using_function {

	public static void printFahrenheitTable(int start, int end, int step) {
		//int s,e,w;
	while (start<=end) {
		double con=((start-32)*((double)5/(double)9));
		int con2=(int)con;
		System.out.println(start+"\t"+con2);
		start=start+step;
	}
	}
	public static void main(String[] args) {
		Scanner g =new Scanner(System.in);
		int start;
		int end;
		int step;
		start=g.nextInt();
		end=g.nextInt();
		step=g.nextInt();
		printFahrenheitTable(start, end, step);
		
	}
}






