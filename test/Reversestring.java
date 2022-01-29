package test;

import java.util.Arrays;
import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str1= "Clean India Green India";
		String str2="";
		
		for (int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
			
		}
			System.out.println(str2);
	}*/
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter the string");
		
		String str= sc.nextLine();
		
		System.out.println(str);
		
		String str_array[]= str.split(" ");
		
		//String str_array2[] = null;
		
		System.out.println(Arrays.toString(str_array));
		
		//String[] str_array2;//declaration of array without size
		//int size= str_array.length;
		  String[] str_array2= new String[str_array.length];
		  int j=0;
		  
		  for (int i=str_array.length-1;i>=0;i--)
		  {
				if (j<str_array.length)  
				{
					str_array2[j]=str_array[i];
					  j=j+1;
				}
			  
		  }
		  
		  System.out.println(Arrays.toString(str_array2));
		  sc.close();
	}
}
