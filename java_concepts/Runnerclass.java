package java_concepts;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1= new Employee("Sachin",1234,2000);
		Employee emp2= new Employee("Prachi",12345,3000);
		
		/*emp1.Name= "Sachin";
		emp1.employee_id=1234;
		emp1.salary=2000;
		
		emp2.Name="Prachi";
		emp2.employee_id=12345;
		emp2.salary=3000;*/
		
		emp1.print_Data();
		
		//Personclass per1= new Personclass();
		//per1.display();
		Childclass cd1= new Childclass();
		//cd1.display();
		//cd1.print();
		Childclass cd2= new Childclass("AAA",20,"doctor");
		//Childclass cd3= new Personclass(); //incorrect way of initialization
		
		Personclass per1= new Childclass();
		Childclass cd3= new Childclass();
		
		per1.display();
		cd3.display();
		
		MethodOverloading ob= new MethodOverloading();
		ob.sum(10, 20);
		ob.sum(10, 20, 30);
		
	}

}
