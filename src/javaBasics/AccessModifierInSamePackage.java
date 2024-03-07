package javaBasics;

public class AccessModifierInSamePackage {

	public static void main(String[] args)
	{

		//same package different class
		AccessModifier a2=new AccessModifier();
		System.out.println("default: "+a2.id);
		System.out.println("public : "+a2.name);
		
		
		

	}

}
