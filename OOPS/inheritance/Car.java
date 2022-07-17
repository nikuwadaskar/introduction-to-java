package inheritance;

public abstract class Car extends Vehical {

	int numdoor;
//	int maxspeed;
	public void print() {
		super.maxspeed=150;
	//	super.print();
		
		System.out.println("this is car");
		System.out.println("car "+ " color "+ getcolor()+" max speed "+ maxspeed+" numdoor "+numdoor);
	} 
	public void  maxspeed() {
		
		System.out.println(maxspeed);
	}
//	 public Car(int numdoor, int maxspeed){
//		super (100);
//		 System.out.println("cars Constructor ");
//		 this.numdoor=numdoor;
//	 }
	
}