package handyPrograms;


/* A Java program to illustrate working of StringTokenizer
class:*/
import java.util.*;
public class StringTokenizer_Example
{
 public static void main(String args[])
 {
     System.out.println("Using Constructor 1 - ");
     StringTokenizer st1 =
          new StringTokenizer("Hello Geeks How are you", " ");
     while (st1.hasMoreTokens())
         System.out.print(st1.nextToken());

     System.out.println("Using Constructor 2 - ");
     StringTokenizer st2 = 
          new StringTokenizer("JAVA : Code : String", " :");
     while (st2.hasMoreTokens())
         System.out.print(st2.nextToken());

     System.out.println("Using Constructor 3 - ");
     StringTokenizer st3 = 
          new StringTokenizer("JAVA : Code : String", ":",  true);
     while (st3.hasMoreTokens())
         System.out.print(st3.nextToken());
     
     StringTokenizer st4 = 
             new StringTokenizer("JAVA : Code : String", " :",  false);
        while (st3.hasMoreTokens())
            System.out.print(st4.nextToken());
 }
}