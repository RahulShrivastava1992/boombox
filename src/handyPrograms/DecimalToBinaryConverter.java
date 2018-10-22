package handyPrograms;

import java.lang.reflect.Array;
import java.util.Stack;

public class DecimalToBinaryConverter {
	
	
	public void calculateBinary(int n )
	{
		Stack<Integer> stack = new Stack<Integer>();
		int rem;
		
		while(n!=0)
		{
			rem=n%2;
			n=n/2;
			stack.push(rem);
		}
		
		int count=0;
		for(Integer val:stack)
		{
			if(val==1)
				count++;
		}
		/*while(!stack.isEmpty())
		{
			Integer values= stack.pop();
			System.out.print(values+" ");
			//System.out.println(" ");
		}*/
		
		System.out.println("no of set bits are "+count);
		int decimal=BinaryToDecimal(stack);
		System.out.println(" decimal value is"+decimal);
		
	}
	public int BinaryToDecimal(Stack<Integer> st)
	{
		
		int Decimal=0;
		int base=1;
		for(Integer stack :st)
		{
		if(stack ==0)
		{
			Decimal = Decimal+0*base;
			base=base*2;
		}
		else
		{
			Decimal=Decimal+1*base;
			base =base*2;
		}
		}
		
		
		return Decimal;
		
	}
	
	
	public static void main(String[] args)
	{
	DecimalToBinaryConverter dcb = new DecimalToBinaryConverter();
	dcb.calculateBinary(999);
	}

}
