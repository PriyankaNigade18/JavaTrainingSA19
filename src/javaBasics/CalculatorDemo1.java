package javaBasics;

public class CalculatorDemo1 
{
	
	public void add()//method with 0 parameter
	{
		int a=100,b=200;//local variable
		System.out.println("Addition is: "+(a+b));
		
	}
	
	//Dynamic code
	public void sub(int a,int b)//2 parameter method  a=500 b=50
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	public void mul(int a,int b)//a=10,b=100
	{
		System.out.println("Multiplication is: "+(a*b));
	}
	
	
	
	//Method with return keyword
	/*
	 * return keyword is used to return the value/result from method
	 * When we use return keyword we have to change return type of method
	 * 
	 * return keyword returns data to calling function
	 * 
	 */
	
	public int div(int a,int b)
	{
		return a/b;
	}
	
	public String info(String msg)
	{
		return msg;
	}
	public static void main(String[] args)
	{
		//int x=100;
		CalculatorDemo1 c1=new CalculatorDemo1();
		//calling functions
		c1.add();
		/*
		 * Compile time parameter passing 
		 * When we pass data at the time of calling that function
		 * is called compile time
		 */
		//Parameter passing without return keyword
		
		
		c1.sub(500,50);
		c1.mul(10,100);
		
		int result=c1.div(100,10);
		System.out.println("Division is: "+result);
		
		String data=c1.info("Hello All!");
		System.out.println(data);
		

	}
	

}
