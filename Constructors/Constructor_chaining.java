class ABC
{
	ABC()
	{
		this(10);
		System.out.println("Hii");
	}
	ABC(int a)
	{
		this("GAYU",20);
		System.out.println("BYE");
	}
	ABC(String x,int y)
	{
		System.out.println("HELLO");
	}
}
class Constructor_chaining
{
	public static void main(String[] args) 
	{
		ABC ob=new ABC();
	}
}
