package arrayList;
import java.util.ArrayList;
public class RemovConsecativeDuplicate {
	public static ArrayList<Integer> RemovConsecativeDuplicate(int arr[]){


		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for (int i=1;i<arr.length;i++) {
			if (arr[i]!=arr[i-1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,10,20,20,20,30,40,10};
		ArrayList<Integer> result=RemovConsecativeDuplicate(arr);

		for (int i: result ) {
			System.out.print(i+" ");//for each element i in arr.
		}

	}

}
