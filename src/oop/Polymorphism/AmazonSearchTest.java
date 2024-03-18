package oop.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args)
	{

		AmazonSearch a1=new AmazonSearch();
		a1.search("Iphone");
		a1.search(90000);
		a1.search("Watch", 20000);
		a1.search(10000,"bag");
		a1.search("bag","Zara");

	}

}
