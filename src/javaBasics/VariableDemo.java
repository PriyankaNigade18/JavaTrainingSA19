package javaBasics;

public class VariableDemo 
{
	int id=101;//instance variable
	String name="Rupa";//instance variable
	static String orgName="StarAgile";
			
	/*
	 * 
	 * Instance variable get different memory for every different object
	 * Static variable get one time memory and it shares same memory with all 
	 * different objects.
	 */
	public void info()
	{
		int marks=90;//local variable
		System.out.println("marks from info(): "+marks);
		
	}
		
	public static void main(String[] args) 
	{
		 int marks=100;//local variable
		 System.out.println("marks from main(): "+marks );
		VariableDemo  v1=new VariableDemo();
		v1.info();
		
		System.out.println(v1.id);
		System.out.println(v1.name);
		System.out.println(orgName);

	}

}
