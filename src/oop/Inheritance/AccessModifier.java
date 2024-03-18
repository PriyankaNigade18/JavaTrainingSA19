package oop.Inheritance;

public class AccessModifier
{
	int id=101;
	public String name="Amit";
	private long phno=9866554434L;
	protected int acno=565567;

	public static void main(String[] args)
	{
		//same class
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
		

	}

}
