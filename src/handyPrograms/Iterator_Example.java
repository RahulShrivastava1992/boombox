package handyPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Example {

	
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		for(int i=0;i<=9;i++)
			list.add((i));
		System.out.println(list);
		Iterator iter= list.iterator();
		while(iter.hasNext())
		{
			int elem=(Integer)iter.next();
			if(elem%2 ==0)
			{
				iter.remove();
				System.out.println("element removed "+elem);
			}
			
			
		}
		System.out.println("final elements are = "+list);
	}
}
