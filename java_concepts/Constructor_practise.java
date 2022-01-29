package java_concepts;

public class Constructor_practise {
	
	String name;
	int age;
	
	public void display ()
	{
		System.out.println("name and age are- " +name  +" "+age);
		
	}
	
	//using default constructor to display values, which will be null and 0 as we have not assigned any value to variables
	
 public static void main (String[] args)
 {
	 Constructor_practise cp1= new Constructor_practise();
	 Constructor_practise cp2= new Constructor_practise();
	 
	 cp1.display(); //here default constructor will be called which has no values for the variables
	 cp2.display();
 }
		
		
	
}
