package handyPrograms;



//Java program to demonstrate search
//operations on List interface
import java.util.*;

public class ArrayList_Search
{
 public static void main(String[] args)
 {
     // type safe array list, stores only string
     List<String> l = new ArrayList<String>(5);
     l.add("Geeks");
     l.add("for");
     l.add("Geeks");
     l.add("Geeks");

     // Using indexOf() and lastIndexOf()
   
     int index=l.indexOf("Geeks");
     if(index>=0)
    	 index++;
     List<String> range = new ArrayList<String>();
     
     // return List between 2nd(including)
     // and 4th element(excluding)
     range = l.subList(1, 4);
     System.out.println("second index of Geeks:" +
             l.indexOf("Geeks"));
     System.out.println("last index of Geeks:" +
                            l.lastIndexOf("Geeks"));
     System.out.println("Index of element not present : " +
                             l.indexOf("Hello"));
     System.out.println(range);
 }
}