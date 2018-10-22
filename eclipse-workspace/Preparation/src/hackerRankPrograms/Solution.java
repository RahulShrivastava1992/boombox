package hackerRankPrograms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
  
       static int[] arri = new int[5];

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
    	  int[] arr = new int[n];
        //reading the queries of length queries.length
        int a,b,k,max=0;
        int qlength= queries.length;
      
        for(int i=0;i<qlength;i++)
        {
           // for(int j=0; j<3;j++)
            {
                a=queries[i][0];
                b=queries[i][1];
                k=queries[i][2];
             arr = solveExpression(a,b,k,n,arr);
            }
        }
       
         for(int p=0;p<arr.length;p++)
             {
                if(max<arr[p])
                    max=arr[p];
             }
   
return max;
    }
     public static int[] solveExpression(int a,int b, int k,int n,int[] arr)
    {
      // if(a>n && b>n)
     //  {
     //      break;
     //  }
      //   else 
        for(int l=a-1;l<=b-1;l++)
        {
            arr[l]=arr[l]+k;
             //System.out.println("arr final "+arr[l]);
        }
         
            
       return arr;
    }
     
     public static void main(String[] args)
     {
    	 int n=10;
    	int arr[] = new int[n];
    	int queries[][] = {{1,2,100},{2,5,100},{3,4,100}};
    	long max= Solution.arrayManipulation(n, queries);
    	System.out.println(max);
     }
}
