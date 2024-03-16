package arrayDemo;

public class StringClassDemo 
{	
	/*
	 * String is an immutable class in java(not able to update object)
	 * java.lang
	 * String is collection of characters
	 * String we can declared
	 * ========================
	 * 1.Using literal
	 * ----------------
	 *  1 Object will create inside SCP(String constant pool)
	 * 
	 * 2.Using new keyword
	 * ---------------------------
	 *  2 Objects in JVM Heap area and SCP area
	 */




	public static void main(String[] args)
	{
		String s1="Hello";//scp
		String s2=new String("Hello");//heap of JVM
		//Id from jvm
		System.out.println(s1==s2);//false
		String s3="Hello";//SCP
		System.out.println(s1==s3);//true
		s3=s3+" All";
		System.out.println(s3);//Hello All
		
		System.out.println(s1==s3);//false
		
		
		//String Methods
		
		//length()
		System.out.println("Length of s3: "+s3.length());
		
		//toUpperCase() toLowerCase()
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		/*
		 * equality between string
		 * 1.equals(): case sensitive
		 * 2.equalsIngnoreCase():not case sensitive
		 * Methods will test /compare Object data
		 * == it test ids assigned by jvm
		 *  
		 */
		
		String act="Selenium WebDriver is webUI automation library";
		
		String exp="Selenium WebDriver is webUI Automation Library";

		System.out.println("Using equals(): "+act.equals(exp));//false
		
		System.out.println("Using equalsIgnoreCase(): "+act.equalsIgnoreCase(exp));
		
		//contains() partial string
		System.out.println("Exp String contains Automation?: "+exp.contains("Automation"));//true
		System.out.println("Exp string contains tool:? "+exp.contains("tool"));
		
		//String exp="Selenium WebDriver is webUI Automation Library";

		//startWith(Prefix value)  endsWith(Suffix value)
		
		System.out.println("Exp string starts with Selenium?: "+exp.startsWith("Selenium"));//true
		
		System.out.println("Exp string starts with Sel?: "+exp.startsWith("Sel"));//true

		System.out.println("Exp string starts with se?: "+exp.startsWith("se"));//false

		System.out.println("Exp string starts with M?: "+exp.startsWith("M"));//false

		
		System.out.println("Exp string ends with Library?: "+exp.endsWith("Library"));//true
		System.out.println("Exp string ends with Lib?: "+exp.endsWith("Lib"));//false

		System.out.println("Exp string ends with ry?: "+exp.endsWith("ry"));//true

		System.out.println("Exp string ends with y?: "+exp.endsWith("y"));//true

		exp="Tool "+exp;
		System.out.println("Exp string starts with Tool?: "+exp.startsWith("Tool"));//true
		
		
		
		//charAt(index)- single character for that index
		System.out.println(exp.charAt(0));//T
		
		//indexOf(char) -returns index of that first occurrence character
		System.out.println(exp.indexOf('S'));//5
		
		
		//substring( begin index)
		System.out.println(exp.substring(5));
		
		//substring(begin index,end index)=Starting from 5th and till end index-1
		System.out.println(exp.substring(5,15));//14
		
		//isEmpty()
		System.out.println(s3.isEmpty());//false
		String s4="";
		System.out.println(s4.isEmpty());//true
		
		//trim()-ignore white space before and after string
		String s5="      Welcome All       ";
		System.out.println(s5);
		System.out.println(s5.trim());
		
		
		//concat()
		String s6="Hi";
		String s7="Bye";
		System.out.println(s6.concat(" "+s7));
		System.out.println(s6+" "+s7);
		
		/*
		 * split(regular expression)-returns String[]
		 * RE is pattern matching!
		 */
		
		String tools="Selenium,Appium,Postman,JMeter";
		
		System.out.println(tools);
		
		String arr[]=tools.split(",");
		System.out.println(arr[3]);
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		
		String date="March 2024";
		String month=date.split(" ")[0];
		String year=date.split(" ")[1];
		
		System.out.println(month);
		System.out.println(year);
		
		
		
		
		String ss1="1234";
		for(int i=0;i<ss1.length();i++)
		{
			char ch=ss1.charAt(i);
			System.out.println(ch);
		}
		
		
		
		
		//How to reverse any string without method
		
		String course="Java Selenium";
		String res="";
		
		for(int i=course.length()-1;i>=0;i--)
		{
			res=res+course.charAt(i);
		}
		
		
		System.out.println(res);
		
		
		
		//How to reverse string with Method
		/*
		 * StringBuffer(thread safe) and StringBuilder (not thread safe)are mutable classes in java
		 * 
		 */
		StringBuilder br=new StringBuilder("Java");
		System.out.println(br);
		br.append(17);
		System.out.println(br);
		System.out.println(br.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
