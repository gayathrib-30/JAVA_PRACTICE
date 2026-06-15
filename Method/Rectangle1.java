class  Rectangle1
{
	public static void main(String[] args) 
	{
		int ans=area(20,30); // In this step we are adding int ans
		System.out.println(ans);//here we have to give the print statement
		int a=perimeter(20,30);
		System.out.println(a);
		System.out.println(ans+a);
	}
	public static int area(int length,int breadth) //instead of using the void return type we are using int
	{
		//int ans=length*breadth;
		//return ans;
		return length*breadth;//two ways ,we can use before two statements also	
	}
	public static int perimeter(int l,int b)
	{
		int a=2*(l+b);
		return a;
	}
}
