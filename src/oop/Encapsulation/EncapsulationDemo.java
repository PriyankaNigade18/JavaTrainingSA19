package oop.Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) 
	{

		EmployeeDetails e1=new EmployeeDetails();
		e1.display();
//		e1.id=201;
//		e1.name="Sameer";
		e1.setId(301);
		e1.setName("Abhiraj");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		//e1.display();

	}

}
