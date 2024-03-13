package javaBasics;

import java.util.Scanner;

public class Assigment1 {

	
	public void personalDetails(String fname,String lname,char gen,long phno)
	{
		System.out.println("*****Your Personal details are*******");
		System.out.println("First name: "+fname);
		System.out.println("Last name: "+lname);
		System.out.println("Gender: "+gen);
		System.out.println("Phone number: "+phno);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fname=sc.nextLine();
		System.out.println("Enter your last name: ");
		String lname=sc.nextLine();
		System.out.println("Enter your gender: ");
		char ch=sc.nextLine().charAt(0);
		System.out.println("Enter your phone number: ");
		long phno=sc.nextLong();
		
		Assigment1 a1=new Assigment1();
		a1.personalDetails(fname,lname,ch,phno);
		
		sc.close();
		

	}

}
