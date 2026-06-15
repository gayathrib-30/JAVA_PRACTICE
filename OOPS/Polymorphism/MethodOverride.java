class Mother
{
	void sing()
	{
		System.out.println("Likes Classical Songs");
	}
		void dance()
	{
		System.out.println("Likes Folk dance");
	}
}
class Daughter extends Mother
{
	void sing()
	{
		System.out.println("Likes rap Songs");
	}
	void dance()
	{
		System.out.println("Likes break dance");
	}
}

class MethodOverride 
{
	public static void main(String[] args) 
	{
		//it takes the object reference and execute based on that
		Mother m1=new Mother();
		m1.dance();
		m1.sing();
		System.out.println("---------------");
		Daughter d1=new Daughter();
		d1.sing();
		d1.dance();
		System.out.println("---------------");
		Mother m2=new Daughter(); //upcasting
		m2.dance();
		m2.sing();
	}
}
