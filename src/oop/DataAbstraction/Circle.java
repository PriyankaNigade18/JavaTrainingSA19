package oop.DataAbstraction;

public class Circle implements Shape
{
	public void intro()
	{
		System.out.println("This is circle shape");
	}
	
	
	@Override
	public void areaOfshape()
	{
		//x=200;//The final field Shape.x cannot be assigned
		System.out.println(x);
		System.out.println(" Area of Circle is: "+(3.14*4*4));
	}

}
