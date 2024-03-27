package exceptionHandling;

import java.util.Scanner;

public class RuntimeExecption
{
	int id=101;
	

	public static void main(String[] args)
	{
		RuntimeExecption r1=new RuntimeExecption();
		r1=null;
		try {
		System.out.println(r1.id);//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("Check Object which is null!");
		}
		
		
		
		
		String s1="100ABS";
		try {
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+900);//1000
		}catch(NumberFormatException n1)
		{
			System.out.println("Please Enter valid String with number");
		}
		
		
		
		
		
		
		
		
		
		

		
		Scanner sc=new Scanner(System.in);
		
		/*
		System.out.println("Enter valid index between 0 to 4");
		int index=sc.nextInt();
		
		int arr[]= {10,20,30,40,50};
		try {
		System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
		}catch(Exception e)
		{
			System.out.println("Please Enter valid index!: "+e.getMessage());
		}
		
		*/
		
		
		
		
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Addition is: "+(num1+num2));
		System.out.println("Subtraction is: "+(num1-num2));
		try {
		System.out.println("Division is: "+(num1/num2));//ArithmeticException
		}catch(ArithmeticException a)
		{
			System.out.println("Please enter valid number other than 0");
		}
		System.out.println("Multiplication is: "+(num1*num2));
		
		
		

	}

}
