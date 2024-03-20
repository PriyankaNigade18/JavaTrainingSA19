package oop.DataAbstraction;

public class Rectangle implements Shape
{
	public void intro()
	{
		System.out.println("This is Rectangle shape");
	}

	@Override
	public void areaOfshape()
	{
		System.out.println("Area of Rectangle: "+(10*5));
		
	}

}
