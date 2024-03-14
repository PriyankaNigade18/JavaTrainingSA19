package arrayDemo;

public class SingleDArray {

	public static void main(String[] args) 
	{
		//using new keyword way
		//declare array
		int sid[]=new int[5];
		//initialize array
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		//to calculate length of array use length variable
		System.out.println("Length of array is: "+sid.length);
		
		//single data 
		System.out.println(sid[3]);//104
		System.out.println(sid[2]);//0
		//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		//System.out.println(sid[5]);
		
		System.out.println("****Print all the elements********");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("***************************");
		//using literal way(constant data)
		
		int id[]= {10,20,30};
		System.out.println("Size of array is: "+id.length);
		System.out.println(id[2]);//30
		
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		
		System.out.println("for each loop");
		
		for(int i:id)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
