package Generics;


public class Vehicle implements Printnew {
	int maxspeed;
	String compaany;
	
	
	
	public Vehicle(int maxspeed, String compaany) {
		super();
		this.maxspeed = maxspeed;
		this.compaany = compaany;
	}
	
	public void print () {
		System.out.println(maxspeed +  "  "+ compaany);
	}

}
