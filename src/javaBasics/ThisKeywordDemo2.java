package javaBasics;

public class ThisKeywordDemo2 {

	//-used invoked method
	public void m1()
	{
		System.out.println("M1 is calling!");
		this.m2();
		//this.m3();
	}
	public void m2()
	{
		System.out.println("M2 is calling!");
		this.m3();
	}
	public void m3()
	{
		System.out.println("M3 is calling!");
		//this.m1();//Exception in thread "main" java.lang.StackOverflowError

	}
	
	
	public static void main(String[] args) {

		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.m1();
		
//		t1.m2();
//		t1.m3();

	}

}
