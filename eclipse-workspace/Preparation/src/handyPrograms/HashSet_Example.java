package handyPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Example {

	
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<String>();
		Set<String> set1= new HashSet<String>();
		Set<Integer> set2= new HashSet<Integer>();
		set2.add(1);
		set.add("Hello");
		set.add("Rahul");
		set.add("Hello");
		set.add("Milky");
		set1.add("Rahul");
		set1.add("dataset1");
		//set1.addAll(1);
	
		System.out.println("data without duplicate "+set);
		System.out.println("iteration for each case");
		for(String str:set)
		{
			System.out.println(str);
		}
		System.out.println("using iteraor");
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			String val = (String)itr.next();
			System.out.println("values iteratively "+val);
		}
		set.addAll(set1);
		System.out.println("Union "+set);
		set.retainAll(set1);
		System.out.println("common element"+set);
		set.remove("Hello");
		System.out.println("After removing Hello"+set);
		set.removeAll(set1);
		System.out.println("removing all"+set);
		//set.addAll(set2);
	}
}
