package Arrays2D;

public class L11Storing2DArrays {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]arr={1,2,3,4};
		//System.out.println(arr.length);
		int[][] arr2d={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(arr2d.length);// this will give you how many references ha the given 2d array has stored.
		System.out.println(arr2d[0].length);//this will give you the length of array at 0th reference stored in the 2d arr.
		System.out.println(arr2d);//this will give you the reference of 2d arr
		System.out.println(arr2d[0]);//this will give the reference of he arr and the 0 th place.
		System.out.println(arr2d[1]);//this will give the reference of he arr and the 1 th place.
		System.out.println(arr2d[2]);//same
	}

}
