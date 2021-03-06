package handyPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

  public class frequency_sorting {
    public static void main(String[] args) {
     int array[] = {5,2,8,8,5,5,8,1,1,2};
     HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

     for (int i = 0; i < array.length; i++) 
     {
        if (data.containsKey(array[i])) 
        {
            Integer count = data.get(array[i]) + 1;
            data.put(array[i], count);
        } else 
        {
            data.put(array[i], 1);
        }
    }
     System.out.println("data before sort"+data.toString());

    Set<Entry<Integer, Integer>> set = data.entrySet();
    ArrayList<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() 
    {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
        {
            return (o2.getValue()).compareTo(o1.getValue());
        }
    });
    for (Entry<Integer, Integer> entry : list) 
    {
        System.out.println(entry.getKey() + " <-> " + entry.getValue());
    }
    

 }
}