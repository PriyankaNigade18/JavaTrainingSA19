package controlflowStratements;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args)
	{

		System.out.println("Program started!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		//validate age for voting age>=18
		
		if(age>=18)
		{
			System.out.println("Valid age!");
		}
		
		System.out.println("Program ends!");
		
		
sc.close();
		
		
		
		

	}

}
