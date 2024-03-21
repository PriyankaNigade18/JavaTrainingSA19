package collectionFramework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	/*
	 * LinkedList is class implements List interface
	 * Underline data structure is Doubly linked list
	 * LinkedList Is best choice when operation is insertion and deletion
	 */
	public static void main(String[] args)
	{

		LinkedList<Integer> ls=new LinkedList<Integer>();
		System.out.println("List is Empty?: "+ls.isEmpty());
		
		ls.add(80);
		ls.add(10);
		ls.add(30);
		ls.add(40);
		ls.add(11);
		
		System.out.println("Total Elements: "+ls.size());
		
		
		System.out.println(ls);
		
		System.out.println("Is list contains 50?: "+ls.contains(50));
		System.out.println("Is list contains 30?: "+ls.contains(30));
		ls.addFirst(100);
		
		System.out.println(ls);
		ls.addLast(100);
		System.out.println(ls);
		
		
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		
		//sort
		Collections.sort(ls);
		
		System.out.println(ls);
		
		LinkedList<Integer> ls2=new LinkedList<Integer>();
		
		ls2.add(800);
		ls2.add(100);
		ls2.add(300);
		ls2.add(400);
		ls2.add(110);
		System.out.println(ls2);
		
		System.out.println(ls);
		
		Collections.copy(ls,ls2);
		
		//System.out.println(ls2);
		System.out.println(ls);
		
		
		
		System.out.println("*******************");
		
		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		System.out.println("*******************");

		ListIterator<Integer> lr=ls.listIterator();
		
	
		
			while(lr.hasNext())
			{
				System.out.println(lr.next());
				
				//System.out.println(lr.next());
			}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
