package controlflowStratements;

import java.util.Scanner;

public class SwitchWithBrowserDemo {

	public static void main(String[] args)
	{

		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		/*
		 * InString class use toUpperCase() for upper case 
		 * and toLowerCase() for lower case
		 */
		switch(bname.toLowerCase())
		{
		case "chrome":
			System.out.println("Test case is executing on Chrome!");
			break;
		case "firefox":
			System.out.println("Test case is executing on Firefox!");
			break;
		case "edge":
			System.out.println("Test case is executing on Edge!");
			break;
			default:
				System.out.println("Wrong Browser!");
			
		}
		
		
		
		
		
		
		
		
		/*
		if(bname.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Test case is executing on Chrome!");
		}else if(bname.equalsIgnoreCase("Firefox"))
		{
			System.out.println("Test case is executing on Firefox!");
		}else if(bname.equalsIgnoreCase("Edge"))
		{
			System.out.println("Test case is executing on Edge!");
		}else
		{
			System.out.println("Please Enter valid browser name!");
		}
		*/
		
		
		
		
		/*
		 * String is an immutable class
		 * String comparison we always use method
		 * 1.equals()-case sensitive
		 * 2.equalsIgnoreCase()-not case sensitive
		 * 
		 */
		
//		String s1="Hello";
//		String s2="hello";
//		
//		System.out.println("equals():  "+s1.equals(s2));
//		System.out.println("equalsIgnoreCase(): "+s1.equalsIgnoreCase(s2));
//		

	}

}
