package javaBasics;

public class MethodDemo
{
	/*
	 * Two types of method available in Java
	 * 1.instance(): 
	 * To call instance method we need Object
	 * method define without static keyword
	 * 
	 * 2.static():
	 * To call static we don't need any object
	 * Method with static keyword is static method
	 * Static method we can call within class without class name
	 * static method we can call in other class using class name
	 */
	
	
	public void accept()
	{
	System.out.println("This is instance method!");	
	}
	
	
	
	public static void show()
	{
		System.out.println("This is static method!");
	}
	
	public static void main(String[] args)
	{
		show();
		MethodDemo.show();
		
		//Object
		MethodDemo m1=new MethodDemo();
		m1.accept();
		//The static method show() from the type MethodDemo should be accessed in a static way
		m1.show();
		
		
		
		
		
		


	}

}
