package handyPrograms;

import java.util.StringTokenizer;

public class Dummy_File {
	
	public static void main(String[] args)
	
	{
		//ways to reverse a string
		//1, using StringTokenizer class
		//2, using Split Method
		//3, getBytes method
		//4, Built in reverse method of String Builder class
		//5, using tochararray
		//6, Using collections.reverse of arrayList
		
		//cross conversion
		
		StringBuilder sb=  new StringBuilder("Hello there");
		String conv = sb.toString();
		StringTokenizer st= new StringTokenizer(conv);
		StringBuffer sbf = new StringBuffer(conv);
		sbf.toString();
		
		sb.reverse();
		
	}

}
