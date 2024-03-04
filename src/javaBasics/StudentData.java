package javaBasics;

public class StudentData 
{
	//data
	int id;
	String name;
		//function
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
		public static void main(String[] args) 
	{
		//calling function-Object creates inside main()
		StudentData s1=new StudentData();
		/*
		 * how to access member of a class?
		 * Using object name and . operator
		 */
		//s1.show();//initially default value it returns
		s1.id=101;
		s1.name="Amit";
		s1.show();
		
		System.out.println("****************");
		
		
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Seema";
		s2.show();
		
		
		
		
		
		

	}

}
