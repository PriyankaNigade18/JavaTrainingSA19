package sample;

import oop.Inheritance.AccessModifier;

public class DifferntPackage extends AccessModifier
{

	public static void main(String[] args) 
	{

		AccessModifier a1=new AccessModifier();
		System.out.println(a1.name);
		
		DifferntPackage d1=new DifferntPackage();
		System.out.println(d1.name);
		System.out.println(d1.acno);
		

	}

}
