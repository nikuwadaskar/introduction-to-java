package Recursion;

public class xxxxxxxxxxxxx {
	public static int sum(int input[],int x){
		if (input.length==0) {
			return -1;
		}if (input[input.length-1]==x) {
			return input.length;}
		int []small= new int[input.length-1];
		for (int i=1;i<input.length-1;i++) {
			small[i]=input[i-1];
		}
		return sum(small,x);
	}  
	
		
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sum(arr,9));
	}
}