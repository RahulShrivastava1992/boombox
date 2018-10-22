package handyPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator_Example 
{
	public static void main(String[] args)
	{
	ArrayList lst = new ArrayList();
	for (int i =0;i<10;i++)
	
		lst.add(i);
		
	System.out.println(lst);
	ListIterator iter = lst.listIterator();
	while(iter.hasNext())
	{
		int val=(Integer)iter.next();
		System.out.print(val + " ");
		if(val%2==0)
		{
			
			iter.set(100);
			//iter.add(100);
			
		}
		
	}
	System.out.println();
    System.out.println(lst);
		
	}
}


//Java program to demonstrate ListIterator


