package javaBasics;

public class ConstructorDemo
{
	//instance variable
	int id;
	String name;
	
	ConstructorDemo()
	{
		System.out.println("Default constructor is calling!");
		System.out.println(id);
		System.out.println(name);
	}
	
	ConstructorDemo(int i,String n)//i=101 n=Pooja
	{
		System.out.println("Parameterized constructor is calling!");
		id=i;
		name=n;
		System.out.println(id);
		System.out.println(name);
		
	}
	//method
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args)
	{

		ConstructorDemo c1=new ConstructorDemo();//calling constructor
		c1.show();
		//calling parameterized constructor
		ConstructorDemo c2=new ConstructorDemo(101,"Pooja");
		c2.show();
	}

}
