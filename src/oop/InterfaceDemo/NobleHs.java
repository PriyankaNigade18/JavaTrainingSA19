package oop.InterfaceDemo;

//Multiple inheritance
public class NobleHs implements IMA,USMA
{

	public void medical()
	{
		System.out.println("NobleHS......Medical()");
	}

	@Override
	public void physio() {

		System.out.println("NobleHs ......physio()");
		
	}

	@Override
	public void cardio() {

		System.out.println("NobleHs......Cardio()");
		
	}

	@Override
	public void nero() {

		System.out.println("NobleHs.......nero()");
		
	}

	@Override
	public void dental() {
		System.out.println("NobleHs.......dental()");
		
	}

	@Override
	public void covid19Test() {

		System.out.println("NobleHs.....Covid19Test");
		
	}
	
}
