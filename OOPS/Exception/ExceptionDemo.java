package Exception;

public class ExceptionDemo {
	public static int fact (int n ) throws NegativeNumberException {
		if (n<0) {
			throw new NegativeNumberException();
		}
		int ans =1;
		for (int i =2; i<=n;i++) {
			ans =ans *i;
		}
		return ans;
	}
	
	
	public static int devide (int a , int b ) throws DevideByZeroException{
		if (b==0) {
			throw new DevideByZeroException();
//			throw new  ArithmeticException();
			}
		return a/b;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stubs
//		String s = null;
//		System.out.println(s.length());
//		System.out.println(4/0);
		try {
			devide (10 ,1);
			System.out.println(fact(-3));
			System.out.println("with in try ");
		}
		catch (DevideByZeroException e) {
			// TODO Auto-generated catch block
			System.out.println("devide by zero excpetion is raised");
//			e.printStackTrace();
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			System.out.println("negative number excpetion");
//			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("genericException");
		}
		finally {//this will always happened 
			System.out.println("finally");
		}
		System.out.println("main");
	}
}
