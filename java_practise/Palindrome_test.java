package java_practise;

import java.util.Arrays;

public class Palindrome_test {
	
	String str_init;
	String str_final;
	String[] arr_init;
	String[] arr_final;

	public Palindrome_test(String str_init)
	{
		this.str_init=str_init;
	}

	public void palindrome(String str_init)
	{	
		arr_init=str_init.split(" ");
		int j=arr_init.length-1;
		arr_final= new String[arr_init.length];
		
		
		for(int i=0;i<arr_init.length;i++)
		{
			if(j>=0)
			{
				arr_final[j]=arr_init[i];
				j=j-1;
			}
		}
		System.out.println("The reversed string is - " +Arrays.toString(arr_final));
		if(arr_final.equals(str_init))
		{
			System.out.println("The entered string is palindrome");
		}
		else System.out.println("The entered string is not palindrome");
		//return arr_final;
	}
	
}
