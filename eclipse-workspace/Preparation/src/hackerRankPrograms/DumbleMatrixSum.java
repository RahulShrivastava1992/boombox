package hackerRankPrograms;

import java.util.Queue;
import java.util.Stack;

// A simple Java program to find sum of all 
// subsquares of size k x k
class DumbleMatrixSum
{
     
    // Size of given matrix
    static final int n = 5;
     
    // A simple function to find sum of all 
    //sub-squares of size k x k in a given 
    // square matrix of size n x n
    static int hourglassSum(int[][] arr) {
    {int k=3;
    int n=arr.length;
    int max=0,max1=0;
    int largest=0;
   
    if(k>n)
    {
        return -1;
    }
    
    
    for(int i=0;i<n-k+1;i++)
    {
        for(int j=0;j<n-k+1;j++)
        {int sum2=0;
        	int sum1=0,sum3=0;
            for(int p=i;p<k+i;p++)
            {
            	for(int q=j;q<k+j;q++)
                {
            		 
            	sum1=sum1+arr[p][q];
                /*sum2=sum2+arr[p][n-p-1];
                sum3=sum3+arr[p][q/2];*/
               // System.out.println(" "+sum1);
            	
            	System.out.println("sum2"+sum2);
                }
                
            }
            
           
           
            max=(sum1);
            if(largest<max)
            {
              largest=max; 
            }
        }
    }
    
    
    return largest;

    }
    }
     
    // Driver Program to test above function
    public static void main(String arg[])
    {
        int mat[][] = {	{9, 9, 9, 0, 0 ,0},
                		{9,9 ,9 ,0, 0, 0},
                		{ 9 ,9, 9, 0, 0, 0},
                		{0, 9, 2, 10, 10, 10},
                		{ 0, 0, 0, 10 ,10, 10},
                		{ 0 ,0, -1, 10, 10, 0}};
        
         
        
        
        int k = 3;
        int res=hourglassSum(mat);
        System.out.println(""+res);
    }
}



