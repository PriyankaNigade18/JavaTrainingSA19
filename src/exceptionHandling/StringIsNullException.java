package exceptionHandling;

public class StringIsNullException extends Exception
{
	public StringIsNullException(String msg)
	{
		super("String is null !");
	}
	
}
