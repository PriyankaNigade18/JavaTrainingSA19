package arrayDemo;

public class SingleDArrayDemo2 {

	public static void main(String[] args) 
	{

		String loc[]= {"Pune","Mumbai","Satara","Nagpur"};
		
		System.out.println("Total locations: "+loc.length);
		
		System.out.println("Simple for loop");
		
		for(int i=0;i<loc.length;i++)
		{
			System.out.println(loc[i]);
		}
		System.out.println("Using for each loop");
		
		for(String i:loc)
		{
			System.out.println(i);
		}
		
		System.out.println("**********************");
		
		int num[]= {10,20,30,40,50};
		//sum of all the numbers
		int sum=0;
		
		for(int i:num)
		{
			sum=sum+i;
		}
//		for(int i=0;i<num.length;i++)
//		{
//			sum=sum+num[i];
//		}
		
		System.out.println(sum);
		
		System.out.println("*********************");
		
		double marks[]= {40.56,89.44,67.33};
		System.out.println("Length: "+marks.length);
		
		for(double i:marks)
		{
			if(i>=80.0)
			{
			System.out.println(i);
			}
			
		}
		
		System.out.println("***********************");
		//In java Object is super class
		//Real data Object type
		Object empdata[]= {"Sarang","Pune",'M',40,9877655444L,98.77};
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
