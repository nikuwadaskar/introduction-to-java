package PRACTICEpKG;

public class RECURSION {
	 

	public static void main(String[] args) {
int res=32894239;
int o=10,digit=0;
		while (res<=0) {
			digit=res%o;
			res=res/o;
            System.out.print(digit +" ");
		}
	}

}
