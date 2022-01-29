package test;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int result=0;
		int[] array1= {10,20,30,40};
		
		try {
			 result= num/0;
			 System.out.println(array1[4]);
			 
		} catch(ArithmeticException  e)
		{
			System.out.println("inside arithmetic block");
			
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("inside araay out of bound block");
			
		} catch(Exception e)
		{
				System.out.println("Inside try and catch");
		}
		
		finally 
		{System.out.println("Inside finally block");}
		
		System.out.println(result);
				
	}

}
