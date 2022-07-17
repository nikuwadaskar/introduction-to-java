
public class L7Break_Continue_Keyword {

	public static void main(String[] args) {
		int n=5;
//	      for(int i=1;i<=n;i++){
//	          for(int j=1;j<=n;j++){
//	              if(i+1==j){
//	              break;
//	              //return;
//	              }
//	              System.out.print(j+" ");
//	          } System.out.println();
//	          
//    
//		for(int i=1;i<=n;i++;){
//	          
//            if(i==4){
//            
//            continue;
//            }
//            System.out.println(i);
//  }
//    System.out.println();
//	}
		int i=1;
		while (i<=n) {
			if (i==4) {
				continue;//this will make infinite loop
			}System.out.println(i);
			i++;
		}
}
}