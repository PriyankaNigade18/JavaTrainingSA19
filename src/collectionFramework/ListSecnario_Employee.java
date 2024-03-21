package collectionFramework;

import java.util.ArrayList;

public class ListSecnario_Employee {

	public static void main(String[] args) 
	{

		Employee e1=new Employee(101,"Amit");
		Employee e2=new Employee(102,"Smita");
		Employee e3=new Employee(103,"Kiran");
		
		//create list of employee
		
		ArrayList<Employee> allemp=new ArrayList<Employee>();
		allemp.add(e1);
		allemp.add(e2);
		allemp.add(e3);
		
		//System.out.println(allemp);
		
		for(Employee i:allemp)
		{
			System.out.println(i.id+" : "+i.name);
		}
		
		
		
		
		

	}

}
