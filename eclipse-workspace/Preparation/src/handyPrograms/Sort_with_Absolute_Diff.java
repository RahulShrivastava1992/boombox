package handyPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sort_with_Absolute_Diff {
	static SortedMap<Integer,Integer> map =new TreeMap<Integer,Integer>();
	static TreeMap<Integer, Integer> tmap =  new TreeMap<Integer, Integer>();
	static HashMap<Integer, Integer> hmap =  new HashMap<Integer, Integer>();
	static List<Integer> l = new ArrayList<Integer>();
	public static void main(String args[])
	{
	    int arr[] = {10, 5, 3, 9 ,2};
	    int n = arr.length;
	    int x = 7;
	 
	    rearrange(arr, n, x);
	    
	    printArray(arr, n);
	    
	}
	
	public static void rearrange(int arr[],int n,int x)
	{
		
		for(int i=0;i<n;i++)
		{
			tmap.put(arr[i],Math.abs(x-arr[i]));
		}
		
	}
	public static void printArray(int arr[],int n)
	{
		
		
		for (Map.Entry<Integer,Integer> entry : tmap.entrySet())
		{
			
			System.out.println("value ="+entry.getValue()+" keys == "+entry.getKey());
		
		
			l.add(entry.getValue());
		}
		Collections.sort(l);
		System.out.println();
		for (Map.Entry<Integer,Integer> entry : tmap.entrySet())
		{
			
			for(int i=1;i<l.size();i++)
			if(entry.getValue()==l.get(i))
			{
				System.out.println("final list= "+entry.getKey());
			}
		
		
			
		}
		
		
	}
}
