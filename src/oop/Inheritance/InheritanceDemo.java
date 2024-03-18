package oop.Inheritance;


class A
{
	public void m1()
	{
		System.out.println("M1() is calling!");
	}
}


class B extends A//A is parent and B is child-Single level
{
	public void m2()
	{
		System.out.println("M2() is calling!");
	}
}

class C extends B//B is parent and C is child- Multilevel Inheritance
{
	public void m3()
	{
		System.out.println("M3() is calling!");
	}
}

class D extends A// A is parent and D is child- Hierarchical
{
	public void m4()
	{
		System.out.println("M4() is calling!");
	}
}

//class X extends B,D
//{
//	
//}
public class InheritanceDemo {

	public static void main(String[] args) 
	{
			System.out.println("Scenario1: child class ref and child class object:Child+Parent");
//			B b1=new B();
//			b1.m1();//inherited
//			b1.m2();//individual 
			
			C c1=new C();
			c1.m1();//Inherited
			c1.m2();//Inherited
			c1.m3();//Individual
			
			System.out.println("Scenario2: Parent class ref and Parent class object: Only parent");
//			A a1=new A();
//			a1.m1();//individual
			
			B b1=new B();
			b1.m1();//Inherited
			b1.m2();//individual
			
			System.out.println("Scenario3: Parent class ref and child class object: Only from parent");

//			A a2=new B();
//			a2.m1();//individual
			
			
			B b2=new C();
			b2.m1();//inherited
			b2.m2();//individual
			System.out.println("Scenario4: Child class ref and Parent class object: Invalid");
			//B b2=new A();//as java always do top casting
			
			
			
	}

}
