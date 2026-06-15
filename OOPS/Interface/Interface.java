interface Parent
{
	void sleep();
	String bike="Unicorn";
}
class Child implements Parent
{
	@Override
	public void sleep()
	{
		System.out.println("Sleeping");
	}
}
class Interface 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.sleep();
		Parent p=new Child();
		p.sleep();
		System.out.println(Parent.bike);
		System.out.println(Child.bike);
	}
}
