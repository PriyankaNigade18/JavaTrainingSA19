package javaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class InputFromUSer {

	public static void main(String[] args) throws IOException
	{
		/*
		 * Scanner class java.util
		 * String----nextLine()
		 * int ----nextInt()
		 * double---nextDouble()
		 * System.in =input stream
		 * Sytem.out =Output stream
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Hello your name is: "+name+" & age is: "+age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter your age:");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		//String to int
		int age=Integer.parseInt(data);
		System.out.println(age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//read() reads data as single character abd returns its int value
		
		System.out.println("Enter your age:");
		int age=System.in.read();
		System.out.println(age);
*/
	}

}
