
package oop.DataAbstraction;

public class TestShape {

	public static void main(String[] args)
	{
			//Child class ref and child class object
		Circle c1=new Circle();
		c1.intro();
		c1.areaOfshape();//inherited abstract method
		
		System.out.println("*************************");
		Rectangle r1=new Rectangle();
		r1.intro();
		r1.areaOfshape();

			
		System.out.println("*************************");
		//Parent ref and child class object
		Shape s1=new Circle();
		s1.areaOfshape();
		
		
		
		
		
		
		

	}

}
