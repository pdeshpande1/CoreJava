package test;

public class Loopexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print number 1 to 10
		
		int num=1;
		
		/*while (num <=10)
		{
			System.out.println(num);
			num=num+1;
		}*/
			
		/*	while (num <=10)
		{	
			if(num ==5)
			{//num=num+1;
			continue;}
			
			System.out.println(num);
			num=num+1;
		
		}*/
			
			//for loop
			
		/*	for (num=0;num<=10;num++)
			{
				if (num==5)
					continue;
				
				System.out.println(num);
			}*/
			
			//Array with loop
			
			int arr1[]= {10,20,30,40,50,60};
			int i;
			
			/*for(i=0;i<arr1.length;i++)
			{
				System.out.println(arr1[i]);
			}*/
			
			//foreach loop
			
			for (int value:arr1)
			{
				System.out.println(value);
			}
		}
	

}
