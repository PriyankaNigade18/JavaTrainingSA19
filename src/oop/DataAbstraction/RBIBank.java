package oop.DataAbstraction;

public abstract class RBIBank
{
	
	/*
	 * Implemented method +Abstract method(method without any body)
	 * 
	 * Abstract method need to implemented by its child class
	 * 
	 *  For Abstract class we can't  create any object
	 * 
	 */
	
	public void deposit()
	{
		System.out.println("RBI......Fully implemented Deposit()");
	}
	
	public void widthraw()
	{
		System.out.println("RBI......Fully implemented widthraw()");
	}
	
	//abstract method
	public abstract void rateOfInterest();

	public static void main(String args[])
	{
		//Cannot instantiate the type RBIBank
		//RBIBank r1=new RBIBank();
		
	}
	
	
}
