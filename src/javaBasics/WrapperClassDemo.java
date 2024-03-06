package javaBasics;

public class WrapperClassDemo {

	public static void main(String[] args) 
	{

		/*
		 * Conversion of one type data into another type is called type casting
		 * 1.Primitive to primitive(Implicit & Explicit)
		 * 
		 * 2.Primitive to Object(Autoboxing-Wrapper class)
		 * 
		 * 3.Object to Primitive (Unboxing- Wrapper class)
		 * 
		 * Wrapper class is predefined class in java
		 * To use primitive data in the form of Object we use Wrapper class
		 * In Collection framework we use Wrapper class only
		 * 
		 * 
		 */
		
		//primitive to Object
		
		int a=100;
		System.out.println("Primitive data is: "+a);
		//Integer wrapper class
		Integer i1=Integer.valueOf(a);
		System.out.println("primitive to Object: "+i1);
		
		double d1=89.77;
		Double dobj=Double.valueOf(d1);
		System.out.println(dobj);
		
		
		//Object to primitive (Unboxing)
		Integer i2=89;//object
		int b=i2.intValue();
		System.out.println("Object(Integer) to primitive(int): "+b);
		
		Float f1=45.678F;
		float ff=f1.floatValue();
		System.out.println("FloatObject to primitive float: "+ff);
		int ii=f1.intValue();
		System.out.println("Float Object into int: "+ii);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		/*
		 * Test case is : test bill amount as 1800
		 
		String msg="Total bill is 1800 Thank you for your order!";
		int expamount=1800;
		String data=msg.split(" ")[3];
		int amount=Integer.parseInt(data);
		
		if(amount==expamount)
		{
			System.out.println("Amount matched..Test pass!");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
