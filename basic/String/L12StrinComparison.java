package String;

public class L12StrinComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="abc";
	      String str1="abc";
	      String str3=new String("abc");// if you do this then it wont go to string pool and address will change ans conclude as not equal
	      if(str1==str3){
	        //  System.out.println("Both are equal");
	      //}
	      //if(str1.equals(str3)){
	      //if(str1==str3){
	          System.out.println("Both are equal");// bcoz of the String pool story
	      }
	      else{
	          System.out.println("Both are not equal");
	      }// so if you really want to campare use equal syntax as we use above
	      
	    }

}
