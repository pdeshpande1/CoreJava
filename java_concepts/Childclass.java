package java_concepts;

public class Childclass extends Personclass
{
	String profession;
	
	public Childclass()
	{
		
	}
	
	public Childclass(String name, int age, String profession)
	{
		super(name,age);
		this.profession=profession;
	}
	public void print()
	{
		System.out.println("Inside child class");
	}
}
