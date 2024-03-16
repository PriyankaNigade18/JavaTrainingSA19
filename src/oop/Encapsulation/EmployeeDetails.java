package oop.Encapsulation;

/*
 * To provide access to the data we need 
 * getters and setters method
 */
public class EmployeeDetails
{
	//Encapsulation=data+functions
	//data
	private int id=101;

	private String name="Sarang";
	
	//getters() and setters()
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//Method
	public void display()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
	}

	public static void main(String[] args)
	{
		EmployeeDetails e1=new EmployeeDetails();
		e1.display();


	}

}
