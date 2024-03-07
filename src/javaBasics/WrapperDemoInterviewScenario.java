package javaBasics;

public class WrapperDemoInterviewScenario {

	public static void main(String[] args)
	{
		//Object to primitive

		//String s1="100ABCD";
		String s1="100";
		System.out.println(s1+100);//100ABCD100
		
		//result=200
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		
		
		String s2="67.77";
		System.out.println(s2+11.11);//67.7711.11
		
		double dd=Double.parseDouble(s2);
		System.out.println(dd+11.11);//78.88
		
		
		//String to char ---charAt(index)
		String s3="Hello";
		char ch=s3.charAt(3);
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
		//primitive to String object
		
		int a=200;
		System.out.println(a+200);//400
		
		String ss1=String.valueOf(a);
		System.out.println(ss1+200);//200200
		
		
		
		
		
		
		


	}

}
