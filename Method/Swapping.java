class Swapping 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println("before swapping");
		System.out.println("a is:"+a);
		System.out.println("b is:"+b);
		a=a+b-(b=a);
		System.out.println("after swapping");
		System.out.println("a is:"+a);
		System.out.println("b is:"+b);
		
	}
}
