package test;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number to be reversed");
		int num=sc.nextInt();
		int num1=0;
		System.out.println(num);
		int remainder=0;
		
		/*while (num>0)   //here we cannot use for loop, since we dont know the start and end point
		{
			remainder=num%10;
			num=num/10;
			num1=num1*10+remainder;
		}*/
		
		//Another logic is convert it to string, and then iterate through all characters.
		
		System.out.println("The reversed number is = " +num1);
		
		String str= String.valueOf(num);
		
		
		

	}

}
