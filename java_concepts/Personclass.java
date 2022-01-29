package java_concepts;

public class Personclass 
{
	public String name;
	public int age;
	
	public Personclass()
	{
		
	}
	public Personclass(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Inside parent class");
	}
}
