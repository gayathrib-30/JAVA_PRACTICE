class Even
{
	public static boolean isEven(int n)
	{
		if(n%2==0)
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		int n=13;
		boolean ans=isEven(n);
		System.out.println(ans);
		if(ans==true)
			System.out.println("It is even number");
		else
			System.out.println("It is odd number");
	}
}
