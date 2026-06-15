class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int n=3456;
		int rev=0;
		while(n>0)
		{
			int ld=n%10;//gives the last digit
			rev=rev*10+ld;
			n=n/10;//removes th last digit
			//System.out.println("the reversed number is:"+rev);(in understandable format)
		}
		System.out.println("the reversed number is:"+rev);
	}
}
