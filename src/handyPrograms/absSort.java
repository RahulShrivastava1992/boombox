package handyPrograms;

import java.util.*;

public class absSort
{
    public void ascendingSort(ArrayList<Integer> A, int d)
    {
 
        Collections.sort(A, new Comparator<Integer>() 
        {
            @Override
            public int compare(Integer o1, Integer o2) {
 
                if(Math.abs(o1-d) > Math.abs(o2-d))
                    return 1;
                else if(Math.abs(o1-d) < Math.abs(o2-d))
                    return -1;
                else
                    return 0;
 
            }
        });
 
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> B = new ArrayList<>();

        B.add(10);
        B.add(5);
        B.add(3);
        B.add(9);
        B.add(2);
 
        absSort obj = new absSort();
        obj.ascendingSort(B, 7);
 
        for (int i = 0; i < B.size(); i++) {
 
            System.out.print(B.get(i)+" ");
 
        }
 
    }
}
 