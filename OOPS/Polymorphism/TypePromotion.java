class A
{
	//here if integer is not there then the folat output will be dispalyed y because of the preference (which datatype is next to which)
	/*void m1(int a,int b)
	{
		
		System.out.println("hello");
	}*/
	void m1(double a,double b)
	{
		
		System.out.println("Hii");
	}
	void m1(float a,float b)
	{
		
		System.out.println("bye");
	}
}
//this is not possible because here it is confused to call either float or double which need to be called first
/*class B
{
	void m2(float a,double b)
	{
		System.out.println("Good morning");
	}
	
	void m2(double a,float b)
	{
		System.out.println("Goodmorning");
	}
}*/
class TypePromotion 
{
	public static void main(String[] args) 
	{
		A ob=new A();
		ob.m1(10,20);
		/*B ob1=new B();
		ob1.m2(10,20);*/
	}
}
