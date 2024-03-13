package controlflowStratements;

public class ForLoopDemo {

	public static void main(String[] args)
	{
		//Hello statement 5 time
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}

		System.out.println("********************");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("********************");

		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
			
		}
	System.out.println("********************");

			//Print sum of 100 naturals number =5050
	int sum=0;
	for(int i=1;i<=100;i++)
	{
		sum=sum+i;
	}
	
	System.out.println("Sum is: "+sum);
	System.out.println("********************");
	//table of 5
	
	int num=5;
	for(int i=1;i<=10;i++)
	{
		System.out.println(num*i);
	}
	
	System.out.println("********************");

	
//	for(;;)//condition for for loop is true!
//	{
//		System.out.println("Hi");
//	} it will run infinite time
//	
	
	System.out.println("*************************");
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
		
		
		
		
		
	}

}
