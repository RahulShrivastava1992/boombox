package handyPrograms;

import java.util.Stack;

public class Sort_Stack {
	
	public void addSorted(Stack<Integer> st,int x)
	{
		if(st.isEmpty()||x>st.peek())
		{
			st.push(x);
			return;
		}
		
		int temp=st.pop();
		addSorted(st,x);
		st.push(temp);
	}
		public void sort(Stack<Integer> st)
		{
			if(!st.isEmpty())
			{
				int x=st.pop();
				sort(st);
				addSorted(st,x);
				
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
