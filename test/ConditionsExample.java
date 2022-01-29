package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		
		System.out.println("please enter age" );
		int i=scanner.nextInt();
		
		if (i>=18)
		{System.out.println("You are eligible for voting");}
		
		else if (i==17)
		{System.out.println("Not eligible this year, try next year");}
		
		else
		{System.out.println("You are noteligible for voting, you will be eligible in - " +(18-i) +"years");}
	}

}
