package handyPrograms;

public class Matrix_magic {
	static int m=3;
	static int n=3;

	public static void main(String args[])
	{
		int weight=0;
		int matrix[][]= {{0,2,3},{-1,2,-3},{3,2,0}};
		//defining initial position of man and woman
	
		try
		{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if( matrix[m][n]==matrix[m-i][n] || matrix[m][n]==matrix[m][n-i]&& matrix[m-1][n-1]>0)
				{
					matrix[i][j]=matrix[i][j];
					
					weight=weight+1;
					n=n-1;
					m=m-1;
				}
				
			}
		}
		}
		catch(Exception e)
		{
			System.out.println("exception "+e);
		}
		System.out.println("weight ="+weight);
	}
}
