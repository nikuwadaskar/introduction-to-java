package DP2;
import java.util.*;
public class Test7BobAndHisString {
	
	public static void main(String[] args) {
	
	}
	


//	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in);
//		int t=scn.nextInt();
//		while(t-- > 0){
//			String s=scn.next();
//			int max=Integer.MIN_VALUE;
//			HashMap<Character, Integer> map=new HashMap<>();
//			for(int i=0; i<s.length(); i++){
//				if(map.containsKey(s.charAt(i))==false){
//					map.put(s.charAt(i), i);
//				}else{
//					int distance=i-map.get(s.charAt(i));
//					if(distance>max){
//						max=distance;
//					}
//				}
//			}
//			if(max==Integer.MIN_VALUE){
//				System.out.println(-1);
//			}else{
//				System.out.println(max-1);
//			}
//		}bobString();
//	}
//	
	
	public static void bobString() {
		
		try (Scanner s = new Scanner (System.in)) {
			int t=s.nextInt();
			while (t-->0) {
				String s1=s.next();
				int max = Integer.MIN_VALUE;
				int [] freq=new int [26];
				for (int i = 0; i < freq.length; i++) {
					freq[i]=-1;
				}
				for (int i = 0; i < s1.length(); i++) {
					int index= s1.charAt(i)-'a';
					if(freq[index]==-1) {
						freq[index]=i;
					}else {
						int diatnce =i-freq[index];
						if (diatnce>max) {
							max=diatnce;
						}
					}
				}
				if (max==Integer.MIN_VALUE) {
					System.out.println(-1);
				}else {
					System.out.println(max-1);
				}
			}
		}
		
	}

}
