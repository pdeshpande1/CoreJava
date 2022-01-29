package test;

import java.util.Scanner;

public class Num_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter string");
		String str=sc.nextLine();
		int count=0;
		
		/*for(int i=0;i<str.length();i++)
		{
			if (str.toUpperCase().charAt(i)=='A'|| str.toUpperCase().charAt(i)=='E' || str.toUpperCase().charAt(i)=='I' 
					|| str.toUpperCase().charAt(i)=='O'
					|| str.toUpperCase().charAt(i)=='U')
			{
				count=count+1;
			}*/
		
		//Vowel count program by switch case
		
		for(int i=0;i<str.length();i++)
		{
			char temp=str.toUpperCase().charAt(i);
			switch(temp)
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':	
				count=count+1;
				break;
			default :
				count=0;
			}
				
			}
				
		
		if (count>0)
		System.out.println("The count of vowels in string is = " +count);
		else
			System.out.println("There are not vowels in string");
		
		sc.close();
	}
}	


