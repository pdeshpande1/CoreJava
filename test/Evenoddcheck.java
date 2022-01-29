package test;

import java.util.Scanner;

public class Evenoddcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		 int i=scanner.nextInt();
		 
		 if (i%2==0)
		 {System.out.println("The number is even'");}
		 else
		 {System.out.println("The number is odd");}
		 
		 scanner.close();

	}

}
