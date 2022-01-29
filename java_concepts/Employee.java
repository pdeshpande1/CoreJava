package java_concepts;

public class Employee {
	
	String Name;
	int employee_id;
	int salary;
	
	public Employee(String Name, int employee_id, int salary)
	{
		this.Name=Name;
		this.employee_id=employee_id;
		this.salary=salary;
	}
	
	public void print_Data()
	{
		System.out.println("Name of the employee is " +Name);
		System.out.println("Employee id of the employee is " +employee_id);
		System.out.println("Salary of the employee is " +salary);
		
	}
	

}
