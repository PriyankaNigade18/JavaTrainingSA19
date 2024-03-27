package exceptionHandling;

public class FinallyBlock 
{

	/*
	 * Finally block is used to execute some special code/logic
	 * with exception and without exception
	 * 
	 * try-finally
	 */
	public static void main(String[] args) 
	{

		System.out.println("Program started....");
		try {
		System.out.println(9/0);
		}catch(Exception e)
		{
			System.out.println("Write other number than 0!");
		}
		finally
		
		{
			System.out.println("Finally block executed for Special/Common code!");
		}
		System.out.println("Program ended....");

	}

}
