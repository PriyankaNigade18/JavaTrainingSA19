package oop.Inheritance;

public class ChildRunTimePoly extends ParentRunTimePoly
{
	@Override
	public void color()
	{
		System.out.println("Yellow");
	}
	
	public static void main(String[] args)
	{

		//child class ref and child class object
		ChildRunTimePoly c1=new ChildRunTimePoly();
		c1.color();//yellow
		
		
		//Parent ref and parent object
		ParentRunTimePoly p1=new ParentRunTimePoly();
		p1.color();//red
		
		//Parent ref and child object
		ParentRunTimePoly p2=new ChildRunTimePoly();
		p2.color();//Yellow
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
