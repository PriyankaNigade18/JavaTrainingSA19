package javaBasics;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * Conversion of one type data into another type is called type casting
		 * 1.Primitive to primitive(Implicit & Explicit)
		 * 
		 * 2.Primitive to Object(Autoboxing-Wrapper class)
		 * 
		 * 3.Object to Primitive (Unboxing- Wrapper class)
		 * 
		 * 
		 */
		
		//Primitive to primitive 
		//1.Implicit Automatic conversion (JVM) small--->large
		//byte-->short-->char-->int-->long--->float-->double
		
		byte b1=127;
		int a1=b1;
		System.out.println("byte to int : "+a1);//127
		
		char ch='B';
		int a2=ch;
		
		System.out.println("Char to int : "+a2);//66
		
		int a3=99;//4byte
		float f1=a3;//4byte
		System.out.println("int to float: "+f1);//99.0
		
		
		long l1=87755L;
		float f2=l1;
		
		System.out.println("Long to float : "+f2);
		
		//Explicit casting -Manual conversion(casting operator) large-->small
		float f3=98.78F;//4byte
		//Type mismatch: cannot convert from float to long
		long l2=(long)f3;
		System.out.println("float to long Explicit: "+l2);
		
		long l3=9999999999L;
		//ype mismatch: cannot convert from long to int
		System.out.println(l3);
		int k=(int) l3;
		System.out.println("long to int conversion: "+k);
		
				
		int i2=122;
		char ch1=(char)i2;
		System.out.println("int to char: "+ch1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
