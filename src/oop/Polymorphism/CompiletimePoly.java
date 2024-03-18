package oop.Polymorphism;

public class CompiletimePoly 
{
	/*
	 * Method Overloading
	 * ==========================
	 * When same name method is declared in same class with different signature
	 * 1.Number of arguments
	 * 2.Type of arguments
	 * 3.Order of Arguments
	 * 
	 * Constructor overloading is possible 
	 * Constructor overriding is not possible
	 * 
	 * Main() Overloading possible but overriding is not possible
	 */
	
	public void add()//0 parameter
	{
		int a=100,b=200;
		System.out.println("Addition is: "+(a+b));
	}
// 1.Number of arguments
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	//2.Type of arguments
	public void add(double a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//3.Order of argument
	public void add(int a,double b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//constructors
	public CompiletimePoly ()
	{
		System.out.println("Default constructor is calling!");
	}
	
	public CompiletimePoly (String name)
	{
		System.out.println("Parameterized constructor is calling!: "+name);
	}
	
	public CompiletimePoly (int id)
	{
		System.out.println("Parameterized constructor is calling!: "+id);
	}
	
	public CompiletimePoly (String name,int id)
	{
		System.out.println("Parameterized constructor is calling!: "+name+" & id: "+id);
	}
	public static void main(String[] args) 
	{
		CompiletimePoly  c1=new CompiletimePoly ();
		c1.add();
		c1.add(100.11,100);
		c1.add(200,100.110);
		c1.add(10,10);
		c1.add(10,10,10);
		
		CompiletimePoly  c2=new CompiletimePoly ("Sameer");
		CompiletimePoly  c3=new CompiletimePoly (101);

	}

}
