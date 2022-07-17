package Functions;

public class L8functionCalling {
	public static void b(){//
		System.out.println("Inside b");// after executing this flow will go back to its caller
	}
	public static void a(){//Collie
		b();//will call to b
		System.out.println("Inside a");// after executing b this will be executed and then flow will go back to its caller
	}

	public static void main(String args[]) {// caller 
		a(); //will call to a
		System.out.println("Inside Main");//after executing this flow will stop
	}

}
