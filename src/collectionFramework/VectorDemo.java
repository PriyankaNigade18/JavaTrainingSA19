package collectionFramework;

import java.util.Vector;

public class VectorDemo {

	/*
	 * Vector is class implements List interface
	 * Under line data structure is Dynamic array
	 * Vector is synchronized (At a time one process)
	 * Performance wise it is slow
	 */
	public static void main(String[] args) 
	{

		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Is vector empty?: "+v1.isEmpty());
		if(v1.isEmpty())
		{
			v1.add(100);
			v1.add(200);
			v1.add(300);
			v1.add(100);
			v1.add(300);
			
			
		}
		System.out.println("Is vector empty?: "+v1.isEmpty());
		System.out.println("Total elements: "+v1.size());
		
		System.out.println("Is vector contains 100?: "+v1.contains(100));
		
		System.out.println("Is vector contains 500?: "+v1.contains(500));
		
		System.out.println(v1);
		
		//remove
		v1.remove(0);
		
		System.out.println(v1);
		
		v1.add(0,100);
		
		System.out.println("*******Iteration**********");
		
		for(Integer i:v1)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		


		

	}

}
