package test;

import java.util.Scanner;

public class Prime_num_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int number=sc.nextInt();
		int prime=0;
		
		/*for (int i=2; i<number;i++) //starting from 2 as any nos is always divisible by 1
		{
			if(number%i==0)
			{
				prime=prime+1;
				break;
			}
			
		}*/
		
		for (int i=2; i<number/2;i++)
		{
			if(number%2==0)
			{
				prime=1;
				break;
			}
		}
		if (prime==0)
		System.out.println("the number is a prime number ");
		else
			System.out.println("the number is not prime number");
		
		sc.close();

	}
	
	

}
