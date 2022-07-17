package inheritance;

public abstract class Vehical {
	private String color;
	protected int maxspeed;
	public String getcolor() {
		return color;
	}	
//	public Vehical(int maxspeed){
//		this.maxspeed=maxspeed;
//		System.out.println("vahical's Constructor ");
//	}
	public void setcolor(String color)
	{
		this.color=color;
	}	
	public void print () {
		System.out.print("This Is vehical ");
		System.out.println("vehical "+ " color "+ getcolor() +" max speed "+ maxspeed);

	}
}
