package handyPrograms;

public class ReverseNumber_Example {
	static int sum=0;
	static int r;
	public static void main(String[] args)
	{
		int result=reverse(34567);
		System.out.println("reverse = "+result);
	}
	public static int reverse(int n)
	{
		
	if(n>0)
		{
		r=n%10;
		sum=sum*10+r;
		n=n/10;
		reverse(n);
		}
	return sum;
	}
}
