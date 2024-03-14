package controlflowStratements;

public class WhileLoopDemo {

	public static void main(String[] args)
	{
		// Hello 10 times
		
		int i=1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}

		
		System.out.println("************************");
		
		
		//sum of digits
		
		
		int num=123,rem,sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
			
		}
		
		System.out.println(sum);
		
		System.out.println("**************Do While**********");
		
		int x=1;
		do
		{
			System.out.println("Hello");
			x++;
		}while(x<=10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
