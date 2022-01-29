package test;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		//Division of 2 int numbers result in int number. Need to type cast the output to get output in float format
		
		int i=20;
		int j=30;
		
		float div= (float) i/j;
		
		System.out.println(div);
		
		String name= "Clean India Green India";
		
		System.out.println(name.charAt(0));
		System.out.println("String in uppercase is -" +name.toUpperCase());
		System.out.println("Total number of characters are- " +name.length());
		
	}

}
