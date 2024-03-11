package javaBasics;

public class EmployeeData_ThisKeywordDemo1

{
	//-this keyword used to differentiate between instance and local variable
	int empid;
	String empname;
	
	EmployeeData_ThisKeywordDemo1(int empid,String empname)//local
	{
		//Initialized/Assigning instance variable
		//local data to local variable
		empid=empid;
		empname=empname;
		//local to instance
		this.empid=empid;
		this.empname=empname;
		
		
	}
	public void show()
	{
		System.out.println(this.empid);
		System.out.println(this.empname);
	}

	public static void main(String[] args)
	{
		EmployeeData_ThisKeywordDemo1 e1=new EmployeeData_ThisKeywordDemo1(101,"Pooja");
		e1.show();
		
		EmployeeData_ThisKeywordDemo1 e2=new EmployeeData_ThisKeywordDemo1(201,"Amit");
		e2.show();

	}

}
