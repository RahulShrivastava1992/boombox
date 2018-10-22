package hackerRankPrograms;

import java.util.LinkedList;

public class ArrayRotation {
	
	
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int d=4;
		int n=a.length;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
        for(int k=n-1;k>=0;k--)
        {
            queue.add(a[k]);
        }
        System.out.println(queue.toString());
        int j=0;
        int data;
        while(queue.size()!=0 && j!=d)
        {
            data=queue.pollFirst();
            queue.addLast(data);
            j++;
        }
        System.out.println(queue.toString());
	}

}
