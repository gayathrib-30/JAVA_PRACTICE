class Harry
{
	int x=10;
}
class A  extends Harry
{
	int y=20;
}
class B  extends Harry
{
	int z=30;
}
class C  extends Harry
{
	int w=40;
}

class Downcasting 
{
	public static void main(String[] args) 
	{
		System.out.println("CLASS A"); //for my reference
		Harry h1=new A(); //upcasting-->in this we are taking parent class reference instead of child class reference
		System.out.println(h1.x); //possible
		//System.out.println(ob.y);--not possible to acquire the properties of each child class so we are doing downcasting
		System.out.println("---------------------------------------");
		A ob1=(A)h1; //downcasting
		System.out.println(ob1.x); //possible--both possible
		System.out.println(ob1.y); //possible
		System.out.println("CLASS B");
		Harry h2=new B();
		B ob2=(B)h2;
		System.out.println(ob2.x);
		System.out.println(ob2.z); 
		
	}
}
