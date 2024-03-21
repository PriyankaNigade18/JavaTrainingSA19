package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListScenario 
{

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(200);
		al.add(10);
		al.add(80);
		al.add(11);
		al.add(100);
		al.add(40);
		
		
		System.out.println(al);
		
		/*
		 * Collection is interface
		 * Collections class which has static methods
		 * 
		 */
		
		Collections.sort(al);

		System.out.println(al);
		
		//addAll():Appends all of the elements in the specified collection 
		ArrayList<Integer> result=new ArrayList<Integer>();
		result.addAll(al);
		
		System.out.println(result);
		
		//To reverse
		
		Collections.reverse(result);
		System.out.println(result);

		//For sum of list
		Integer sum=0;
		for(int i=0;i<result.size();i++)
		{
			sum=sum+result.get(i);
		}

		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}

}
