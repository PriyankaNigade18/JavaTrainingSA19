package arrayDemo;

public class LoopAssignment {

	public static void main(String[] args) 
	{
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}

		
		System.out.println("*************");
		
		for(int i=1;i<=10;i++) {
			
			if(i>=5)
			{
				System.out.print(i);
			}else
			{
			System.out.println(i);	
			}
		}
		
		
		
		
		
		
	}

}
