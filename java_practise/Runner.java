package java_practise;

import java.util.Scanner;

public class Runner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string to verify");
		String str_init=sc.nextLine();
		
		Palindrome_test pt1= new Palindrome_test(str_init);
				
		pt1.palindrome(str_init);
		
		sc.close();
	}
}
