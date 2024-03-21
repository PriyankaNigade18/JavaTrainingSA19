package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/*
	 * LinkedHashSet is child class for HashSet class
	 * Underline data structure is doubly linked list
	 * It has features of List and Set interface
	 * It is ordered collection
	 * It never allows duplication
	 * 
	 */
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(30);
		
		System.out.println("Total Elements: "+ls.size());
		System.out.println(ls);
		
		System.out.println(ls.contains(50));
		System.out.println(ls.contains(40));
		
		ls.remove(10);
		
		System.out.println(ls);
		
		
		
		

	}

}
