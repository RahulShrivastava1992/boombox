package handyPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;;

public class TranslateAndSort {
		static String[] array= {"Nine","Seven","Six","Five","Three","Four","Two","One","Eight","Zero"};
		
	
	public static void main(String [] args)
	{
		ArrayList number = new ArrayList<Integer>();
		//int number[]=new int[10];
		int i=0;
		System.out.println("Before Sorting");
		for(String str:array)
		System.out.print(" "+str);
		
		for(String str1:array)
		{
			
			number.add(Translator.translateToInteger(str1));
					
		}
		System.out.println("Converted numeric value");
		/*for(ArrayList<Integer> datan:number)
		{*/
			System.out.print(" "+number);
		/*}*/
		Collections.sort(number);
		System.out.println(" ");
		System.out.print(" "+number);
		System.out.println("Sorted array");
		Iterator iter = number.iterator();
		while(iter.hasNext())
		{
	
			array[i]=Translator.translateToAlphabetic(iter.next().toString());
			i++;
			
		}
		System.out.println("After Sorting");
		for(String str:array)
		System.out.print(" "+str);
		
	}
}
