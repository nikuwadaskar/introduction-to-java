//package Arrays;
//import java.util.Scanner;
//public class L9HomeWorkSort01 {
//	public static void sortZeroesAndOne(int[] arr) {
//		for(int i = 0; i < arr.length; i++) {  
//			if (arr[i]==0) {
//				System.out.print("0"+" ");
//			}
//		}for(int i = 0; i < arr.length; i++) {
//			if (arr[i]==1) {
//				System.out.print("1"+" ");
//				
//			}
//		}
//	}
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//
//		}
//		public static void sortZeroesAndOne(int[] arr) {
//		int nextZero=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]==0){
//                int temp =arr[nextZero];
//                arr[nextZero]=arr[i];
//                    arr[i]=temp;
//                nextZero += 1;
//            }
//        }}}
//
//	}
