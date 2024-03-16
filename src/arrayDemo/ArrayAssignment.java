package arrayDemo;

public class ArrayAssignment
{

	public static void main(String[] args)
	{
			Object loginData[][]={{"userN","Password"},{"Admin","admin123"},{"Amit","test123"},{"Pooja","test123"},{"Sayali","test123"}};
			System.out.println("Number of rows: "+loginData.length);
			System.out.println("Number of columns: "+loginData[0].length);

			System.out.println("Iteration using simple for loop with heading!");
			for(int i=0;i<loginData.length;i++)
			{
				for(int j=0;j<loginData[i].length;j++)
				{
					System.out.print(loginData[i][j]+"  ");
				}
				System.out.println();
			}
			
			System.out.println("Iteration using simple for loop without heading!");
			//skip the heading!
			for(int i=1;i<loginData.length;i++)
			{
				for(int j=0;j<loginData[i].length;j++)
				{
					System.out.print(loginData[i][j]+"  ");
				}
				System.out.println();
			}
			
			System.out.println("Iteration using for each loop without heading!");

			for(Object i[]:loginData)//row
			{
				for(Object j:i)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
