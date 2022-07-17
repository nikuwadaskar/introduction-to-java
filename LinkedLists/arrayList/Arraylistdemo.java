package arrayList;
import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1, 170);//one is the index 
//		arr.remove(1);
//		Integer i =20;
//		arr.remove(i);
		arr.set(0, 90);
		System.out.println(arr.size());//number of element you entered
		// it will increase by 1.5 each time you exhausted
		//default capacity is 10;
		System.out.println(arr.get(0));
		for (int i =0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}System.out.println();
		//Enhanced for loop - for each loop
		
		for (int i: arr ) {
			System.out.print(i+" ");//for each element i in arr.
		}

	}

}
