package Recursion;

public class R1L14HomeWorkFindNumberX {
	public static boolean checkNumber(int a[], int x) {
		if(0==a.length) {
		return false;	
		}if(a[0]==x) {
			return true;
		}int []small= new int[a.length-1];
		for (int i=1;i<a.length;i++) {
			small[i-1]=a[i];
		}
		return checkNumber(small,x);
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,8,6,7,8};
		System.out.println(checkNumber(a,11));
	}

}
