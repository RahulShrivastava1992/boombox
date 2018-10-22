package handyPrograms;

import java.util.Arrays;

public class PairsSumInArray {
	
	public static void main(String args[])
	{
		int sum=16;
		int[] array={1,4,45,6,10,-8};
		int r=0;
		int length=array.length-1;
		int flag=0;
		Arrays.sort(array);
		while(r<length)
		{
			if(array[r]+array[length]==sum)
			{
				System.out.println("pairs are"+array[r]+" and "+array[length]);
				flag=1;
				break;
				
			}
			else if(array[r]+array[length]<sum)
				r++;
			else
				length--;
		}
		if(flag==1)
		System.out.println("Array has two pairs with sum"+sum);
		else
			System.out.println("no pairs");
		
		
	}

}
