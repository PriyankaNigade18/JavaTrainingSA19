package javaBasics;

public class DatatypesDemo {

	public static void main(String[] args) 
	{
		// boolean true/false 1bit
		boolean status=true;
		System.out.println("Boolean data is: "+status);
		status=false;
		System.out.println("Updated boolean data is: "+status);
		System.out.println("**********************************");
		//NUmeric--->char and Integral
		/*
		 * char is data type can store 2byte
		 * 1.single character
		 * 2.special character
		 * 3. AScii value for any character
		 * 
		 * A-Z= 65 to 90
		 * a-z= 97 to 122
		 * 0 to 9= 48 to 57
		 */
		char c1='A';
		System.out.println("Character data is: "+c1);//A
		
		char c2='#';
		System.out.println("Spcial character is: "+c2);//#
		
		char c3=90;//C3 accepting number as Ascii value for Character Z
		System.out.println("Character for Ascii 90 is: "+c3);
		
		char ch=1;
		System.out.println(ch);//char
		
		char cr='8';
		System.out.println(cr);//8
		
		char c4=120;
		System.out.println("Character for ascii 120:  "+c4);
		System.out.println("**********************************");
		//Numeric --->Integer      floating point
		//Integer -byte -->short-->int(default) --->long
		
		//byte 1byte  -128 to 127
		byte b1=125;
		
		byte b2=-128;
		
		byte b3=127;
		System.out.println("Byte data is: "+b1+" "+b2+" "+b3);
		//Type mismatch: cannot convert from int to byte
		//byte b4=130;
		
		
		//short 2byte  -32768 to 32767
		short s1=130;
		System.out.println("short data is: "+s1);
		
		short s2=-32768;
		System.out.println("short data is: "+s2);

		short s3=32767;
		System.out.println("short data is: "+s3);

		//Type mismatch: cannot convert from int to short
		//short s4=50000;
		//int 4byte 
		int i1=50000;
		System.out.println("Integer data is: "+i1);
		int i2=9868755;
		System.out.println("Integer data is: "+i2);
		//The literal 9999999999 of type int is out of range 
		//int i3=9999999999;
		
		//long 8byte
		long l1=9999999999L;
		System.out.println("Long data is: "+l1);
		
		System.out.println("**********************************");

		/*
		 * Floating point 
		 * 1. float 4byte 
		 * 2. double 8byte (default)
		 */
		
		
		double d1=89.789876;
		System.out.println("Double type data is: "+d1);
		
		float f1=56.667F;
		System.out.println("Float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
