package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Order Confirmation:1234";
		FileOutputStream file1;
		
		try 
		{
			file1= new FileOutputStream("result.txt");
			file1.write(str.getBytes());
		}
		catch (FileNotFoundException e) {
		e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();}
		}
		

}
