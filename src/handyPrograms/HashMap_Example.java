package handyPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Example {
	public static void main(String args[])
	{
	
	System.out.println(" Hash map example");
	HashMap<Integer,String> hm= new HashMap<Integer,String>();
	
	hm.put(new Integer(1), "Value 1");
	hm.put(new Integer(2), "value 2");
	hm.put(new Integer(3), "Value 3");
	Set<Map.Entry<Integer,String>> sm = hm.entrySet();
	Iterator<Map.Entry<Integer,String>> iter= sm.iterator();
	// Map.Entry<Integer,String>    --- > type
	while(iter.hasNext())
	{
		Map.Entry<Integer, String> iterEntries = iter.next();
	Integer key = (Integer)(iterEntries.getKey());
	String val = iterEntries.getValue();
	System.out.println("Key : value "+key+":"+val);
	
	
	}
	
	
	}

}

