package handyPrograms;

import java.util.ArrayList;

public class Strcpy_method_Implementation {
	
	public static void main(String[] args)
	{
		//Strcpy implementation
		/*String toCopy= "Hi I am back String";
		String dest="Copy inside me ";
		//Using predefined method
		StringBuffer sbBuffer;
		String s1 = "hello";
		String s2 = s1;
		s1 = "Something else";
		System.out.println(s1);
		System.out.println(s2);*/
		String s1, s2;

	     s1 = new String("before");
	     s2 = "after"; // This only copies s1 to s2. Am I right?

	     
	     //using arrayList
	     ArrayList<String> resStr=strcpyUsingArrayList(s1,s2);
	     //Using char array
	     int totalLength=s1.length()+s2.length();
	     char sourceArray[]=s1.toCharArray();
	     char destArray[]=s2.toCharArray();
	     char finalArray[]=strcpyUsingCharArray(sourceArray,destArray,totalLength);
	     for(int k=0;k<=totalLength-1;k++)
	     System.out.println(finalArray[k]);
	     //System.out.println(""+resStr.toString());
	    /* for(String res:resStr)
	     {
	    	 System.out.print("final result => "+res);
	     }*/
	}
private static char[] strcpyUsingCharArray(char[] sourceArray, char[] destArray, int totalLength) {
		// TODO Auto-generated method stub
	
	char finalArray[] = new char[totalLength];
	int i;
	for(i=0;i<=sourceArray.length-1;i++)
	{
		finalArray[i]=sourceArray[i];
	}
	for(int j=0;j<=destArray.length-1;j++,i++)
	{
	finalArray[i]=destArray[j];	
	}
		return finalArray;
	}
//usingArrayList
	private static ArrayList<String> strcpyUsingArrayList(String s1, String s2) {
		
		ArrayList<String> source = new ArrayList<String>();
		ArrayList<String> dest = new ArrayList<String>();
		source.add(s1);
		dest.add(s2);
		source.addAll(dest);
		return source;
		// TODO Auto-generated method stub
		
		
	}
	

}
