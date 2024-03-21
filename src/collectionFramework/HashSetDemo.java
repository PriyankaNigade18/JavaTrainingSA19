package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo
{
	/*
	 * HashSet is class implement Set interface
	 * Underline data structure is HashTable
	 * In Hash table objects stored as per hashing mechanism
	 * 
	 * what is hash code for null object= 0
	 * 
	 * Node
	 * ======
	 * key|hash code|object|address of next
	 * 
	 * HashTable internally create 16 virtual segment 0 to 15
	 * 
	 * HasSet is not ordered collection
	 * Duplication is not allowed!
	 */

	public static void main(String[] args)
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(40);
		hs.add(30);
		hs.add(null);
		
		System.out.println("Is set empty?: "+hs.isEmpty());
		System.out.println("Total elements: "+hs.size());
		
		System.out.println(hs);
		
		
		System.out.println("Is set contains null?: "+hs.contains(null));
		
		System.out.println("Is set contains 11?: "+hs.contains(11));
		
		hs.remove(null);
		System.out.println(hs);
		
		
		ArrayList<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(30);
		
		System.out.println(ls);
		
		/*
		 * To remove duplicates elements from list
		 * convert list into set
		 */
		
		//passing list into constructor of set
		//HashSet<Integer> set1=new HashSet<Integer>(ls);
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.addAll(ls);
		System.out.println(set1);
		
		/*
		 * How to sort set elements
		 * convert set to list
		 */
		ArrayList<Integer> ls2=new ArrayList<Integer>(set1);
		
		Collections.sort(ls2);
		System.out.println(ls2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
