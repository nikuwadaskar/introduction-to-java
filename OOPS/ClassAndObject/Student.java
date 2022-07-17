package ClassAndObject;

public class Student {
	String name;
	int rollNum;
	int section ;
	final int count=1;//you have to initialize this or this will throw you error 
	// you can access it anywhere but you can not modified it inside and outside 
	//the class
	private double conversionfactor =0.95;//there are three modifiers 
	//Default public private.
	//as we made this marks as private hence it will be available only 
	// in class also we can not keep it empty we have to assign the value 
	public String ward ;// as it is public i can access this outside the
	//package as i took access of this in temp. package you can see
	
	public int getRollnum() {//this will only give us back the value of roll 
		return rollNum;
	}
	public void setRollnum(int num) { // here we will set the value to the rollnum 
		// as we can see we rollNum is class object we can access here and by that mean
		//we can assign the value of num to the rollNum
		if (num<0) {//here by using if i can also take care that the no unexpected
			//value should assign to the variable
			return;
		}
		rollNum=num;
	}
	public void setSection(int section) {
		this.section=section;//now here we want to assign the section to the sectioncreated in 
		//class and both have same name so we use this key which help us to 
		// identify that the this section is the section from our class.
		//also as color suggest that we can see the class section and the this section
		//have same color and the giving section have differ color.
	}
	public int getSection() {
		return section;
	}
	public Student(String n, int num) {// this is constructor we can create 
		//Inside the class and name should be same like here class have name student 
		//so you can not create another name constructor
		name=n;
		rollNum=num;
		
	}

}
