class Calculator 
{
	public static void addition()
	{
		System.out.println("This is addition method");
	}
	public static int addition(int a,int b)
	{
		System.out.println("This is addition method with two int parameters");
		return a+b;
	}
	public static float addition(float a,float b)
	{
		System.out.println("This is addition method with two float parameters");
		return a+b;
	}
	public static void addition(int a,float b,double c)
	{
		double res=a+b+c;
		System.out.println("This is addition method with three different parameters");
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		addition();
		int ans=addition(20,30);
		System.out.println(ans);
		float ans1=addition(2.5f,2.5f);
		System.out.println(ans1);
		addition(3,4.6f,6.0);
	}
}
