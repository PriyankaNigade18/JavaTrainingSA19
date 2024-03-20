package oop.DataAbstraction;

public class HDFC extends RBIBank
{
	//individual
	public void custDetails()
	{
		System.out.println("HDFC....customers details()");
	}
	

	//inherited abstract method
	@Override
	public void rateOfInterest() 
	{

		System.out.println("HDFC.......rateOfInterest() 8%");
		
	}
	
	public static void main(String[] args)
	{

		System.out.println("Scenario1: Child class ref and child class object ");
		
		HDFC h1=new HDFC();
		h1.deposit();//inherited
		h1.widthraw();//inherited
		h1.rateOfInterest();//inherited abstract
		h1.custDetails();//individual

		
		System.out.println("Invalid : Scenario2: Parent class ref and parent class object ");

		//RBIBank r1=new RBIBank();
		
		
		System.out.println("Scenario3: Parent class ref and child class object ");
		
		RBIBank r1=new HDFC();
		r1.deposit();
		r1.widthraw();
		r1.rateOfInterest();
		
		
		

		
	}

}
