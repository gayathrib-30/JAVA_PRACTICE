class Palindrome 
{
	public static void main(String[] args) 
	{
		int n=121;
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int ld=n%10;
			rev=rev*10+ld;
			n=n/10;
		}
		if(rev==temp)
			System.out.println("it is palindrome");
		else
			System.out.println("it is not a palindrome");
	}
}