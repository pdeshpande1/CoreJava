package test;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {20,30,40,50};
		
		//find the length of array
		System.out.println("The length of array is -" +arr.length);
		System.out.println("The char at position 3 is -" +arr[2]);
		
		//String array
		
		String arr1[]= {"abc", "xyz", "pqr"};
		System.out.println("array at 3rd position is - " +arr1[1]);
		
		//split function
		
		String name="Clean India Green India Love India";
		
		String arr2[]=name.split(" ");
		System.out.println("Word at 3rd position is - " + arr2[2]);
		System.out.println("length is - " + arr2.length);
		System.out.println("The new array is -" +Arrays.toString(arr2));

	}

}
