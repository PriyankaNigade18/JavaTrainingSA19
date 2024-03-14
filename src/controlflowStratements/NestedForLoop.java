package controlflowStratements;

public class NestedForLoop {

	public static void main(String[] args) 
	{
		//row
		for(int num=1;num<=10;num++)
		{
			//column
			for(int i=1;i<=10;i++)
			{
				System.out.print(num*i+"\t");
			}
			System.out.println();
		}

		System.out.println("****************");
		
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();//next row
		}
		
		System.out.println("****************");
		
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();//next row
		}
		
		
		
		
		
	}

}
