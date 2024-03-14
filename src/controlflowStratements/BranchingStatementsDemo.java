package controlflowStratements;

public class BranchingStatementsDemo
{
	public static String test()
	{
		return "Branching statement completed!";
	}

	public static void main(String[] args) 
	{
//		if(true)
//		{
//			break;
//		}
		
		// break - exit from loop and switch body
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}else
			{
				System.out.println(i);
			}
			
		}
		System.out.println("done!");

		System.out.println("***********************");
		
		//continue- skip the part of code and continue with next iteration
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("********************");
		
		String res=test();
		System.out.println(res);
		
		
		
		
		
		
		
		
	}

}
