package oop.InterfaceDemo;

public class TestHospital {

	public static void main(String[] args)
	{

		//parent ref and child object
		IMA i1=new NobleHs();
		i1.physio();
		i1.cardio();
		i1.covid19Test();
		
		System.out.println("*******************");
		
		//child class ref and child class object
		NobleHs n1=new NobleHs();
		n1.medical();
		n1.physio();
		n1.cardio();
		n1.dental();
		n1.nero();
		n1.covid19Test();
		
		System.out.println("*******************");

		
		USMA u1=new NobleHs();
		u1.dental();
		u1.nero();
		u1.covid19Test();
		
		
		
		

	}

}
