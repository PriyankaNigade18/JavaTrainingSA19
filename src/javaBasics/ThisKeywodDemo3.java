package javaBasics;

public class ThisKeywodDemo3 {
//-used to invoked any constructor
	
	ThisKeywodDemo3()
	{    //this("Amit");
		System.out.println("Default constructor is calling!");
		//Constructor call must be the first statement in a constructor
		//this("Amit");
	}
	
	ThisKeywodDemo3(String name)
	{
		this();
		System.out.println("Parameterized constructor is calling!: "+name);
	}
	
	public static void main(String[] args)
	{
		//ThisKeywodDemo3 t1=new ThisKeywodDemo3();//default
		ThisKeywodDemo3 t1=new ThisKeywodDemo3("Neha");//parameterized


	}

}
