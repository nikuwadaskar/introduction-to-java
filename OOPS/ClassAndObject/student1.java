package ClassAndObject;

public class student1 {

	public static void main(String[] args) {
	//	Student s1=new Student();// here we created new student with in the class
		//above will give error due to constructor
	//	s1.setSection(3);
	//	Student s3=new Student();
		//s1.rollNum=10;// here i can assign the value to the variable which ere created in class one 
	//	s1.name="niku";// this are default so we can have access inside the package 
		//s1.conversionfactor =10;//as i had make this marks as private it wont be available here 
		//hence it will give an error 
	//	s1.setRollnum(9);//by using setter i set the value to 99.,.this is basically 
		// class function call
	//	s1.setSection(2);
	//	System.out.println(s1.getRollnum()+" "+s1.getSection());//here by using the getter i get 
		// the assigned value back to print
		Student s2=new Student("niku", 20);//as now you have created constructor so you can not 
		//set it empty you have to provide the value which it was asking for 
		System.out.println(s2.getRollnum()+" "+s2.name+" "+s2.count);
		
	}

}
