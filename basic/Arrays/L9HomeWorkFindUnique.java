package Arrays;
import java.util.Scanner;
public class L9HomeWorkFindUnique {
	public static int findUnique(int[] ar){
		int res = ar[0];
        for (int i = 1; i < ar.length; i++) {
            res = res ^ ar[i];
            //System.out.println(res);
	}
	System.out.println(res);
	return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i []= {2, 3, 1, 6, 3, 6, 2};
		
		findUnique(i);
		//System.out.println(i[i]);
	}

}
