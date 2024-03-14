package arrayDemo;

public class MultiDArray {

	public static void main(String[] args)
	{
		// using new keyword
		
		int id[][]=new int[2][3];
		id[0][0]=101;
		id[0][1]=102;
		
		id[1][0]=103;
		id[1][1]=104;
		
		System.out.println("Number of rows: "+id.length);//2
		//row===>cell===>value
		System.out.println("Number of columns: "+id[0].length);//3
		
		System.out.println("Single data: "+id[1][0]);//103
		
		//System.out.println(id[2][0]);//AIOBE
		
		System.out.println("Using nested for loop");
		
		for(int i=0;i<id.length;i++)//rows
		{
			for(int j=0;j<id[i].length;j++)//cells
			{
				System.out.print(id[i][j]+" ");
			}
			System.out.println();//next row
		}
		
		System.out.println("Using nested for each loop");
		
		
			for(int i[]:id)
			{
				for(int j:i)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		
		
		
		
		
		

		System.out.println("***************Literal way array***********");
		
		double marks[][]= {{15.22,22.33},{78.11,33.44},{11.55,67.55},{22.66,99.44}};
		System.out.println("Number of rows: "+marks.length);//4
		System.out.println("Number of columns: "+marks[0].length);//2
		
		System.out.println(marks[2][1]);//67.55
		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
