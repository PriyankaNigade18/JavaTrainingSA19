package controlflowStratements;

public class ReverseNumber {

	public static void main(String[] args)
	{
			int num=123456,rem,sum=0;
			
			while(num>0)
			{
				rem=num%10;
				num=num/10;
				sum=sum*10+rem;
			}

			System.out.println(sum);
	}

}
