package javaBasics;

public class StaticVSInstnaceVAriable
{
	//int count=1 instance variable get the new memory for every object
	static int count=1;//one time memory will create 
	
	StaticVSInstnaceVAriable()
	{
		System.out.println(count);
		count++;
	}

	public static void main(String[] args) 
	{
		 StaticVSInstnaceVAriable s1=new  StaticVSInstnaceVAriable();
		 StaticVSInstnaceVAriable s2=new  StaticVSInstnaceVAriable();
		 StaticVSInstnaceVAriable s3=new  StaticVSInstnaceVAriable();
		 StaticVSInstnaceVAriable s4=new  StaticVSInstnaceVAriable();

		 StaticVSInstnaceVAriable s5=new  StaticVSInstnaceVAriable();



	}

}
