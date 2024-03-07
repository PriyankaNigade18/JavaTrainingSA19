package javaBasics;

public class AccessModifier {

	int id=101;//default
	public String name="Sarang";
	private long phno=9765754587L;
	
	
	
	
	public static void main(String[] args)
	{
		//same class
		AccessModifier a1=new AccessModifier();
		System.out.println("Default: "+a1.id);
		System.out.println("Public : "+a1.name);
		System.out.println("Private: "+a1.phno);

	}

}
