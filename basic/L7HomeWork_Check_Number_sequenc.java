import java.util.Scanner;
public class L7HomeWork_Check_Number_sequenc {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int num = s.nextInt();
		 int prev = s.nextInt();
		 int i = 0,cur,z=0;
		 boolean isdec = true;
		 while(i<num-1) {
			 cur = s.nextInt();
			 if(prev<cur) {
				 z=1;
			 }
			 else if(prev>cur && z==0) {
				 z=0;
			 }
			 else{
				 
				 isdec=false;
				 break;
			 }
			 prev = cur;
			 i=i+1;
		 }
		 if(isdec) {
			 System.out.println("true");
		 }
		 else {
			 System.out.println("false");
		 }

	}

}
