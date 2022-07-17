import java.util.Scanner;
public class L5HomeWork_Half_Diamond_Numeric_andStarsPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rows = (2 * num) + 1;
        int n1 = ((rows)/2) + 1;
        int i = 1;
        int a = 1; 
        while(i <= n1) {
            int j = 1;
            int k = 1;
            int x = 0,y = i;
             while(j <= a)
             {
                if(j == 1 || j == a)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(k);
                    if(k == y-1 || x == 1)
                    {
                        k--;
                        x = 1; 
                    }else
                    {
                        k++;
                    }
                }
              j++;
            }
            i++;
            a = a + 2;
            System.out.println();
         }
         i = rows/2;
         a = (num*2-1);
        while(i>=0) 
        {
        	
        	int j = 1,x = 0;
        	int k = 1;
        	while(j <= a) 
        	{
        		
        		if(j == 1||j == a) 
        		{
        			System.out.print("*");
        		}
        		else 
        		{
        			System.out.print(k);
        			if(k == i-1||x == 1) 
        			{
        				k--;
        				x=1;
        			}
        			else 
        			{
        				k++;
        				
        			}
        			
        		}
        		j = j + 1;
        		
        	}
        	a = a - 2; 
       	    i--;
        	System.out.println();
            

        }
        if(num == 0){
            System.out.println("*");

        }

	}

}
