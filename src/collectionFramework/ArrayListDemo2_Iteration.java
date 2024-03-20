package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2_Iteration {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(50);
		System.out.println("********Simple for loop************");
		
		//get(index)
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("******** for each loop************");

		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		
		System.out.println("******** Using ietrator()************");
		/*
		 * iterator() returns Iterator interface object
		 * 
		 * hasNext():Returns true if the iteration has more elements.
		 * next():Returns the next element in the iteration.
		 */
			Iterator<Integer> ir=al.iterator();
			
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
