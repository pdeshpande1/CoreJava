package java_concepts;

public class MethodOverloading {

	int a;
	int b;
	int c;
	
	public void sum(int a,int b)
	{
		int result=a+b;
		System.out.println("sum is " +result);
	}
	
	public void sum(int a, int b, int c)
	{
		int result= a+b+c;
		System.out.println("sum is " +result);
	}
}
