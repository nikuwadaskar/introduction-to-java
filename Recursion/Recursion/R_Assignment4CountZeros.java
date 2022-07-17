package Recursion;
public class R_Assignment4CountZeros {
	public static int countZerosRec(int input){
		if(input<10){
			if(input==0) {
				return 1;}//this is for the sake of counting.
			else {
				return 0;}//except zero any other should not be counted thats why send zero back.
		}
		int smallAns= countZerosRec(input/10);//you will get one if it is zero else you will get zero.
		if(input%10==0)// checking digit if its zero or not
			smallAns=1+smallAns;//if that is zero then add one
		return smallAns;//else return as it is 
	}
	public static void main(String[] args) {
		System.out.println(countZerosRec(1001010001));
	}
}