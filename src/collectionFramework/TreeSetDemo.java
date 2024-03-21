package collectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {

	/*
	 * TreeSet is class implement SortedSet which extends Set interface
	 * Underline data structure is Search tree
	 * HashSet is faster than TreeSet
	 * 
	 * 
	 */
	public static void main(String[] args)
	{

		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(2);
		ts.add(8);
		ts.add(7);
		ts.add(4);
		ts.add(20);
		ts.add(5);
		ts.add(3);
		ts.add(1);
		
		System.out.println("Total elements are: "+ts.size());
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		
		System.out.println("Less than element than 10: "+ts.headSet(10));
		
		
		System.out.println("Greater than  and equal to element than 10: "+ts.tailSet(10));

		System.out.println("Subset: "+ts.subSet(1,10));
		
		
		
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Zara");
		ts1.add("Pooja");
		ts1.add("Sameer");
		ts1.add("Amit");
		
		System.out.println(ts1);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
