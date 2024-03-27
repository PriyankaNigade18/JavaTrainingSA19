package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	/*
	 * HashMap class implement Map interface
	 * Underline data structure is HashTable
	 * <Key : value>
	 * Entry is interface in Map
	 * As per hashing mechanism map sores value into hash table
	 * total 16 virtual segment it creates
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Lohegaon",411047);
		hm.put("Wagholi",411049);
		hm.put("Viman Nagar",411014);
		hm.put("Kharadi",411047);
		
		System.out.println("Is map empty?: "+hm.isEmpty());
		System.out.println("Total elements are: "+hm.size());
		
		System.out.println("Single key info: "+hm.get("Kharadi"));
		
		System.out.println(hm);
		
		System.out.println("Is map contains key: KalyaniNagar: "+hm.containsKey("KalyaniNagar"));
		
		System.out.println("Is map contains key: Wagholi: "+hm.containsKey("Wagholi"));
		
		
		System.out.println("Is map contains Value: 411055: "+hm.containsValue(411055));

		System.out.println(hm.containsKey("Viman Nagar"));
		
		System.out.println("**********Iteration in Map*****************");
		
		
		for(Map.Entry<String,Integer> i:hm.entrySet())
		{
			
			//System.out.println(i);
			
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		System.out.println("**************************");
		/*
		 * How to iterate map using iterator()
		 * convert map  into collection
		 * entrySet(): Set<Entry<String,Integer>>
		 */
		
		Set<Entry<String,Integer>> set1=hm.entrySet();
		Iterator<Entry<String,Integer>> ir=set1.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
