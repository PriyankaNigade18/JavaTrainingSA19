package javaBasics;

public class BlockDemo 
{
	
	

	public static void main(String[] args) {

		System.out.println("Main() is calling!");

	}
	
	/*
	 * Static block is used to initialize static variable in java
	 */
	//static block 
		static
		{
			System.out.println("Static block is calling!");
		}

}
