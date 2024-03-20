package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	/*
	 * ArrayList is class implement List interface
	 * Underline data structure is Dynamic array
	 * ArrayList is ordered collection
	 * ArrayList allow duplication
	 * 
	 * Internally ArrayList create 10vritual segment
	 * 
	 * Methods():
	 * add(),clear(),isEmpty(),contains(),size(),addAll()
	 * 
	 */
	public static void main(String[] args) 
	{

		//generic declaration
		List<Integer> al=new ArrayList<Integer>();
		
		System.out.println("Is list is empty Initially?: "+al.isEmpty());//true
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(50);
		System.out.println("Is list is empty After adding elements?: "+al.isEmpty());//false

		System.out.println("Total elements in List: "+al.size());
		
		System.out.println(al);
		
		System.out.println("Is list contains 100?: "+al.contains(100));
		
		System.out.println("Is list contains 10?: "+al.contains(10));
		
		//to remove object
		al.remove(2);//30
		
		System.out.println(al);
		
		al.add(2,30);
		System.out.println(al);
		
		al.clear();
		System.out.println("After clear()");
		System.out.println(al);//[]
		System.out.println(al.size());
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("***********************************");
		
		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Satara");
		loc.add("Mumbai");
		
		System.out.println("Total Locations: "+loc.size());
		System.out.println(loc);
		
		System.out.println("***********************************");

		ArrayList<Double> score=new ArrayList<Double>();
		score.add(89.67);
		score.add(78.66);
		
		
		System.out.println(score);
		System.out.println("Total Score: "+score.size());
		
		System.out.println("***********************************");
		
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("Sarang");
		empdata.add("Pune");
		empdata.add(20);
		empdata.add('M');
		empdata.add(67.77);
		
		System.out.println(empdata);
		
		System.out.println("************");
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
