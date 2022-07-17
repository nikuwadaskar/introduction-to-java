package Functions;

public class L8Pass_by_Value {
	public static void increment(int k ) {// here they receive value 10 stored in k
		k++;// Increase the value by one 
		System.out.println("increment "+k);// printed the increased value
		//return k;// if this function would the int function then you would be 
		//able to send the value but its void so it wont send anything
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		increment(n); //from here main has send the value 10 
		//n= increment(n);//if i have did this then i would have change the value of n here form whatever i get from above function
		System.out.println("main "+ n);//here as they did not send back anything hence they printed whatever they had earlier

	}

}
