package javaBasics;

import java.util.Scanner;

public class ParameterpassingatRuntime
{
	public void addition(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}

	public int sub(int a,int b)
	{  
		int c=a-b;
		return c;
	}
	
	public static void main(String[] args)
	{
		//SCanner class Object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		//class level object
		ParameterpassingatRuntime p1=new ParameterpassingatRuntime();
		//Run time parameter passing
		p1.addition(num1, num2);
		int res=p1.sub(num1, num2);
		System.out.println("Subtraction is: "+res);

	}

}
