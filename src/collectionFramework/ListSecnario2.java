package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSecnario2 {

	public static void main(String[] args) 
	{
		/*
		 * Arrays is class in java
		 * 
		 */

		List<Integer> l1=Arrays.asList(10,20,30);
		
		List<Integer> l2=Arrays.asList(40,50,60);
		
		List<Integer> l3=Arrays.asList(70,80,90,100);
		
		
		System.out.println("List1:"+ l1);
		System.out.println("List2:"+ l2);
		System.out.println("List3:"+ l3);
		
		
		ArrayList<List<Integer>> finallist=new ArrayList<List<Integer>>();
		finallist.add(l1);
		finallist.add(l2);
		finallist.add(l3);
		
		System.out.println(finallist);
		
		System.out.println("**************************************");

		ArrayList<Integer> ls=new ArrayList<Integer>();
		ls.addAll(l1);
		ls.addAll(l2);
		ls.addAll(l3);
		
		System.out.println(ls);
		
		Collections.reverse(ls);
		System.out.println(ls);
		
		
	}

}
